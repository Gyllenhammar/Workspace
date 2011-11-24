
public class StockMarket {
	public static void main(String[] args){
		
		ReadFiles r = new ReadFiles(); // importerar classen readfiles.java
		r.ConvertToArray();
		
		
		Formulas f = new Formulas(); // importerar classen fromulas.java
		f.CreateDataArray(r.getArray());
		f.printArray(); //printar arrayn med siffror
	}
}
