package hw118;

public class AccountTestDrive {
	public static void main(String[] args){
		Account a = new Account(1122,1000,"George");
		a.setAnnualInterestRate(1.5);
		a.deposit(30);
		a.deposit(40);
		a.deposit(50);
		a.withdraw(5);
		a.withdraw(4);
		a.withdraw(2);
		String[] time = {"first","second","third","forth","fifth","sixth"};
		int i = 0;
		System.out.println("The final account is below:\n"+a.toString());
		System.out.println();
		for(Transaction t : a.getTransaction()){
			System.out.println("\nThe "+time[i]+" transaction is below:\n"+t.toString());
			i++;
		}
	}
}
