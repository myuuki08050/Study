package models;
 
import java.util.Date;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import javax.validation.constraints.NotNull;
 
@Entity
public class Parent extends Model {
 
    @Id
    public String user_id;
 
    @NotNull
    public String password;
 
    @CreatedTimestamp
    public Date createDate;
 
    @Version
    public Date updateDate;
    
    public static Find<Long,Parent> finder = new Find<Long,Parent>(){};
 
    public String toString() {
        return "Parent [user_id=" + user_id + ", password=" + password + ", createDate="
                + createDate + ", updateDate=" + updateDate + "]";
    }
}