package stopwatch;

import java.math.BigDecimal;

/**
 * Task that add BigDecimal objects from an array.
 * @author Non Puthikanon
 *
 */
public class SumBigDecimal implements Runnable{
	private int counter;
	private int ARRAY_SIZE;
	BigDecimal[] values;
	
	/**
	 * add counter and ARRAY_SIZE to global variable.
	 * @param counter is how many times you want to sum array of BigDecimal. 
	 * @param ARRAY_SIZE is  a constant of an array size you define.
	 */
	public SumBigDecimal(int counter, int ARRAY_SIZE){
		this.counter = counter;
		this.ARRAY_SIZE = ARRAY_SIZE;
		this.values = new BigDecimal[ARRAY_SIZE];
		
	}
	
	/**
	 * Sum array of BigDecimal and print out information etc. sum value,count value.
	 */
	public void run(){
		System.out.printf("Sum array of BigDecimal with count=%,d\n", counter);
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
		BigDecimal sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
		System.out.println("sum = " + sum);
	}

}

