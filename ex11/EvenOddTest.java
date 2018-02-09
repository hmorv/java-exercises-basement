package ex11;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd eo = new EvenOdd();
		
		int min, max, result;
		String type = "";
		
		min = eo.readFromKeyboard();
		max = eo.readFromKeyboard();
		type = eo.readTypeFromKeyboard();
		
		if(min<max) {
			result = eo.checkRange(min, max, type);
		} else {
			result = eo.checkRange(max, min, type);
		}
		
		System.out.println(String.format("%s nums between %d & %d: %d", type, min, max, result));

	}

}
