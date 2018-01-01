package ex8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MajorMinorMedium {
	
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public MajorMinorMedium() {
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	public int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	public int min(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}
	
	public int medium(int a, int b, int c) {
		if(a>b) {
			if(b>c) {
				return b;
			} else if(a>c) {
				return c;
			} else {
				return a;
			}
		} else {
			if(c>b) {
				return b;
			} else if(a>c) {
				return a;
			} else {
				return c;
			}
		}
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
