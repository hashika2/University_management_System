
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
    public String register(String name,String email,String password,String username,String address,String phone) throws SQLException{
      con = (Connection) new SetConnection().getConnection();
      Statement state = con.createStatement();
      String registerQuery = "insert into all_students(name,email,password,username,address,phone) values('"+name+"','"+email+"','"+password+"','"+username+"','"+address+"','"+phone+"') ";
//      pst.setString(1,name);
//      pst.setString(2, email);
//      pst.setString(3, password);
//      pst.setString(4, username);
//      pst.setString(5, address);
//      pst.setString(6, phone);
      pst.executeUpdate(registerQuery);
      //ResultSet rs = state.executeQuery(registerQuery);
      return "success";  
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
