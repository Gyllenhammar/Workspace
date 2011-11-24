
public class Brottsling extends Person{
	
	private String typAvBrott;
	private int straffTid;
	
	public Brottsling(
		String typAvBrott,
		String 	namn,
		String 	nationalitet,
		String 	pnr,
		double 	längd,
		int 	straffTid){
		
		super(	namn,
				nationalitet,
				pnr,
				längd);
		
		this.typAvBrott = typAvBrott;
		
		this.straffTid = straffTid;
		
	}
	
	
	public String getTypAvBrott(){
		return typAvBrott;
	}
	
	public int getStrafftid(){
		return straffTid;
	}
	

	
	
	
	
	public static void main(String[] args) {
		

	}

}
