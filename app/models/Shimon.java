package models;
 
import java.util.Date;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import javax.validation.constraints.NotNull;
 
@Entity
@PersistenceUnit(name = "mainproblem")
public class Shimon extends Model {
 
    @Id
    public Long id;
    
    //標準入出力
    @NotNull
    public boolean tag1;
    //ファイル入出力
    @NotNull
    public boolean tag2;
    //自作関数
    @NotNull
    public boolean tag3;
    //ポインタ
    @NotNull
    public boolean tag4;
    //再帰
    @NotNull
    public boolean tag5;
    //構造体
    @NotNull
    public boolean tag6;
    
    @NotNull
    public String problem_name;
    
    @NotNull
    public String solve_name;
    
    @CreatedTimestamp
    public Date createDate;
 
    @Version
    public Date updateDate;
    
    public static Find<Long,Shimon> finder = new Find<Long,Shimon>(){};
 
}