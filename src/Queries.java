
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
           
           
           String lgoinQuery="select username,password,id from login";
           ResultSet rs = state.executeQuery(lgoinQuery);
           return rs;
    }
}
