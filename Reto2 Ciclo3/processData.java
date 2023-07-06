import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProcessData {
    public static void insertAuthor(Connection connection, String nombre, String apellido) throws SQLException {
        String sql = "INSERT INTO authors (nombre, apellido) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.executeUpdate();
    }
    public static void insertSubject(Connection connection, String titulo) throws SQLException {
      String sql = "INSERT INTO subject (titulo) VALUES (?)";
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1, titulo);
      statement.executeUpdate();
  }
  public static void insertDate(Connection connection, String fecha) throws SQLException {
    String sql = "INSERT INTO date (fecha) VALUES (?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, fecha);
    statement.executeUpdate();
}
}