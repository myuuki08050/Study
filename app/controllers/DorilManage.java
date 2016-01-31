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

public class DorilManage extends Controller {
    //何問出題するか
    public static final int doril_max = 5;
    
    @Authenticated(MySecured.class)
    public Result ShowFDorilregi(){
        return ok(doril_fregister.render());
    }
    
    @Authenticated(MySecured.class)
    public Result ShowDoril(){
        
        List<Doril> doril_s = Doril.finder.all();
        int doril_num = doril_s.size();
        int seed = -1;
        Doril d = new Doril();
        
        List<String> doril_state = new ArrayList<String>();
        String doril_tag = new String();

        BufferedReader br = null;
        Random rnd = new Random();
        
        //問題を出題中かキャッシュから判断する
        if((int)Cache.get("doril_size") < doril_max){
            if(Cache.get("doril_seed") == null){
                if(doril_num > 0){
                    seed = rnd.nextInt(doril_num);
                    Cache.remove("doril_seed");
                    Cache.set("doril_seed", seed);
                    
                    int ssize = (int)Cache.get("doril_size") + 1;
                    Cache.set("doril_size",ssize);
                
                    if(seed >= 0){
                        d = doril_s.get(seed);
                        try{
                            File file = Play.application().getFile("/public/problems/doril/" + d.problem_name);
                            br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                    
                            //問題文の読み込み
                            String tmp = br.readLine();
                            for(int i=0;i < Integer.parseInt(tmp);i++){
                                doril_state.add(br.readLine());
                            }
                            
                            Cache.remove("doril_state");
                            Cache.set("doril_state", doril_state);
                        
                            doril_tag = br.readLine();
                            Cache.remove("doril_tag");
                            Cache.set("doril_tag", doril_tag);
                
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
                doril_state = new ArrayList<String>((ArrayList<String>)Cache.get("doril_state"));
                doril_tag = (String)Cache.get("doril_tag");
            }
        }
        else{
            Cache.remove("doril_size");
            Cache.remove("doril_seed");
            Cache.remove("doril_state");
            Cache.remove("doril_tag");
            Cache.remove("doril_slv_seed");
            Cache.remove("doril_solve");
            Cache.remove("doril_commentary");
            return ok(error.render("ドリル終了ですの"));
        }
            
        return ok(doril.render(doril_state,doril_tag));
    }
    
    @Authenticated(MySecured.class)
    public Result CheckAnserDoril(){
        String[] params = { "d_solve" };
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        
        List<Doril> doril_s = Doril.finder.all();
        Doril d = new Doril();
        int seed = (int)Cache.get("doril_seed");
        String doril_solve = new String();
        List<String> doril_commentary = new ArrayList<String>();
        BufferedReader br = null;
        
        if(Cache.get("doril_slv_seed") == null){
            d = doril_s.get(seed);
            Cache.remove("doril_slv_seed");
            Cache.set("doril_slv_seed", seed);
            try{
                File file = Play.application().getFile("/public/problems/doril_solve/" + d.solve_name);
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                
                //回答の読み込み
                doril_solve = br.readLine();
                Cache.remove("doril_solve");
                Cache.set("doril_solve", doril_solve);
                
                //解説の読み込み
                String tmp = br.readLine();
                for(int i=0 ; i < Integer.parseInt(tmp);i++){
                    doril_commentary.add(br.readLine());
                }
                
                Cache.remove("doril_commentary");
                Cache.set("doril_commentary", doril_commentary);
                
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
            doril_solve = (String)Cache.get("doril_solve");
            doril_commentary = new ArrayList<String>((ArrayList<String>)Cache.get("doril_commentary"));
        }
        
        if(input.data().get("d_solve").equals(doril_solve)){
            //正解によるパラメータ変化
            return redirect(routes.ModelManage.d_changeUserModel((String)Cache.get("doril_tag"),5,"true"));
        }
        else{
            //不正解によるパラメータ変化
            return redirect(routes.ModelManage.d_changeUserModel((String)Cache.get("doril_tag"),-5,"false"));
        }
    }
    
    @Authenticated(MySecured.class)
    public Result MakeDoril(){
        String fileName = "";
        String fileName2 = "";
        MultipartFormData body = request().body().asMultipartFormData();
        //ドリルの登録
        FilePart text = body.getFile("doril_file");
        if (text != null) {
            fileName = text.getFilename();
            String contentType = text.getContentType();
            File file = text.getFile();
            if (contentType.equals("text/plain")) {
                String fullPath = Play.application().path().getPath() + "/public/problems/doril";
                file.renameTo(new File(fullPath, fileName));
            }
        } 
        else {
             flash("error", "Missing file");
             return redirect(routes.DorilManage.ShowFDorilregi());
        }
        
        //正答ファイルの登録
        FilePart text2 = body.getFile("s_doril_file");
        if (text2 != null) {
            fileName2 = text2.getFilename();
            String contentType = text2.getContentType();
            File file = text2.getFile();
            if (contentType.equals("text/plain")) {
                String fullPath = Play.application().path().getPath() + "/public/problems/doril_solve";
                file.renameTo(new File(fullPath, fileName2));
            }
        } 
        else {
             flash("error", "Missing file");
             return redirect(routes.DorilManage.ShowFDorilregi());
        }
        
        //データベースへの登録
        Doril newdoril = new Doril();
        newdoril.problem_name = fileName;
        newdoril.solve_name = fileName2;
        
        try{
            //ファイルを開いてタグを取り出し、データベースに登録
            File file = Play.application().getFile("/public/problems/doril/" + fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            
            List<String> dummy = new ArrayList<String>();
            String tag = new String();

            //タグまでのデータを仮読み込み
            String tmp1 = br.readLine();
            for(int i=0; i < Integer.parseInt(tmp1);i++){
                dummy.add(br.readLine());
            }
            
            //tag
            tag = br.readLine();
            newdoril.tag = tag;
            
        }catch (IOException ioe){
            return badRequest(ioe.toString());        
        }catch (Exception e){
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter( stringWriter );
            e.printStackTrace( printWriter );
            return badRequest(stringWriter.toString());
        }
        
        newdoril.save();
        return ok(doril_regicomplete.render());
    
    }
}