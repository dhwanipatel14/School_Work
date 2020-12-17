/*
 * The purpose of this class is to work with different functionalities of Bank account
 */
public class BankAccount {
	private double transaction_fee ;
	private double balance;
	private int free_transaction;
	private int monthly_transactions;
	/*
	 * Default constructor of bank account
	 */
	public BankAccount() {
		transaction_fee = 0.50;
		balance = 0.0;
		free_transaction = 10;
		monthly_transactions = 0;
	}
	/*
	 * Second constructor of the Bank account
	 * @param deposited_balance deposits balance to the account
	 */
	public BankAccount(double deposited_balance) {
		transaction_fee = 0.50;
		balance = deposited_balance;
		free_transaction = 10;
		monthly_transactions = 0;		
	}
	/*
	 * Method to to deposit money to the account and update transactions.
	 */
	public void deposit(double amount) {
		this.balance = balance + amount ; 	
		monthly_transactions++;
			
	}
	/*
	 * Method to to withdraw money to the account and update transactions.
	 */
	public void withdrawal(double amount) {
		this.balance = balance - amount ; 
		monthly_transactions++;
	
	}
	/*
	 * Accessor method to get balance
	 */
	public double get_balance() {
		return balance;
	}
	/*
	 * @paarm new_fee to set new transaction fee
	 */
	public void set_transaction_fee(double new_fee) {
		this.transaction_fee = new_fee;
	}
	/*
	 * Method to count the transactions on which charges are apply.
	 */
	public void deductMonthlyCharge() {
		double charged_transactions = Math.max(monthly_transactions, free_transaction) - free_transaction;
		this.balance = balance - charged_transactions * transaction_fee;
		this.monthly_transactions = 0;	
	}

}
