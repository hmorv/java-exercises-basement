package ex6;

public class AreOrderedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreOrdered ao = new AreOrdered();
		int num1, num2, num3;
		num1 = ao.readFromKeyboard();
		num2 = ao.readFromKeyboard();
		num3 = ao.readFromKeyboard();
		
		if(ao.ordered(num1, num2, num3)) {
			System.out.println(String.format("Numbers %d, %d and %d are ordered", num1, num2, num3));
		} else {
			System.out.println(String.format("Numbers %d, %d and %d ARE NOT ORDERED", num1, num2, num3));
		}
		
		if(ao.areConsecutive(num1, num2, num3)) {
			System.out.println(String.format("Numbers %d, %d and %d are consecutive", num1, num2, num3));
		} else {
			System.out.println(String.format("Numbers %d, %d and %d ARE NOT consecutive", num1, num2, num3));
		}
	}

}
