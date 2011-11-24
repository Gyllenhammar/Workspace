import java.util.*;

public class BrottsRegister {
	
	private HashMap<String, Person> brottslingar = new HashMap<String, Person>();
	
	public void add(Person p){
		
		brottslingar.put(p.getPnr(), p);
	
	}
		
	public Person find(String pnr) {
		
		return (Person) brottslingar.get(pnr);
		
	}
	
	public boolean remove(String pnr) {
		
		brottslingar.remove(pnr);
		
		return false;
	}

	public void print(){
		
	}

	public static void main(String[] args) {
		
		
	}

}