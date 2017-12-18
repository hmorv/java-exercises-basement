package ex3;

public class SubstractorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value1, value2;
		
		Substractor sb = new Substractor();
		
		value1 = sb.readFromKeyboard();
		value2 = sb.readFromKeyboard();
		
		sb.substract(value1, value2);

	}
		

}