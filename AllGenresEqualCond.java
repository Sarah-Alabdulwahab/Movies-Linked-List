public class AllGenresEqualCond implements Cond<Movie> {
	private List <String> genres;
	public AllGenresEqualCond(List<String> g) {
		genres = g;
	}
	@Override
	public boolean test(Movie m) {
      genres.findFirst();
      boolean test= true;      
      while( test && !genres.last())
      {
         if(!m.genres.findFirstEle(new StringEqualCond (genres.retrieve())))
            test = false;
         genres.findNext();
      }
      if(test) //to check the last genre in the list
        if(!m.genres.findFirstEle(new StringEqualCond (genres.retrieve())))
            test = false;

      return test;
  	}
}
