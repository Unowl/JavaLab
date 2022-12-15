package sql_lab_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_connect 
{
	private final String url = "jdbc:postgresql://localhost/mybd";
	private final String user = "postgres";
	private final String password = "user";
	
	public Connection connect() 
	{
        Connection connection = null;
        try {
        	connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

}
