import javax.swing.*;

public class tipsrunda {

	static String[] array = new String[13];
	
	static JOptionPane pane = new JOptionPane();
	
	static int counter = 1;

	public static void main(String[] args) {
		
		for(int i = 0; i < array.length; i++){
			
			String inputValue = JOptionPane.showInputDialog("FrŒga " + counter);
	
			if(inputValue.contains("1") || inputValue.contains("2") || inputValue.contains("x")){
				
				array[i] = inputValue;
			
			}
			
			counter++;
		
		}
		
		JOptionPane.showMessageDialog(pane, array);
	}
}