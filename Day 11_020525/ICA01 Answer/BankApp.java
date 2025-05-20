import java.util.Scanner;

class BankAccount{
	private String accountHolder;
	private double balance;
	
	BankAccount(String name){//constructor
		accountHolder = name;
		balance = 1000.0;
	}
	
	void displayAccount(){
		System.out.println("Account Holder Name: "+accountHolder);
		System.out.println("Account Balance: Rs "+balance);
	}
	
	void deposite(double amount){
		if(amount<0){
			System.out.println("Invalid deposite amount!");
		}
		else{
			balance += amount;
			System.out.println("Rs "+amount+" has been deposited to your account");
			System.out.println("Your current balance is "+balance);
		}
	}
}

class BankApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder Name: ");
		BankAccount b1 = new BankAccount(sc.nextLine());
		b1.displayAccount();
		System.out.println("Enter the Deposite Amount: ");
		b1.deposite(sc.nextDouble());
		b1.deposite(-2500.0);
	}
	
}