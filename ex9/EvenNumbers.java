package ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;

public class EvenNumbers {
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public EvenNumbers() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	public int checkRange(int min, int max) {
		//ArrayList<Integer> result = new ArrayList<>();
		int total = 0;
		
		for(int counter = min; counter <= max; counter++) {
			if(this.isEven(counter)) {
				//result.add(counter);
				total++;
			}
		}
		
		//System.out.println(String.format("Min value: %d, max value:", min, max));
		
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
	
	private boolean isEven(int num) {
		return num % 2 == 0;
	}

}