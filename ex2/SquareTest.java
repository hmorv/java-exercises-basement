package ex2;

public class SquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		double number = sq.readFromKeyboard();
				
		System.out.println(String.format("The square root of %f is: %f", number, sq.calculateSquare(number)));
	}

}
