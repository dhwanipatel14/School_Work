
public class PrimeGenerator {
	private int current;
	public PrimeGenerator() {
		current = 1;
	}
	/*
	 * Calculates the next Prime number 
	 * @returns the next Prime number
	 */
	public int nextPrime() {
		current++;
		for(int i=current ; ;current++) {
			if(isPrime(current) == true) {
				return current;
			}
		}
		
	}
	/*
	 * check if n is prime number
	 * @param n to check its prime or not
	 * @return true if prime or else false
	 */
	public static boolean isPrime(int n) {
		if(n==2) {
			return true;
		}
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	

}
