
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Queries {
    
    Connection con=null;
    PreparedStatement pst=null;
    Statement state = null;
    ResultSet rs=null;
    
    public ResultSet login() throws SQLException{
        con= (Connection) new SetConnection().getConnection();
            System.out.println("connected");
            Statement state = con.createStatement();
           
           
           String lgoinQuery = "select username,password,studentId from login";
           ResultSet rs = state.executeQuery(lgoinQuery);
           return rs;
    }
    public ResultSet  setStudentCourses(String id){
        String qery="select c.courseName,c.lecturer,c.courseid from student_course st, courses c where st.c_id = c.courseid and st.s_no='" + id +"'"; 
        
         try{
             id=id;
            con= (Connection) new SetConnection().getConnection();
            System.out.println("connected");
          
           Statement state = con.createStatement();
           rs = state.executeQuery(qery);
             
        }catch(Exception e){
            
        }
        return rs;
    }
}
