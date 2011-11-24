package Banksystem;

import java.util.*;

public class Bank {
		
	@SuppressWarnings("rawtypes")
	private HashMap bankAcc = new HashMap();

	@SuppressWarnings("unchecked")
	public void add(Account a){
		
		bankAcc.put(a.getAccnumb(), a);
	}
	
	public Account find(int accnumber){
		
		return (Account) bankAcc.get(accnumber);
	}
	
	public void remove(Account a){
		
		bankAcc.remove(a.getAccnumb());
	}
	
	public void print(){
		
		System.out.println(bankAcc.values());
	}
	
}
