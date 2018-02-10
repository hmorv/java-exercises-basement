package ex12;

public class Accumulator {

	public Accumulator() {
		
	}
	
	public Integer adder(int max) {
		int index = 0, total = 0;
		for(index = 0; index < max; index++) {
			if(isEven(index)) {
				total += index;
			}
		}
		
		return total;
	}
	
	private boolean isEven(int num) {
		return num % 2 == 0;
	}
}
