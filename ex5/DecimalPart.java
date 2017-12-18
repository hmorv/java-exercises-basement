package ex5;
import java.io.*;

public class DecimalPart {
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public DecimalPart() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	public boolean isDecimal(double number) {
		return (number - Math.round(number)) > 0;
	}
	
	public double readFromKeyboard() {
		double value;
		
		try {
			System.out.println("Write a number: ");
			value = Double.parseDouble(this.buff.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			value = -1.0;
		} catch(NumberFormatException e) {
			System.out.println("The value entered is not a number!");
			value = -1.0;
		}
			
		return value;
	}
}
