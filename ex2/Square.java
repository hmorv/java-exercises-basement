package ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
	
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public Square() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	public double calculateSquare(double n) {
		if (n >= 0)
		{
			return Math.sqrt(n);
		} else {
			return -1;
		}
	}
	
	public double readFromKeyboard() {
		double n;
		System.out.println("Write a number: ");
		
		try {
			n = Double.parseDouble(this.buff.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			n = -1.0;
		} catch(NumberFormatException e) {
			System.out.println("The value entered is not a number!");
			n = -1.0;
		}
		
		return n;
	}
}
