package ex7;
import java.io.*;

public class CountNumbers {
	
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public CountNumbers() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	public int count(int number) {
		return Integer.toString(Math.abs(number)).length();
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
