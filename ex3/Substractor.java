package ex3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Substractor {

	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public Substractor() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
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
	
	public void substract(double value1, double value2) {
		if(value1 > value2 ) {
			System.out.println(String.format("The result of %f - %f = %f", value1, value2, value1-value2));
		} else {
			System.out.println(String.format("The result of %f - %f = %f", value2, value1, value2-value1));
		}
	}
}
