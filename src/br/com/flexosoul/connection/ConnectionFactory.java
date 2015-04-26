package br.com.flexosoul.connection;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * @author marcos
 *
 */
public class ConnectionFactory {
	/**
	 * Trocar para postgres
	 */
	private final String URL = "jdbc:mysql://localhost/farmacia";
	private final String USER = "root";
	private final String PASS = "";

	public Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return (Connection) DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
