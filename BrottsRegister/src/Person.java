
public class Person {

	protected String namn, nationalitet, pnr;
	protected double l�ngd;
	
	
	public Person( 
		String namn, 
		String nationalitet, 
		String pnr,
		double l�ngd){
		
		this.namn = namn;
		this.nationalitet = nationalitet;
		this.pnr = pnr;
		this.l�ngd = l�ngd;
		
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
	
	public double getL�ngd(){
		return l�ngd;
	}

}
