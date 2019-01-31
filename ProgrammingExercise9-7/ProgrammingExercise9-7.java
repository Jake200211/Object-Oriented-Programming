/*
Author: Jacob Almeida
Date: 01-29-2018
*/
class ProgrammingExercise9_7 {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("\n             Account Statement");
		System.out.println("---------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date Created: " + account.getDateCreated());
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
	}
}