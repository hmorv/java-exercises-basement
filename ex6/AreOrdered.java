package ex6;
import java.io.*;

public class AreOrdered {
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public AreOrdered() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	public boolean ordered(int a, int b, int c) {
		return (a < b) && (b < c);
	}
	
	public boolean areConsecutive(int a, int b, int c) {
		return (a+1 == b && a+2 == c);
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
