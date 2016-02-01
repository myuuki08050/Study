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
    public static final int shimon_max = 2;
    
    public static class SmallProblem {
        List<String> sproblem_state = new ArrayList<String>();
        List<String> sproblem_condition = new ArrayList<String>();
        List<String> subprogram = new ArrayList<String>();
        List<String> solves = new ArrayList<String>();
        
        public void addProblemState(String state){
            sproblem_state.add(state);
        }
        
        public int getProblemStateNum(){
            return sproblem_state.size();
        }
        
        public String searchProblemState(int n){
            return sproblem_state.get(n);
        }
        
        public void addProblemCondition(String condition){
            sproblem_condition.add(condition);
        }
        
        public int getProblemConditionNum(){
            return sproblem_condition.size();
        }
        
        public String searchProblemCondition(int n){
            return sproblem_condition.get(n);
        }
        
        public void addProgram(String program){
            subprogram.add(program);
        }
        
        public int getProgramNum(){
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
        int shimon_num = shimon_s.size();
        int seed = -1;
        Shimon s = new Shimon();
        
        List<String> problem_state = new ArrayList<String>();
        List<String> problem_condition = new ArrayList<String>();
        List<String> program = new ArrayList<String>();
        List<String> tags = new ArrayList<String>();
        
        List <String> d_sprobst = new ArrayList<String>();
        List <String> d_sprobcon = new ArrayList<String>();
        List <String> d_sprog = new ArrayList<String>();
        List <String> d_slv = new ArrayList<String>();
        
        String probrem_url[] = new String[2];
        
        BufferedReader br = null;
        Random rnd = null;
        
        //小問を扱うための内部クラス
        
        List<SmallProblem> s_problems = new ArrayList<SmallProblem>();
        
        //問題を出題中かキャッシュから判断する
        if((int)Cache.get("shimon_size") < shimon_max){
            if(Cache.get("shimon_seed") == null){
                if(shimon_num > 0){
                    List<Integer> a_s_s  = new ArrayList<Integer>((ArrayList<Integer>)Cache.get("already_shimon_seed"));
                        do{
                            rnd = new Random();
                            seed = rnd.nextInt(shimon_num);
                        } while(a_s_s.contains(seed));
                    
                    Cache.remove("shimon_seed");
                    Cache.set("shimon_seed", seed);
                    
                    a_s_s.add(seed);
                    Cache.set("already_shimon_seed", a_s_s);
                
                    if(seed >= 0){
                        s = shimon_s.get(seed);
                        try{
                            File file = Play.application().getFile("/public/problems/shimon/" + s.problem_name);
                            br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                    
                            //問題文の読み込み
                            String tmp1 = br.readLine();
                            for(int i=0 ; i < Integer.parseInt(tmp1);i++){
                                problem_state.add(br.readLine());
                            }
                        
                            Cache.remove("shimon_state");
                            Cache.set("shimon_state", problem_state);
                            
                            //条件文の読み込み
                            String tmp2 = br.readLine();
                            for(int i=0 ; i < Integer.parseInt(tmp2);i++){
                                problem_condition.add(br.readLine());
                            }
                        
                            Cache.remove("shimon_condition");
                            Cache.set("shimon_condition", problem_condition);
                        
                            //プログラムの読み込み
                            String tmp3 = br.readLine();
                            for(int i=0 ; i < Integer.parseInt(tmp3);i++){
                                program.add(br.readLine());
                            }
                        
                            Cache.remove("shimon_program");
                            Cache.set("shimon_program", program);
                        
                            //タグの読み込み
                            String tmp4 = br.readLine();
                            for(int i=0 ; i < Integer.parseInt(tmp4);i++){
                                tags.add(br.readLine());
                            }
                        
                            Cache.remove("shimon_tags");
                            Cache.set("shimon_tags", tags);
                        
                            //小問の読み込み
                            String tmp5 = br.readLine();
                            for(int i=0 ;i<Integer.parseInt(tmp5);i++){
                                SmallProblem sp = new SmallProblem();
                                //小問用問題文
                                String tmp6 = br.readLine();
                                for(int j=0 ; j < Integer.parseInt(tmp6);j++){
                                    sp.addProblemState(br.readLine());
                                }
                                //小問用条件
                                String tmp7 = br.readLine();
                                for(int j=0 ; j < Integer.parseInt(tmp7);j++){
                                    sp.addProblemCondition(br.readLine());
                                }
                                //小問用プログラム
                                String tmp8 = br.readLine();
                                for(int j=0 ; j < Integer.parseInt(tmp8);j++){
                                    sp.addProgram(br.readLine());
                                }
                                //選択肢
                                String tmp9 = br.readLine();
                                for(int j=0 ; j < Integer.parseInt(tmp9);j++){
                                    sp.addSolve(br.readLine());
                                }
                                s_problems.add(sp);
                            }
                            
                            //cashによる設問出題管理
                            Cache.remove("shimon_s_problems");
                            Cache.set("shimon_s_problems", s_problems);
                            
                            //cachを初期化する
                            Cache.remove("shimon_now_question");
                            Cache.set("shimon_now_question", 0);
                            
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
                problem_state = new ArrayList<String>((ArrayList<String>)Cache.get("shimon_state"));
                problem_condition = new ArrayList<String>((ArrayList<String>)Cache.get("shimon_condition"));
                program = new ArrayList<String>((ArrayList<String>)Cache.get("shimon_program"));
                tags = new ArrayList<String>((ArrayList<String>)Cache.get("shimon_tags"));
                s_problems = new ArrayList<SmallProblem>((ArrayList<SmallProblem>)Cache.get("shimon_s_problems"));
            }
            
            //viewに投げる用のデータ加工
            if(Cache.get("shimon_now_question") == null){
                return ok(error.render("試問が読み出せていません。"));
            }
            
            int now = (int)Cache.get("shimon_now_question");
            
            if(now >= s_problems.size()){
                int ssize = (int)Cache.get("shimon_size") + 1;
                Cache.set("shimon_size",ssize);
                Cache.remove("shimon_seed");
                Cache.remove("shimon_state");
                Cache.remove("shimon_condition");
                Cache.remove("shimon_program");
                Cache.remove("shimon_tags");
                Cache.remove("shimon_s_problems");
                Cache.remove("shimon_now_question");
                Cache.remove("shimon_answer");
                Cache.remove("shimon_slv_seed");
                return redirect(routes.ShimonManage.ShowShimon());
            }
            else{
                d_sprobst.clear();
                for(int j=0; j<s_problems.get(now).getProblemStateNum();j++){
                    d_sprobst.add(s_problems.get(now).searchProblemState(j));
                }
                d_sprobcon.clear();
                for(int j=0; j<s_problems.get(now).getProblemConditionNum();j++){
                    d_sprobcon.add(s_problems.get(now).searchProblemCondition(j));
                }
                d_sprog.clear();
                for(int j=0; j<s_problems.get(now).getProgramNum();j++){
                    d_sprog.add(s_problems.get(now).searchProgram(j));
                }
                d_slv.clear();
                for(int j=0; j<s_problems.get(now).getSolveNum();j++){
                    d_slv.add(s_problems.get(now).searchSolve(j));
                }
            }
        }
        else{
            Cache.remove("already_shimon_seed");
            Cache.remove("shimon_size");
            return ok(error.render("試問終了ですの"));
        }
            
        return ok(shimon.render(problem_state,problem_condition,program,tags,d_sprobst,d_sprobcon,d_sprog,d_slv));
    }
    
    @Authenticated(MySecured.class)
    public Result CheckAnserShimon(){
        String[] params = { "solve" };
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        
        List<Shimon> shimon_s = Shimon.finder.all();
        Shimon s = new Shimon();
        int seed = (int)Cache.get("shimon_seed");
        List<String> answers = new ArrayList<String>();
        BufferedReader br = null;
        int now = (int)Cache.get("shimon_now_question");
        
        if(Cache.get("shimon_slv_seed") == null){
            s = shimon_s.get(seed);
            Cache.set("shimon_slv_seed", seed);
            try{
                File file = Play.application().getFile("/public/problems/shimon_solve/" + s.solve_name);
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                
                //回答の読み込み
                String tmp = br.readLine();
                for(int i=0 ; i < Integer.parseInt(tmp);i++){
                    answers.add(br.readLine());
                }
                    
                Cache.remove("shimon_answer");
                Cache.set("shimon_answer", answers);
            
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
            answers = new ArrayList<String>((ArrayList<String>)Cache.get("shimon_answer"));
        }
        
        //結果に応じてパラメータを変化させる
        List<String> tags = (ArrayList<String>)Cache.get("shimon_tags");
        int param1 = 0;
        int param2 = 0;
        int param3 = 0;
        int param4 = 0;
        int param5 = 0; 
        int param6 = 0;
        
        for(int j=0; j<tags.size();j++){
          
            //正解によるパラメータ変化
            if(input.data().get("solve").equals(answers.get(now))){
                if(tags.get(j) == null){
                    return ok(error.render("パラメータ不正"));
                }else switch(tags.get(j)){
                    case "標準入出力":
                        param1 += 10; /* 変動値 */
                        break;
                    case "ファイル入出力":
                        param2 += 10; /* 変動値 */
                        break;
                    case "自作関数":
                        param3 += 10; /* 変動値 */
                        break;
                    case "ポインタ":
                        param4 += 10; /* 変動値 */
                        break;
                    case "再帰":
                        param5 += 10; /* 変動値 */
                        break;
                    case "構造体":
                        param6 += 10; /* 変動値 */
                        break;
                    default:
                }
            }
            else{
            //不正解によるパラメータ変化
                if(tags.get(j) == null){
                    return ok(error.render("パラメータ不正"));
                }else switch(tags.get(j)){
                    case "標準入出力":
                        param1 -= 10; /* 変動値 */
                        break;
                    case "ファイル入出力":
                        param2 -= 10; /* 変動値 */
                        break;
                    case "自作関数":
                        param3 -= 10; /* 変動値 */
                        break;
                    case "ポインタ":
                        param4 -= 10; /* 変動値 */
                        break;
                    case "再帰":
                        param5 -= 10; /* 変動値 */
                        break;
                    case "構造体":
                        param6 -= 10; /* 変動値 */
                        break;
                    default:
                }
            }       
        }
        
        now++;
        Cache.set("shimon_now_question", now);
        
        return redirect(routes.ModelManage.s_changeUserModel(param1,param2,param3,param4,param5,param6));
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
        
        //データベースへの登録
        Shimon newshimon = new Shimon();
        newshimon.problem_name = fileName;
        newshimon.solve_name = fileName2;
        newshimon.tag1 = false;  
        newshimon.tag2 = false;          
        newshimon.tag3 = false;
        newshimon.tag4 = false;
        newshimon.tag5 = false;
        newshimon.tag6 = false;
        
        try{
            //ファイルを開いてタグを取り出し、データベースに登録
            File file = Play.application().getFile("/public/problems/shimon/" + fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            List<String> dummy = new ArrayList<String>();
            String tag = new String();

            //タグまでのデータを仮読み込み
            String tmp1 = br.readLine();
            for(int i=0 ; i < Integer.parseInt(tmp1);i++){
                dummy.add(br.readLine());
            }
            String tmp2 = br.readLine();
            for(int i=0 ; i < Integer.parseInt(tmp2);i++){
                dummy.add(br.readLine());
            }
            String tmp3 = br.readLine();
            for(int i=0 ; i < Integer.parseInt(tmp3);i++){
                dummy.add(br.readLine());
            }
            
            //tag
            String tmp = br.readLine();
            for(int i=0 ; i < Integer.parseInt(tmp);i++){
                tag = br.readLine();
                if(tag == null){
                    return ok(error.render("パラメータ不正"));
                }else switch(tag){
                    case "標準入出力":
                        newshimon.tag1 = true;
                        break;
                    case "ファイル入出力":
                        newshimon.tag2 = true;
                        break;
                    case "自作関数":
                        newshimon.tag3 = true;
                        break;
                    case "ポインタ":
                        newshimon.tag4 = true;
                        break;
                    case "再帰":
                        newshimon.tag5 = true;
                        break;
                    case "構造体":
                        newshimon.tag6 = true;
                        break;
                    default:    
                }
            }
        }catch (IOException ioe){
            return badRequest(ioe.toString());        
        }catch (Exception e){
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter( stringWriter );
            e.printStackTrace( printWriter );
            return badRequest(stringWriter.toString());
        }
        
        newshimon.save();
        return ok(shimon_regicomplete.render());
    }
}
    
