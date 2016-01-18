package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;

import java.util.*;
 
import models.Doril;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import java.io.*;
import java.net.*;

public class DorilManage extends Controller {
    
    public Result ShowFDorilregi(){
        return ok(doril_fregister.render());
    }
    
    public Result ShowDoril(){
        List<Doril> shimon_s = Doril.finder.all();
        int doril_num = 1/*doril_s.size() */;
        int seed = 0;
        Doril d = new Doril();
        
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
        
        if(doril_num > 0){
            Random rnd = new Random();
            seed = 1 + rnd.nextInt(doril_num);
            if(true/*seed > 0*/){
                //d = doril_s.get(seed);
                try{
                    File file = Play.application().getFile("/public/problems/doril/" + "sample_plg.txt"/*d.problem_name*/);
                    br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                
                    //問題文の読み込み
                    problem_state = br.readLine();
                    //プログラムの読み込み
                    String tmp = br.readLine();
                    for(int i=0 ; i < Integer.parseInt(tmp);i++){
                        program.add(br.readLine());
                    }
                    //タグの読み込み
                    tmp = br.readLine();
                    for(int i=0 ; i < Integer.parseInt(tmp);i++){
                        tags.add(br.readLine());
                    }
                    //小問の読み込み
                    tmp = br.readLine();
                    for(int i=0 ; i < Integer.parseInt(tmp);i++){
                        SmallProblem sp = new SmallProblem();
                        //問題文
                        sp.setProblem(br.readLine());
                        //小問用プログラム
                        tmp = br.readLine();
                        for(int j=0 ; j < Integer.parseInt(tmp);j++){
                            sp.addSubProgram(br.readLine());
                        }
                        //選択肢
                        tmp = br.readLine();
                        for(int k=0 ; k < Integer.parseInt(tmp);k++){
                            sp.addSolve(br.readLine());
                        }
                        s_problems.add(sp);
                    }
                     br.close();
                }catch (IOException ioe){
                    return badRequest(ioe.toString());        
                }catch (Exception e){
                    return badRequest(e.toString());
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
        
        return ok(doril.render(problem_state,program,tags,d_sp,d_sprog,d_slv));
    }
    
    public Result MakeDoril(){
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart text = body.getFile("doril_file");
        if (text != null) {
            String fileName = text.getFilename();
            String contentType = text.getContentType();
            File file = text.getFile();
            if (contentType.equals("text/plain")) {
                String fullPath = Play.application().path().getPath() + "/public/problems/doril";
                file.renameTo(new File(fullPath, fileName));
            }
            return ok(doril_regicomplete.render());
        } 
        else {
             flash("error", "Missing file");
             return redirect(routes.DorilManage.ShowFDorilregi());
        }
    }
}
    
