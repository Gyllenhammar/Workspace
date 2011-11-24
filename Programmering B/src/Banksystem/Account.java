package Banksystem;

public class Account {

	private String holder;
	private double initBal;
	private double balance;
	int accnumber;
	
	
	public Account(String h, double iBal){
		holder = h;
		initBal = iBal;
		
		balance = initBal;
		
		accnumber = Sequence.nextInt();

	}
	
	public Account(String h){
		this( h, 0);
	}
	
	public Account(){
		this("Nomem");
	}
	
	//sätter in pengar i balance
	public void deposit(double amount){
		
		balance = balance + amount;
		
	}
	
	//tar ut pengar från balance
	public void withdraw(double amount){
		
		balance = balance + amount;
		
	}
	
	//returnerar holder
	public String getHolder(){
		
		return holder;
	}
	
	//returnerar balance
	public double getBalance(){
		
		return balance;
	}
	
	public int getAccnumb(){
		
		return accnumber;
	}

	public String toString(){
		
		return "(" + accnumber + ", " + holder + ", " + balance + ")";
	}

}
