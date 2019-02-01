/*
Author: Jacob Almeida
Date: 01-29-2019

UML Diagram
---------------------------------------------------
+id: int
+balance: double
+annualInterestRate: double
+dateCreated: Date()
+amount: double
---------------------------------------------------
-Account()
-Account(int id1, double balance1)
-setId(int id1)
-setBalance(balance1)
-setAnnualInterestRate(double annualInterestRate1)
-getId()
-getBalance()
-getAnnualInterestRate()
-getDateCreated()
-getMonthlyInterestRate()
-getMonthlyInterest()
-withdraw(double amount)
-deposit(double amount)
*/
import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private double amount;
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	public Account(int id1, double balance1){
		id = id1;
		balance = balance1;
		dateCreated = new Date();
	}
	public void setId(int id1){
		id = id1;
	}
	public void setBalance(double balance1){
		balance = balance1;
	}
	public void setAnnualInterestRate(double annualInterestRate1){
		annualInterestRate = annualInterestRate1;
	}
	public int getId(){
		return this.id;
	}
	public double getBalance(){
		return this.balance;
	}
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	public String getDateCreated(){
		return this.dateCreated.toString();
	}
	public double getMonthlyInterestRate(){
		return this.annualInterestRate / 12;
	}
	public double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}
	public void withdraw(double amount){
		balance -= amount;
	}
	public void deposit(double amount){
		balance += amount;
	}
}