package ex9;

public class EvenNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenNumbers en = new EvenNumbers();
		
		int min, max;
		
		min = en.readFromKeyboard();
		max = en.readFromKeyboard();
		
		int result = en.checkRange(min, max);
		
		System.out.println(String.format("even nums between %d & %d: %d", min, max, result));
		
	}

}
