package models;
 
import java.util.Date;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import javax.validation.constraints.*;
import com.avaje.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;

@Entity
@PersistenceUnit(name = "usrmodel")
public class UserModel extends Model {
    
    @Id
    public Long id;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;
 
    @NotNull
    @Constraints.Min(0)
    @Constraints.Max(100)
    public int param1;  /* 標準入出力 */
    
    @NotNull
    @Constraints.Min(0)
    @Constraints.Max(100)
    public int param2;  /* ファイル入出力 */
    
    @NotNull
    @Constraints.Min(0)
    @Constraints.Max(100)
    public int param3;  /* 自作関数 */
    
    @NotNull
    @Constraints.Min(0)
    @Constraints.Max(100)
    public int param4;  /* ポインタ */
    
    @NotNull
    @Constraints.Min(0)
    @Constraints.Max(100)
    public int param5;  /* 再帰 */
    
    @NotNull
    @Constraints.Min(0)
    @Constraints.Max(100)
    public int param6;  /* 構造体 */
 
    @CreatedTimestamp
    public Date createDate;
 
    @Version
    public Date updateDate;
    
    public static Find<Long,UserModel> finder = new Find<Long,UserModel>(){};
 
    public String toString() {
        return "Child [id = "+ id +"user_id=" + user.user_id + ", param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + ", param4=" + param4 +
        ", param5=" + param5 + ", param6=" + param6 + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
    }
}