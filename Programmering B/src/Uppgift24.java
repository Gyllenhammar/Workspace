
public class Uppgift24 {
	
	public static void main(String[] args){
		
		double[] talserie = new double[20];
		System.out.println("Mata in. Avsluta med 0; ");
		double temp = Keyboard.readDouble();
		
		int antal = 0;
		
		while (temp !=0){
			
			talserie[antal] = temp;
			antal++;
			System.out.println("Mata in ett nytt tal: ");
			temp = Keyboard.readDouble();
		}
		
		double medelvärde = Stat.medel(talserie, antal);
		double maxvärde = Stat.max(talserie, antal);
		double minvärde = Stat.min(talserie, antal);
		double diffvärde = Stat.diff(talserie, antal);
		
		System.out.println("Medelvärde: " + medelvärde);
		System.out.println("Maxvärde: " + maxvärde);
		System.out.println("minvärde: " + minvärde);
		System.out.println("diffvärde: " + diffvärde);
	}
}
