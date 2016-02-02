package models;
 
import java.util.Date;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import javax.validation.constraints.NotNull;
 
@Entity
@PersistenceUnit(name = "dorilproblem")
public class Doril extends Model {
 
    @Id
    public Long id;
    
    // "標準入出力"～"構造体"
    @NotNull
    public String tag;
 
    @NotNull
    public String problem_name;
    
    @NotNull
    public String solve_name;
    
    @CreatedTimestamp
    public Date createDate;
 
    @Version
    public Date updateDate;
    
    public static Find<Long,Doril> finder = new Find<Long,Doril>(){};
    
    public String toString() {
        return "Doril [id=" + id + ", tag=" + tag + ", problem_name="+ problem_name + ", solve_name"+ solve_name +", createDate=" 
        + createDate + ", updateDate=" + updateDate + "]";
    }


}