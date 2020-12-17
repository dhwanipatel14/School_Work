
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(1400);
		System.out.println("Testing details of account1.");
		System.out.printf("Actual intial balance : %.2f\n",account1.get_balance());
		System.out.printf("Expected intial balance : %.2f\n\n",0.0);
		
		account1.deposit(720.0);
		account1.deposit(1000);
		System.out.printf("Actual Balance after depositing money: %.2f\n", account1.get_balance());
		System.out.printf("Expected Balance after depositing money : %.2f\n\n",1720.0);
		
		account1.withdrawal(320.0);
		System.out.printf("Actual Balance after withrawing money: %.2f\n", account1.get_balance());
		System.out.printf("Expected Balance after withdrawing money : %.2f\n\n",1400.0);
	
		account1.deductMonthlyCharge();
		System.out.printf("Total Balance in account: %.2f\n", account1.get_balance());
		System.out.printf("Total Balance in account : %.2f\n\n",1400.0);
	
		
		
		System.out.println("Testing details of account2.");
		System.out.printf("Actual intial balance : %.2f\n",account1.get_balance());
		System.out.printf("Expected intial balance : %.2f\n\n",1400.0);
		
		account1.deposit(2500.0);
		account1.deposit(600.78);
		account1.deposit(100.98);
		account1.deposit(400.0);
		System.out.printf("Actual Balance after depositing money: %.2f\n", account1.get_balance());
		System.out.printf("Expected Balance after depositing money : %.2f\n\n",5001.76);
		
		account1.withdrawal(1250.0);
		account1.withdrawal(100.86);
		account1.withdrawal(450.36);
		account1.withdrawal(89.76);
		System.out.printf("Actual Balance after withrawing money: %.2f\n", account1.get_balance());
		System.out.printf("Expected Balance after withdrawing money : %.2f\n\n",3110.78);
		
		account1.deposit(300.46);
		account1.deposit(700.64);
		account1.withdrawal(800.64);
		account1.withdrawal(200.46);
	
		account1.deductMonthlyCharge();
		System.out.printf("Total Balance in account: %.2f\n", account1.get_balance());
		System.out.printf("Total Balance in account : %.2f\n\n",3109.78);
	
			

	}

}
