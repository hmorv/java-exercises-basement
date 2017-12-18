package ex5;

public class DecimalPartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number;
		String message = "";
		DecimalPart dp = new DecimalPart();
		
		number = dp.readFromKeyboard();
		
		if(dp.isDecimal(number)) {
			message = String.format("The number %f HAS DECIMAL PART", number);
		} else {
			message = String.format("The number %f HAS NOT DECIMAL PART", number);
		}
		
		System.out.println(message);

	}

}
