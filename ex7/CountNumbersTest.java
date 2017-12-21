package ex7;

public class CountNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumbers cn = new CountNumbers();
		
		int number = cn.readFromKeyboard();
		
		System.out.println(String.format("The number %d has %d digits", number, cn.count(number)));
	}

}
