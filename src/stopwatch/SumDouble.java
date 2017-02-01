package stopwatch;

/**
 * Task that add Double objects from an array.
 * @author Non Puthikanon
 *
 */
public class SumDouble implements Runnable{
	private int counter;
	private int ARRAY_SIZE;
	Double[] values;
	
	/**
	 * add counter and ARRAY_SIZE to global variable.
	 * @param counter is how many times you want to sum array of Double object.
	 * @param ARRAY_SIZE is a constant of an array size you define.
	 */
	public SumDouble(int counter, int ARRAY_SIZE){
		this.counter = counter;
		this.ARRAY_SIZE = ARRAY_SIZE;
		values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
		
	}
	
	/**
	 * Sum array of Double objects and print out information etc. sum value,count value.
	 */
	public void run(){
		System.out.printf("Sum array of Double objects with count=%,d\n", counter);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

}

