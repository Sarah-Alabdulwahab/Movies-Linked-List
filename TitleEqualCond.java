public class TitleEqualCond implements Cond<Movie> {
	private String title;
	public TitleEqualCond(String t) {
		title = t;
	}
	@Override
	public boolean test(Movie m) {
		return m.title.equals(title);
	}
}
