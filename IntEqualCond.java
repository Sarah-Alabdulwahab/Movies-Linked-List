public class IntEqualCond implements Cond<Movie> {
	private Integer num;
	public IntEqualCond(Integer n) {
		num = n;
	}
	@Override
	public boolean test(Movie m) {
		return m.id == num;
	}
}
