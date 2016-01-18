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
    public int problem_id;
 
    public String problem_name;
    
    public String solve_name;
    
    public static Find<Long,Doril> finder = new Find<Long,Doril>(){};
  
    public String toString() {
        return "Problem [problem_id=" + String.valueOf(problem_id) + ", problem_name=" + problem_name + ", solve_name=" + solve_name + "]"; 
    }
}