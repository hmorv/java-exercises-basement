package ex4;

public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "";
		LeapYear lp = new LeapYear();
		int year = lp.readFromKeyboard();
		
		if(lp.isLeapYear(year)) {
			message = String.format("The year %d IS a leap year.", year);
		} else {
			message = String.format("The year %d IS NOT a leap year.", year);
		}
		
		System.out.println(message);

	}

}
