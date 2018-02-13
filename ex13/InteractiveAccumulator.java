package ex13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InteractiveAccumulator {
	
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public InteractiveAccumulator() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	public int calculateAverage(ArrayList<Integer> serie) {
		int sum = 0;
		for(int counter = 0; counter < serie.size(); counter++) {
			sum += serie.get(counter);
		}
		
		return sum / serie.size();
	}
	
	public int readFromKeyboard() {
		int value;

		try {
			System.out.println("Write a number (negative for exit): ");
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

}
