package ex1;

public class PositiveNegativeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNegative posneg = new PositiveNegative();
		
		int n = posneg.readFromKeyboard();
		String result = posneg.checkSign(n);
		System.out.println(result);
	}

}
