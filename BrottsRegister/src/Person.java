
public class Person {

	protected String namn, nationalitet, pnr;
	protected double längd;
	
	
	public Person( 
		String namn, 
		String nationalitet, 
		String pnr,
		double längd){
		
		this.namn = namn;
		this.nationalitet = nationalitet;
		this.pnr = pnr;
		this.längd = längd;
		
	}
	
	public String getPnr(){
		return pnr;
	}
	public String getNationalitet(){
		return nationalitet;
	}
	
	public String getNamn(){
		return namn;
	}
	
	public double getLängd(){
		return längd;
	}

}
