import javax.swing.JOptionPane;

public class MyStrings {

	public static void main(String[] args) {
		
		String helaNamnet = JOptionPane.showInputDialog(null, "Skriv in f�r och efternamn");
		
		if (helaNamnet.contains(" ")){
			
			int pos = helaNamnet.indexOf(" ");
			
			String f�rnamn = helaNamnet.substring(0, pos);
			String eftnamn = helaNamnet.substring(pos, helaNamnet.length());
			
			JOptionPane.showMessageDialog(null, "f�rnamn: " + f�rnamn + " efternamn: " + eftnamn);
		}

	}

}
