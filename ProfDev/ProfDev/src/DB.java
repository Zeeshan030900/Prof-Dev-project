import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class DB {
	private static final String JDBC_CONNECTION_STRING = "jdbc:sqlite:./data/movies.db";
	private Connection connection = null;
	ArrayList<Movie> list;
	public DB() {
			try {
				connection = DriverManager.getConnection(JDBC_CONNECTION_STRING);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public ArrayList<Movie> getMovie(Person person) {
		PreparedStatement s;
		list = new ArrayList<>();
		try {
			s = connection.prepareStatement("SELECT *, ReleaseYear, Rating, SUM((Horror * ?) + (Action * ?) + (Comedy * ?) + (Fantasy * ?) + (SciFi * ?)) AS Overall FROM Movies WHERE Rating >= ? GROUP BY Title ORDER BY Overall DESC LIMIT 15;");
//			s = connection.prepareStatement("SELECT * FROM Movies list;");
			s.setInt(1, person.getHorror());
			s.setInt(2, person.getAction());
			s.setInt(3, person.getComedy());
			s.setInt(4, person.getFantasy());
			s.setInt(5, person.getSciFi());
			s.setString(6, person.getRatingPref());
			ResultSet results = s.executeQuery();
			
			while(results.next()) {
			list.add(new Movie(results.getString("Title"), results.getString("ReleaseYear"), results.getString("Rating")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public boolean addData(String title, String releaseYear, String rating, int horror, int action, int comedy, int sciFi, int fantasy)  {
		PreparedStatement s;
		try {
			s = connection.prepareStatement("INSERT INTO Movies VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			s.setString(1, title);
			s.setInt(2, horror);
			s.setInt(3, action);
			s.setInt(4, comedy);
			s.setInt(5, sciFi);
			s.setInt(6, fantasy);
			s.setString(7,rating);
			s.setString(8, releaseYear);
			s.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
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
