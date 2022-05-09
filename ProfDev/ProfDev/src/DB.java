import java.sql.*;
import java.util.ArrayList;


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
	public ArrayList<Movie> getMovie(int action, int comedy, int horror, int fantasy, int scifi) {
		PreparedStatement s;
		ArrayList<Movie> list = new ArrayList<>();
		try {
			s = connection.prepareStatement("SELECT *, ReleaseYear, Rating, SUM((Horror * ?) + (Action * ?) + (Comedy * ?) + (Fantasy * ?) + (SciFi * ?)) AS Overall FROM Movies list GROUP BY Title ORDER BY Overall DESC LIMIT 15;");
//			s = connection.prepareStatement("SELECT * FROM Movies list;");
			s.setInt(1, horror);
			s.setInt(2, action);
			s.setInt(3, comedy);
			s.setInt(4, fantasy);
			s.setInt(5, scifi);
			ResultSet results = s.executeQuery();
			
			while(results.next()) {
			list.add(new Movie(results.getString("Title"), results.getString("ReleaseYear"), results.getString("Rating")));
			}
			return list;
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
