public class Uppgift12 {

	public static void main(String[] args) {
		
		double[] array = new double[3];
	
		System.out.println("Tal 1: ");
		array[0] = Keyboard.readDouble();
		System.out.println("Tal 2: ");
		array[1] = Keyboard.readDouble();
		System.out.println("Tal 3: ");
		array[2] = Keyboard.readDouble();
	
		
		if (array[0] > array[1] && array[1] > array[2] ){
		
			System.out.println("stšrst fšrst: " + array[0] + " " + array[1] + " " + array[2]);
			
		}
		
		else if (array[1] > array[0] && array[0] > array[2] ){
		
			System.out.println("stšrst fšrst: " + array[1] + " " + array[0] + " " + array[2]);
		
		}

		else if (array[2] > array[1] && array[1] > array[0] ){
			
			System.out.println("stšrst fšrst: " + array[2] + " " + array[1] + " " + array[0]);
		
		}

		else if (array[2] > array[0] && array[0] > array[1] ){
			
			System.out.println("stšrst fšrst: " + array[2] + " " + array[0] + " " + array[1]);
		
		}
		
		else if (array[1] > array[2] && array[2] > array[0] ){
			
			System.out.println("stšrst fšrst: " + array[2] + " " + array[1] + " " + array[0]);
		
		}
		
		else{
			
			System.out.println("stšrst fšrst: " + array[0] + " " + array[2] + " " + array[1]);
		
		}
		
		
	
	}

}
