package hw118;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated; 
	private String name;
	private ArrayList<Transaction> transaction;//announce variable
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		name = "";
		transaction = new ArrayList<Transaction>();
	} // no -arg constructor
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
		name = "";
		transaction = new ArrayList<Transaction>();
	} // set id and balance constructor
	
	public Account(int id, double balance,String name){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
		this.name = name;
		transaction = new ArrayList<Transaction>();
	} // set id and balance and name constructor
	
	public void setId(int id){
		this.id = id;
	} // id mutator
	
	public int getId(){
		return id;
	} // id accessor
	
	public void setBalance(double balance){
		this.balance = balance;
	} // balance mutator
	
	public double getBalance(){
		return balance;
	} // balance accessor
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	} // annualinterestrate mutator
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}// annualinterest accessor
	
	public Date getDateCreated(){
		return dateCreated;
	} // dateCreated accessor
	
	public void setName(String name){
		this.name = name;
	} // name mutator
	
	public String getName(){
		return name;
	} // name accessor
	
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	} // get monthly interest rate
	
	public double getMonthlyInterest(){
		return (balance * annualInterestRate / 1200);
	} // get monthly interest rate
	
	public void withdraw(double money){
		balance -= money;
		transaction.add(new hw118.Transaction('W',money,balance,"You've taken "+money+" out the account."));
	} //take money out
	
	public void deposit(double money){
		balance += money;
		transaction.add(new hw118.Transaction('D',money,balance,"You've saved "+money+" into the account."));
	} //save money in
	
	@Override
	public String toString(){
		return ("The Account id is "+id+"\nThe balance is "+balance+"\nThe annual interest rate is "+annualInterestRate+"%\nIt created at "+dateCreated);
	}
}
