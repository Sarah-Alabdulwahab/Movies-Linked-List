public class GenreEqualCond implements Cond<Movie> {
	private String genre;
	public GenreEqualCond(String g) {
		genre = g;
	}
	@Override
	public boolean test(Movie m) {
		return m.genres.findFirstEle(new StringEqualCond (genre));
	}
}
