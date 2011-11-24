import javax.swing.JOptionPane;

public class MyStrings {

	public static void main(String[] args) {
		
		String helaNamnet = JOptionPane.showInputDialog(null, "Skriv in fšr och efternamn");
		
		if (helaNamnet.contains(" ")){
			
			int pos = helaNamnet.indexOf(" ");
			
			String fšrnamn = helaNamnet.substring(0, pos);
			String eftnamn = helaNamnet.substring(pos, helaNamnet.length());
			
			JOptionPane.showMessageDialog(null, "fšrnamn: " + fšrnamn + " efternamn: " + eftnamn);
		}

	}

}
