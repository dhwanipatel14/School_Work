
public class Problem2 {

	public static void main(String[] args) {
		/*
		 * Declaring and inializing variables x,y,n,m.
		 */
		double x = -3.5;
		double y = 1.9;
		int n = 23;
		int m = 14;
		/*
		 * Computation of different formulas.
		 */
		double a = x-n/y + x+(n*y);
		System.out.printf("a = %.2f\n",a);
		
		double b = n/m + n%m;
		System.out.printf("b = %.2f\n",b);
		
		double c = n%2 + m%3;
		System.out.printf("c = %.2f\n",c);
		
		double d = (m+n)/3.0;
		System.out.printf("d = %.2f\n",d);
		
		double e = (n - m)/3;
		System.out.printf("e = %.2f\n",e);
		
		double f = (n - x)/3;
		System.out.printf("f = %.2f\n",f);
		
		double g = (1 - (1 - (1 - n)));	
		System.out.printf("g = %.2f\n",g);
		
		double h = m % 10 + (m - (n % 10));
		System.out.printf("h = %.2f\n",h);
		
		


	}

}
