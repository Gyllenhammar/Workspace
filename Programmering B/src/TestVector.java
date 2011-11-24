import java.util.Iterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args){
		
		Vector samling = new Vector();
		
		for(int i = 0; i < 10; i++){
			samling.addElement(i);
			
		}
		samling.removeElementAt(4);
		
		for(Iterator i = samling.iterator(); i.hasNext(); ){
			System.out.println(i.next());
		}
	}
	
}
