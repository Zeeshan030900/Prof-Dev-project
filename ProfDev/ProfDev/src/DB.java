import java.sql.*;

public class DB {
	private static final String JDBC_CONNECTION_STRING = "jdbc:sqlite:./data/movies.db";
	private Connection connection = null;
	public DB() {
			try {
				connection = DriverManager.getConnection(JDBC_CONNECTION_STRING);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public String getMovie(double action, double commedy, double horror) {
		PreparedStatement s;
		String buffer = "";
		try {
			s = connection.prepareStatement("SELECT Title, SUM((Horror * ?) + (Action * ?) + (Comedy * ?)) AS Overall FROM Movies list GROUP BY Title ORDER BY Overall DESC;");
//			s = connection.prepareStatement("SELECT * FROM Movies list;");
			s.setDouble(1, horror);
			s.setDouble(2, action);
			s.setDouble(3, commedy);
			ResultSet results = s.executeQuery();
			while(results.next()) {
				
			buffer += results.getString("Title") + "\n";
			}
			return buffer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return null;
	}
	public void close() {
		try {
			if ( !connection.isClosed() ) {
				connection.close();
			}
		}
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
