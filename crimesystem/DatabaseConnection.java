
package crimesystem;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import  java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class DatabaseConnection {
    public Connection conn;
    public Statement statement=null;
    public PreparedStatement st=null;
    public ResultSet rs=null;
    
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    //C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext
    final static String DB_URL= "jdbc:mysql://localhost:3306/crimesystem?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    final static String USER= "root";
    final static String PASS="";
    
    public static Connection connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/crimesystem?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
             System.out.println("bhiii tuch fakt");
            return conn;
            
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("bhiii keep it up");
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
}
}

    
  

