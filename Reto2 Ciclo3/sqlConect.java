import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
  public static Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost/scholarDB";
    String username = "root";
    String password = "3sKueLe159753";
    return DriverManager.getConnection(url, username, password);
} 

public static void main(String[] args) {
  System.out.println("Conectando a la base de datos...");
  
  try(Connection conn = DriverManager.getConnection(url, username, password);) {		      
     System.out.println("Conectado!");  
  } catch (SQLException e) {
     e.printStackTrace();
  } 
}
}
