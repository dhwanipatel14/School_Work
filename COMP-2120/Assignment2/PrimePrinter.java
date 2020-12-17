import java.util.Scanner;

public class PrimePrinter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter upper Limit: ");
		int limit = in.nextInt();
		PrimeGenerator primeNumber = new PrimeGenerator();
		System.out.println("Prime numbers are :");
		for(int i=2;i<limit;i++) {
			if(primeNumber.isPrime(i)) {
			int nextNumber = primeNumber.nextPrime();
			if(i%10 == 0) {
				System.out.println();
			}
			System.out.print(nextNumber + " ");
			}
		}
	}

}
