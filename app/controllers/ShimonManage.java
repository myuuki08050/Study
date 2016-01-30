package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;
import static play.data.Form.form;
import play.mvc.Security.Authenticated;
import play.cache.Cache;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import java.util.*;
import models.*;
import views.html.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
import java.io.*;
import java.net.*;

public class ShimonManage extends Controller {
    //何問出題するか
    public static final int shimon_size = 5;
    
    public static class SmallProblem {
        static String sproblem_state;
        static List<String> subprogram = new ArrayList<String>();
        static List<String> solves = new ArrayList<String>();
        
        public String getProblem(){
            return sproblem_state;
        }

        public void setProblem(String state){
            sproblem_state = state;
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
    
    @Authenticated(MySecured.class)
    public Result ShowFShimonregi(){
        return ok(shimon_fregister.render());
    }
    
    @Authenticated(MySecured.class)
    public Result ShowShimon(){
        
        List<Shimon> shimon_s = Shimon.finder.all();
        int shimon_num = 1/*shimon_s.size() */;
        int seed = 0;
        Shimon s = new Shimon();
        
        String problem_state = new String();
        List<String> program =  new ArrayList<String>();
        List<String> tags = new ArrayList<String>();
        
        String d_sp = new String();
        List <String> d_sprog = new ArrayList<String>();
        List <String> d_slv = new ArrayList<String>();
        
        String probrem_url[] = new String[2];
        
        BufferedReader br = null;
        Random rnd = new Random();
        
        //小問を扱うための内部クラス
        
        List<SmallProblem> s_problems = new ArrayList<SmallProblem>();
        
        //問題を出題中かキャッシュから判断する
        if((int)Cache.get("shimon_size") < shimon_size){
            if(Cache.get("prob_seed") == null){
                if(shimon_num > 0){
                    seed = 1 + rnd.nextInt(shimon_num);
                
                    Cache.remove("prob_seed");
                    Cache.set("prob_seed", seed);
                    
                    int ssize = (int)Cache.get("shimon_size") + 1;
                    Cache.set("shimon_size",ssize);
                
                    if(true/*seed > 0*/){
                        //s = shimon_s.get(seed);
                        try{
                            File file = Play.application().getFile("/public/problems/shimon/" + "sample_plg.txt"/*s.problem_name*/);
                            br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                    
                            //問題文の読み込み
                            problem_state = br.readLine();
                        
                            Cache.remove("problem_state");
                            Cache.set("problem_state", problem_state);
                        
                            //プログラムの読み込み
                            String tmp1 = br.readLine();
                            for(int i=0 ; i < Integer.parseInt(tmp1);i++){
                                program.add(br.readLine());
                            }
                        
                            Cache.remove("program");
                            Cache.set("program", program);
                        
                            //タグの読み込み
                            String tmp2 = br.readLine();
                            for(int i=0 ; i < Integer.parseInt(tmp2);i++){
                                tags.add(br.readLine());
                            }
                        
                            Cache.remove("tags");
                            Cache.set("tags", tags);
                        
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
                            
                            //cashによる設問出題管理
                            Cache.remove("s_problems");
                            Cache.set("s_problems", s_problems);
                            
                            Cache.remove("now_question");
                            Cache.set("now_question", 0);
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
            }
            else{
                problem_state = (String)Cache.get("problem_state");
                program = new ArrayList<String>((ArrayList<String>)Cache.get("program"));
                tags = new ArrayList<String>((ArrayList<String>)Cache.get("tags"));
                s_problems = new ArrayList<SmallProblem>((ArrayList<SmallProblem>)Cache.get("s_problems"));
            }
            
            //viewに投げる用のデータ加工
            
            int now = (int)Cache.get("now_question");
            
            if(now >= s_problems.size()){
                Cache.remove("prob_seed");
                Cache.remove("problem_state");
                Cache.remove("program");
                Cache.remove("tags");
                Cache.remove("s_problems");
                return ok(error.render("設問終了ですの"));
                
                //設問終了。別の問題へ
            }
            else{
                d_sp = s_problems.get(now).getProblem();
                for(int j=0; j<s_problems.get(now).getSubProgramNum();j++){
                    d_sprog.add(s_problems.get(now).searchProgram(j));
                }
                for(int j=0; j<s_problems.get(now).getSolveNum();j++){
                    d_slv.add(s_problems.get(now).searchSolve(j));
                }
            
                //出題するためのキャッシュを更新
                now++;
                Cache.set("now_question", now);
            }
        }
        else{
            return ok(error.render("試問終了ですの"));
        }
            
        return ok(shimon.render(problem_state,program,tags,d_sp,d_sprog,d_slv));
    }
    
    @Authenticated(MySecured.class)
    public Result CheckAnserShimon(){
        String[] params = { "solve" };
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        
        List<Shimon> shimon_s = Shimon.finder.all();
        Shimon s = new Shimon();
        int seed = (int)Cache.get("prob_seed");
        List<String> answers = new ArrayList<String>();
        BufferedReader br = null;
        
        //s = shimon_s.get(seed);
        
        if(Cache.get("slv_seed") == null){
            //s = shimon_s.get(seed);
            Cache.set("slv_seed", seed);
            try{
                File file = Play.application().getFile("/public/problems/shimon_solve/" + "sample_plg_ans.txt"/*s.solve_name*/);
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                
                //回答の読み込み
                String tmp = br.readLine();
                for(int i=0 ; i < Integer.parseInt(tmp);i++){
                    answers.add(br.readLine());
                }
                    
                Cache.remove("answers");
                Cache.set("answers", answers);
                
                Cache.remove("now_answer");
                Cache.set("now_answer", 0);
                
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
        else{
            answers = new ArrayList<String>((ArrayList<String>)Cache.get("answers"));
        }
        
        
        int now = (int)Cache.get("now_answer");
        
        if(now >= answers.size()){
            Cache.remove("slv_seed");
            Cache.remove("answers");
            Cache.remove("now_answer");
        }
        else{
            if(input.data().get("solve").equals(answers.get(now))){
                //正解によるパラメータ変化
                
                now++;
                Cache.set("now_answer", now);
                return ok(error.render("正解なのだ"));
            }
            else{
                //不正解によるパラメータ変化
                
                now++;
                Cache.set("now_answer", now);
                return ok(error.render("不正解なのだ"));
            }
        }
            
        return ok(error.render(input.data().get("solve")));
    }
    
    @Authenticated(MySecured.class)
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
        newshimon.problem_name = fileName;
        newshimon.solve_name = fileName2;
        newshimon.save();
        
        return ok(shimon_regicomplete.render());
    }
}
    
