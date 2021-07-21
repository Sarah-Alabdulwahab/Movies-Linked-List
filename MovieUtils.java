public class MovieUtils {
	// Return the movie with the given id if found, null otherwise.
   public static Movie findMovieById(List<Movie> movies, int id) {
      if(movies.empty())
         return null;
      IntEqualCond IDcnd= new IntEqualCond(id);
      if(movies.findFirstEle(IDcnd))
         return movies.retrieve(); //current is at the correct movie
      else
         return null;
   }
   
	// Return the list of movies having a given title. 
   //If none is found, empty list is returned.
   public static List<Movie> findMovieByTitle(List<Movie> movies, String title) {
      //if(movies.empty()) not needed because findAllEle checks that and returns an empty list
      TitleEqualCond titlecnd= new TitleEqualCond(title);
      return movies.findAllEle(titlecnd);
   }
   
	// Return the list of movies of a given genre. 
   //If none is found, empty list is returned.
   public static List<Movie> findMoviesByGenre(List<Movie> movies, String genre) {
      GenreEqualCond genrecnd= new GenreEqualCond(genre);
      return movies.findAllEle(genrecnd);
   }
   
	// Return the list of movies of given genres 
   //(a movie must have all genres to be in the list). 
   //If none is found, empty list is returned. Assume genres is not empty.
   public static List<Movie> findMoviesByGenres(List<Movie> movies, List<String> genres) {
      AllGenresEqualCond genrecnd= new AllGenresEqualCond(genres);
      return movies.findAllEle(genrecnd);
   }
}
