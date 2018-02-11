package ex13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractiveAccumulator {
	
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	private int serie[] = new int[100];
	
	public InteractiveAccumulator() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
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

}
