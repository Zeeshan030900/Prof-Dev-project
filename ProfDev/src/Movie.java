
public class Movie {
	/*
	 * Basic class that has two string variables, which are genre and title  
	 */
	private String genre;
	private String title;
	
	
	public Movie(String genre, String title) {
		this.genre = genre;
		this.title = title;
	}
	 /* Constructor takes two parameters
	 * @param String title- the movies title, String genre - The genre of the movie
	 */
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	/*
	 * Getters and Setters for movie class's genre and title
	 */
}
