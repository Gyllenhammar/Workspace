
public class MittBrottsRegister {

	public static void main(String[] args){
		BrottsRegister register = new BrottsRegister();
		
		register.add(new Brottsling("Fildelning", "Gšran Piraten Persson", "SE", "880923-9874", 1.6, 36));
		register.add(new Brottsling("Snatteri", "Tore Andres", "NO", "961130-1232", 1.3, 3));
		register.add(new Brottsling("Krokben", "Eva Tokšga", "DK", "930212-8755", 1.8, 1));
		register.add(new Brottsling("Fildelning", "Gšran Piraten Persson", "SE", "880923-9874", 1.6, 36));
		register.add(new Brottsling("Snatteri", "Tore Andres", "NO", "961130-1232", 1.3, 3));
		
		
		/*Brottsling find = (Brottsling)register.find("961130-1232");
		System.out.println(find.getNamn());
		System.out.println(find.getTypAvBrott());
		System.out.println(find.getStrafftid());
		System.out.println(find.getLŠngd());
		System.out.println(find.getNationalitet());*/
		
		//System.out.println(register.length());
		
		register.print();
	
	}
}
