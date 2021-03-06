package br.com.flexosoul.connection;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author marcos
 *
 */
public class ConnectionFactory {
	//TomC@t11224455
	private final String URL = "jdbc:postgresql://localhost/flexosoul";
	private final String USER = "postgres";
	private final String PASS = "senha";

	public Connection createConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			return (Connection) DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
