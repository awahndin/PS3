import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public Account(int id,int baseBalance) {
	this.id  = id;
	this.balance = baseBalance;
		 
	}
	
	public void define_id() {
		this.id = id;
	}
	
	public void define_balance() {
		this.balance = balance;
	}
	public void define_AIR() {
		this.annualInterestRate = annualInterestRate;
	}
	
	
	public double withdraw(double ammount) {
		this.balance = balance - ammount;
		return balance;
	}
	public double deposit(double ammount) {
		this.balance = balance + ammount;
		return balance;
	}
	
	
	public Date getDate(){
		return dateCreated;
	}
	public double getMIR() {
		double monthlyInterestRate = (annualInterestRate/12);
		return monthlyInterestRate;
	}
}
