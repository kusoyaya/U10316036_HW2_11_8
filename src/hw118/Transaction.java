package hw118;

import java.util.Date;

public class Transaction {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	Transaction(char type, double amount, double balance, String description){
		this.date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}//constructor
	
	public void setType(char type){
		this.type = type;
	}// type mutator
	
	public char getType(){
		return type;
	}// type accessor
	
	public void setAmount(double amount){
		this.amount = amount;
	}// amount mutator
	
	public double getAmount(){
		return amount;
	}// amount accessor
	
	public void setBalance(double balance){
		this.balance = balance;
	}// balance mutator
	
	public double getBalance(){
		return balance;
	}// balance accessor
	
	public void setDesription(String description){
		this.description = description;
	}//description mutator
	
	public String getDescription(){
		return description;
	}//description accessor
	
	@Override
	public String toString(){
		return ("The transaction happend at "+date+"\ntype is "+type+"\nThe amount is "+amount+"\nThe new balance after this transaction is "+balance+"\nThe descripton is "+description+"\n");
	}
}
