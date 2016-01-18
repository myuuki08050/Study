package models;
 
import java.util.*;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import javax.validation.constraints.NotNull;

@Entity
@PersistenceUnit(name = "default")
public class User extends Model {
    
    @Id
    public String user_id;
 
    @NotNull
    public String password;
    
    public int logintimes;
 
    public Date logindate;
 
    public Date logoutdate;
    
    public static Find<Long,User> finder = new Find<Long,User>(){};
 
    public String toString() {
        return "Parent [user_id=" + user_id + ", password=" + password + ", Logintimes=" + logintimes
               + "logindate= " + logindate + ", Logoudate=" + logoutdate + "]";
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    public List<UserModel> children = new ArrayList<UserModel>();
}