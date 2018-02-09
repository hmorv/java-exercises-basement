package ex10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumbers {
	
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public OddNumbers() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	public int checkRange(int min, int max) {
		//ArrayList<Integer> result = new ArrayList<>();
		int total = 0;
		
		for(int counter = min; counter <= max; counter++) {
			if(this.isOdd(counter)) {
				//result.add(counter);
				total++;
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
	
	private boolean isOdd(int num) {
		return num % 2 != 0;
	}
}
