
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
		
		double medelv�rde = Stat.medel(talserie, antal);
		double maxv�rde = Stat.max(talserie, antal);
		double minv�rde = Stat.min(talserie, antal);
		double diffv�rde = Stat.diff(talserie, antal);
		
		System.out.println("Medelv�rde: " + medelv�rde);
		System.out.println("Maxv�rde: " + maxv�rde);
		System.out.println("minv�rde: " + minv�rde);
		System.out.println("diffv�rde: " + diffv�rde);
	}
}
