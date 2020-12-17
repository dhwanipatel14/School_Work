/*
 * This class prints number in given base
 */
public class BaseFormatter implements NumberFormatter {

	private int base;

	public BaseFormatter(int base) {
		this.base = base;
	}

	@Override
	public String format(int n) {

		 return Integer.toString(n,base);
	}

}
