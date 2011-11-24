import java.io.*;
import java.util.StringTokenizer;

public class ReadFiles {

	File file = new File("/stocks/shortdow.csv");
	int row = 0;
	String[][] items;
	
	public boolean CheckFile() { //kollar om filen finns
		return file.isFile();
	}
	
	public int FindRowNumber(){ //kollar antalet rader i filen
		row = 0;
		if(CheckFile()){
			//om filen finns gör:
		
			try{ //läser antalet rader och adderar en till row för varje loop
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				while((reader.readLine()) !=null){
					row++;
				}
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		
		}
		
		else {
			System.out.println("Det här är inte en fil!");
		}
		
		return row;
	}
	
	public void ConvertToArray(){ //konverterar .csv filen till en array
		int r = 0;
		items = new String [FindRowNumber()] [7];
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
		
			while((line=reader.readLine()) !=null) { //numrerar radererna
				StringTokenizer z = new StringTokenizer(line,",");
				while(z.hasMoreTokens()){ // numrerar kolumnerna
					for(int c = 0; c < 7; c++){
						items[r][c] = z.nextToken();
					}
					
					r++;
				}
			}
		
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
	
	
	public void printArray(){ //skriver ut Item arrayen
		for(int x = 0; x < items.length; x++){
			System.out.printf("%s - ", x);
			for(int y = 0; y < items[x].length; y++){
				System.out.printf("%s ", items[x][y]);
			}
			System.out.println();
		}
	}
	
	public String[][] getArray(){ //return Items array
		return items;
	}

}
