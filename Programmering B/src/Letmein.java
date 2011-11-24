import javax.swing.*;

public class Letmein {
	
	static JOptionPane pane = new JOptionPane();
	
	public static void main(String[] args) {
		
		String anvnamn = "";
		
		int counter = 0;
		
		do{
			if(counter > 0){
				anvnamn = JOptionPane.showInputDialog(pane, "Fel Anvnamn");
			}
			else{
				anvnamn = JOptionPane.showInputDialog(pane, "Anvnamn");
			}
			counter++;
		}while(!anvnamn.equalsIgnoreCase("ADMIN"));
		
		String passw = "";
		
		int counter2 = 0;
		
		do{
			if(counter2 > 0){
				passw = JOptionPane.showInputDialog(pane, "fel lšsen");
			}
			else{
				passw = JOptionPane.showInputDialog(pane, "Lšsenord");
			}
			counter2++;
		}while(!passw.equals("letmein"));
					
		JOptionPane.showMessageDialog(pane, "Inloggad");
			
	}
}


