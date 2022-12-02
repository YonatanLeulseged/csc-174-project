import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String [] args)
    {

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://b8e9acc0d62333:d29d99ae@us-cdbr-east-06.cleardb.net/heroku_34f03c957b2bd86?reconnect=true")) {

            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO PLAYER VALUES (?,?)");
            conn.setAutoCommit(false);

            preparedStatement.setString(1, "fffffffffff");
            preparedStatement.setString(2, "fffffffffff");

            preparedStatement.executeUpdate();
            conn.commit();

        } catch (SQLException e) {

            System.out.println("toString(): " + e.toString());
            System.out.println("getMessage(): " + e.getMessage());

        }

    }
}
