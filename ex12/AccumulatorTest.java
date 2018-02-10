package ex12;

public class AccumulatorTest {

	public static void main(String[] args) {
		int num = 1000;
		Accumulator acc = new Accumulator();
		
		System.out.println(String.format("The first 1000 even numbers sums %d", acc.adder(num)));

	}

}
