package ex8;

public class MajorMinorMediumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorMinorMedium mmm = new MajorMinorMedium();
		
		int a, b, c;
		
		a = mmm.readFromKeyboard();
		b = mmm.readFromKeyboard();
		c = mmm.readFromKeyboard();
		
		System.out.println(String.format("Minor element: %d", mmm.min(a, b, c)));
		System.out.println(String.format("Medium: %d", mmm.medium(a, b, c)));
		System.out.println(String.format("M element: %d", mmm.max(a, b, c)));

	}

}
