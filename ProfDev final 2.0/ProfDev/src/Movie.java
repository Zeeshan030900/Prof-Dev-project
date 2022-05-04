
public class Movie {
	/*
	 * Basic class that has two string variables, which are genre and title  
	 */
	private String releaseDate;
	private String title;
	private String rating;
	private int horror;
	private int action;
	private int comedy;
	private int fantasy;
	private int sciFi;
	
	public int getHorror() {
		return horror;
	}


	public void setHorror(int horror) {
		this.horror = horror;
	}


	public int getAction() {
		return action;
	}


	public void setAction(int action) {
		this.action = action;
	}


	public int getComedy() {
		return comedy;
	}


	public void setComedy(int comedy) {
		this.comedy = comedy;
	}


	public int getFantasy() {
		return fantasy;
	}


	public void setFantasy(int fantasy) {
		this.fantasy = fantasy;
	}


	public int getSciFi() {
		return sciFi;
	}


	public void setSciFi(int sciFi) {
		this.sciFi = sciFi;
	}


	public Movie(String title, String releaseDate, String rating) {
		this.releaseDate = releaseDate;
		this.title = title;
		this.rating = rating;
	}
	 /* Constructor takes two parameters
	 * @param String title- the movies title, String genre - The genre of the movie
	 */
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	/*
	 * Getters and Setters for movie class's genre and title
	 */


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Title= " + title +" Release Year = " + releaseDate  + " Rating = " + rating + "\t";
	}
	
}
