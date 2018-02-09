package ex11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public EvenOdd() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	private boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	private boolean isOdd(int num) {
		return num % 2 != 0;
	}
	
	public int checkRange(int min, int max, String type) {
		//ArrayList<Integer> result = new ArrayList<>();
		int total = 0;
		
		if(type.equalsIgnoreCase("even")) {
			for(int counter = min; counter <= max; counter++) {	
				if(this.isEven(counter)) {
					total++;
				}
			}
		} else {
			for(int counter = min; counter <= max; counter++) {
				
				if(this.isOdd(counter)) {
					total++;
				}
			}
		}
		
		return total;
	}
	
	public int readFromKeyboard() {
		int value;

		try {
			System.out.println("Write a number: ");
			value = Integer.parseInt(this.buff.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			value = -1;
		} catch(NumberFormatException e) {
			System.out.println("The value entered is not a number!");
			value = -1;
		}
			
		return value;
	}
	
	public String readTypeFromKeyboard() {
		String value = "";

		try {
			do {
				System.out.println("Choose a type (even/odd): ");
				value = this.buff.readLine();
			} while(!value.equalsIgnoreCase("even")  && !value.equalsIgnoreCase("odd"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return value;
		
	}

}
