
public class Uppgift11 {

	public static void main(String[] args) {
		
		int[]f�lt = new int[1000];
		
		int antalsexor = 0;
		
		for (int n = 0; n < f�lt.length; n++){
			
			f�lt[n] = (int) (1+Math.random()*6);
			
			if (f�lt[n] == 6){
				antalsexor++;
			}
		}
		System.out.println("antalet sexor �r " + antalsexor);
	}

}
