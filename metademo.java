import java.sql.*;
import java.io.*;
public class metademo
{
  public static void main(String[] args) throws Exception
  {
     ResultSet rs = null;
      Class.forName("org.postgresql.Driver");
       Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.21/ty18","ty18",""); 
    DatabaseMetaData dbmd = conn.getMetaData();
    System.out.println("Database Product name = " + dbmd.getDatabaseProductName());
    System.out.println("User name = " + dbmd.getUserName());
    System.out.println("Database driver  name= " + dbmd.getDriverName());
    rs = dbmd.getTables(null,null,null, new String[]{"TABLE"});
    System.out.println("List of tables...");
    while(rs.next())
    {
          String tblName = rs.getString("TABLE_NAME");
          System.out.println("Table : "+ tblName);
    }
    conn.close();
  }
}
