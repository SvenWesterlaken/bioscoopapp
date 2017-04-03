package informatica.groep1.bioscoopapp.businesslogic;

import java.util.ArrayList;

import informatica.groep1.bioscoopapp.domain.Movie;

public class FavoritesFilmManager {
	
	//================================================================================
	// Properties
	//================================================================================
	
	private ArrayList<Movie> movies;
	
	//================================================================================
	// Constructors
	//================================================================================
	
	public FavoritesFilmManager() {
		movies = new ArrayList<>();
	}
	
	//================================================================================
	// Accessors
	//================================================================================
	
	public ArrayList<Movie> getMovies() {
		return movies;
	}
	
	//================================================================================
	// Mutators
	//================================================================================
	
	public void generate() {
		demo();
	}
	
	private void demo() {
		Movie movie = new Movie("Test");
		movie.setPosterImage("https://image.tmdb.org/t/p/w1000/kqjL17yufvn9OVLyXYpvtyrFfak.jpg");
		
		Movie movie2 = new Movie("Demo");
		movie2.setPosterImage("http://image.tmdb.org/t/p/w1000/s9ye87pvq2IaDvjv9x4IOXVjvA7.jpg");
		
		movies.add(movie);
		movies.add(movie2);
		movies.add(movie2);
		movies.add(movie2);
		movies.add(movie);
		movies.add(movie);
		movies.add(movie2);
		movies.add(movie);
		movies.add(movie2);
		movies.add(movie2);
		movies.add(movie);
		movies.add(movie);
	}
}