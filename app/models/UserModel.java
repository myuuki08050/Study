package models;
 
import java.util.Date;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import javax.validation.constraints.NotNull;
 
@Entity
public class UserModel extends Model {
 
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;
 
    @NotNull
    public int param1;
    
    @NotNull
    public int param2;
    
    @NotNull
    public int param3;
    
    @NotNull
    public int param4;
    
    @NotNull
    public int param5;
    
    @NotNull
    public int param6;
 
    @CreatedTimestamp
    public Date createDate;
 
    @Version
    public Date updateDate;
    
    public static Find<Long,UserModel> finder = new Find<Long,UserModel>(){};
 
    public String toString() {
        return "Child [user_id=" + user.user_id + ", param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + ", param4=" + param4 +
        ", param5=" + param5 + ", param6=" + param6 + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
    }
}