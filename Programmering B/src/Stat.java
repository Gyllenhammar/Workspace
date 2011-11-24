
public class Stat {

	public static double medel(double[] data, int antal){
		
		double summa = 0;
		
		for(int i = 0; i < antal; i++){
			
			summa += data[i];
		}
		
		return summa/antal;
	}
	
	public static double max(double[] data, int antal){
		
		double maximum = data[0];
		
		for(int i = 1; i < antal; i++){
			
			if (data[i] > maximum){
				
				maximum = data[i];
			}
		}
	
		return maximum;
	}
	
	public static double min(double[] data, int antal){
		
		double minimum = data[0];
		
		for(int i = 1; i < antal; i++){
			
			if (data[i] < minimum){
				
				minimum = data[i];
			}
		}
	
		return minimum;	
	}
	
	public static double diff(double[] data, int antal){
		
		double diff = max(data, antal) - min(data, antal);
		
		return diff;
		
	}
}
