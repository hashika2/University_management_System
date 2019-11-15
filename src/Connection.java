
import com.connector.DbConnector;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashika
 */
public class Connection {
    
    java.sql.Connection con=null;
    PreparedStatement pst=null;
    Statement state = null;
    ResultSet rs=null;
    String url="jdbc:mysql://localhost:3306/se_students";
    String id;
       
    DbConnector dbc= new DbConnector();
    
    public void getConnection(){
        try{
             Class.forName("com.mysql.jdbc.Driver"); 
            java.sql.Connection con=(java.sql.Connection)DriverManager.getConnection(url, "root","");//get the connection
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
