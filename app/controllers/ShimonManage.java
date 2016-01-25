package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;

import java.util.*;
 
import models.Shimon;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import java.io.*;
import java.net.*;

public class ShimonManage extends Controller {
    
    public Result ShowFShimonregi(){
        return ok(shimon_fregister.render());
    }
    
    public Result ShowShimon(){
        List<Shimon> shimon_s = Shimon.finder.all();
        int shimon_num = 1/*shimon_s.size() */;
        int seed = 0;
        Shimon s = new Shimon();
        
        String problem_state = new String();
        List<String> program =  new ArrayList<String>();
        List<String> tags = new ArrayList<String>();
        
        String probrem_url[] = new String[2];
        
        BufferedReader br = null;
        
        //小問を扱うための内部クラス
        class SmallProblem {
            private String sproblem_state;
            private List<String> subprogram = new ArrayList<String>();
            private List<String> solves = new ArrayList<String>();
            
            public String getProblem(){
                return sproblem_state;
            }

            public void setProblem(String state){
                this.sproblem_state = state;
            }
            
            public void addSubProgram(String solve){
                subprogram.add(solve);
            }
            
            public int getSubProgramNum(){
                return subprogram.size();
            }
            
            public String searchProgram(int n){
                return subprogram.get(n);
            }
            
            public void addSolve(String solve){
                solves.add(solve);
            }
            
            public int getSolveNum(){
                return solves.size();
            }
            
            public String searchSolve(int n){
                return solves.get(n);
            }
        }
        
        List<SmallProblem> s_problems = new ArrayList<SmallProblem>();
        
        if(shimon_num > 0){
            Random rnd = new Random();
            seed = 1 + rnd.nextInt(shimon_num);
            if(true/*seed > 0*/){
                //s = shimon_s.get(seed);
                try{
                    File file = Play.application().getFile("/public/problems/shimon/" + "sample_plg.txt"/*s.problem_name*/);
                    br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                
                    //問題文の読み込み
                    problem_state = br.readLine();
                    //プログラムの読み込み
                    String tmp1 = br.readLine();
                    for(int i=0 ; i < Integer.parseInt(tmp1);i++){
                        program.add(br.readLine());
                    }
                    
                    //タグの読み込み
                    String tmp2 = br.readLine();
                    for(int i=0 ; i < Integer.parseInt(tmp2);i++){
                        tags.add(br.readLine());
                    }
                    
                    //小問の読み込み
                    String tmp3 = br.readLine();
                    for(int i=0 ;i<Integer.parseInt(tmp3);i++){
                        SmallProblem sp = new SmallProblem();
                        //問題文
                        sp.setProblem(br.readLine());
                        //小問用プログラム
                        String tmp4 = br.readLine();
                        for(int j=0 ; j < Integer.parseInt(tmp4);j++){
                            sp.addSubProgram(br.readLine());
                        }
                        //選択肢
                        String tmp5 = br.readLine();
                        for(int k=0 ; k < Integer.parseInt(tmp5);k++){
                            sp.addSolve(br.readLine());
                        }
                        s_problems.add(sp);
                    }
                    br.close();
                }catch (IOException ioe){
                    return badRequest(ioe.toString());        
                }catch (Exception e){
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter( stringWriter );
                    e.printStackTrace( printWriter );
                    return badRequest(stringWriter.toString());
                }
            }
        }
        
        //viewに投げる用のデータ加工
        List <String> d_sp = new ArrayList<String>();
        List <String> d_sprog = new ArrayList<String>();
        List <String> d_slv = new ArrayList<String>();
        
      
        for(int i=0; i<s_problems.size() ;i++){
            d_sp.add(s_problems.get(i).getProblem());
            d_sp.add("\n");
            for(int j=0; j<s_problems.get(i).getSubProgramNum();j++){
                d_sprog.add(s_problems.get(i).searchProgram(j));
            }
            d_sprog.add("\n");
            for(int j=0; j<s_problems.get(i).getSolveNum();j++){
                d_slv.add(s_problems.get(i).searchSolve(j));
            }
            d_slv.add("\n");
        }
        
        return ok(shimon.render(problem_state,program,tags,d_sp,d_sprog,d_slv));
    }
    
    public Result CheckAnserShimon(){
        String[] params = { "tx_solve"};
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);    
        return badRequest("");
    }
    
    public Result MakeShimon(){
        String fileName ="";
        String fileName2 ="";
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart text = body.getFile("shimon_file");
        if (text != null) {
            fileName = text.getFilename();
            String contentType = text.getContentType();
            File file = text.getFile();
            if (contentType.equals("text/plain")) {
                String fullPath = Play.application().path().getPath() + "/public/problems/shimon";
                file.renameTo(new File(fullPath, fileName));
            }
        } 
        else {
             flash("error", "Missing file");
             return redirect(routes.ShimonManage.ShowFShimonregi());
        }
        //正答ファイルの登録
        FilePart text2 = body.getFile("s_shimon_file");
        if (text2 != null) {
            fileName2 = text2.getFilename();
            String contentType = text2.getContentType();
            File file = text2.getFile();
            if (contentType.equals("text/plain")) {
                String fullPath = Play.application().path().getPath() + "/public/problems/shimon_solve";
                file.renameTo(new File(fullPath, fileName2));
            }
        } 
        else {
             flash("error", "Missing file");
             return redirect(routes.ShimonManage.ShowFShimonregi());
        }
        
        List<Shimon> shimons = Shimon.finder.all();
        
        //データベースへの登録
        Shimon newshimon = new Shimon();
        newshimon.problem_id = shimons.size() + 1;
        newshimon.problem_name = fileName;
        newshimon.solve_name = fileName2;
        newshimon.save();
        
        return ok(shimon_regicomplete.render());
    }
}
    
