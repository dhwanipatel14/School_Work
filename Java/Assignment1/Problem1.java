
public class Problem1 {

	public static void main(String[] args) {
		/*
		 * Declaration and inialization of varibles s0,v0,g,t
		 * Computation of formula s.
		 */
		double s0 = 20.0;
		double v0 = 15;
		double g = 9.8;
		double t = 10;
		double s = s0*v0 - (1/2)*g*t*t;
		System.out.printf("s = %.2f\n",s);
		
		/*
		 * Declaration and Inialization of variables a,m1,m2,p.
		 * Computation of Formula G.
		 */
		double a = 11;
		double m1 = 10;
		double m2 = 7;
		double p = 14;
		double G = ((3.0/4.0)*Math.PI*Math.PI*Math.pow(a, 3))/(Math.sqrt(p)*(m1-m2));
		System.out.printf("G = %.4f\n",G);
		

	}

}
