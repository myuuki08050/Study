package models;
 
import java.util.*;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import javax.validation.constraints.NotNull;

import play.data.format.*;
import play.data.validation.*;

@Entity
@PersistenceUnit(name = "default")
public class User extends Model {
    
    @Id
    public int id;

    public String user_id;
 
    public String password;
    
    public int logintimes;
 
    public boolean isAdmin;
    
    public static Find<Long,User> finder = new Find<Long,User>(){};
 
    public String toString() {
        return "Parent [id=" + id + ", user_id=" + user_id + ", password=" + password + ", Logintimes=" + logintimes
               + "isAdmin= " + isAdmin +  "]";
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    public List<UserModel> children = new ArrayList<UserModel>();
}