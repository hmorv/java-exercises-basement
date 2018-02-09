package ex10;

public class OddNumbersTest {

	public static void main(String[] args) {
	
		OddNumbers on = new OddNumbers();
		
		int min, max;
		
		min = on.readFromKeyboard();
		max = on.readFromKeyboard();
		if(max<=min) {
			System.out.println(String.format("%d is not < %d", min, max));
			return;
		}
		
		int result = on.checkRange(min, max);
		
		System.out.println(String.format("odd nums between %d & %d: %d", min, max, result));
	
	}
}