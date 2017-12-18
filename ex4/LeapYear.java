package ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	//protected int year;
	protected InputStreamReader isr;
	protected BufferedReader buff;
	
	public LeapYear() {
		//this.year = year;
		this.isr = new InputStreamReader(System.in);
		this.buff = new BufferedReader(this.isr);
	}
	
	public boolean isLeapYear(int year) {
		boolean leapYear = (( (year % 400 == 0) || (year % 100 != 0) ) && (year % 4 == 0 ));
		return leapYear;
	}
	
	public int readFromKeyboard() {
		int value;
		
		try {
			System.out.println("Write a year: ");
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
