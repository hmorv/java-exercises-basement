package ex1;
import java.io.*;

public class PositiveNegative {
	protected InputStreamReader isr;// = new InputStreamReader(System.in);
	protected BufferedReader buff;// = new BufferedReader(isr);
	
	public PositiveNegative() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(isr);
	}
	
	public String checkSign(int n) {
		String result = "";
		if(n > 0)
			result = "The number " + n + " is POSITIVE.";
		else if(n < 0)
			result = "The number " + n + " is NEGATIVE";
		else
			result = "The number " + n + " is ZERO.";
		
			return result;
	}
	
	public int readFromKeyboard() {
		int n;
		System.out.println("Write a number: ");
		
		try {
			n = Integer.parseInt(this.buff.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			n = -1;
		} catch(NumberFormatException e) {
			System.out.println("The value entered is not a number!");
			n = -1;
		}
		
		return n;
	}
}
