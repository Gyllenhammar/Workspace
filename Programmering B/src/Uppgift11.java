
public class Uppgift11 {

	public static void main(String[] args) {
		
		int[]fält = new int[1000];
		
		int antalsexor = 0;
		
		for (int n = 0; n < fält.length; n++){
			
			fält[n] = (int) (1+Math.random()*6);
			
			if (fält[n] == 6){
				antalsexor++;
			}
		}
		System.out.println("antalet sexor är " + antalsexor);
	}

}
