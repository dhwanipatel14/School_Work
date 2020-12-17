/*
 * This class format negative numbers in accountingForamtter
 */
public class AccountingFormatter implements NumberFormatter{
	@Override
	public String format(int n) {
		if(n<0) {
		return String.format("(%d)",Math.abs(n));
		}
		return String.format("%d",n);
	}

}
