package ex13;

import java.util.ArrayList;

public class InteractiveAccumulatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InteractiveAccumulator ia = new InteractiveAccumulator();
		ArrayList<Integer> serieList = new ArrayList<Integer>();
		int total = 0;
		int value;
		
		do {
			value = ia.readFromKeyboard();
			if(value >= 0) {
				serieList.add(value);
			}
			
		}while(value >= 0);
		
		total = ia.calculateAverage(serieList);
		System.out.println(String.format("The average value calculated is: %d", total));

	}

}
