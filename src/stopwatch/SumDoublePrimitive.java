package stopwatch;

/**
 * Task that add double primitives from an array.
 * @author Non Puthikanon
 *
 */
public class SumDoublePrimitive implements Runnable{
	private int counter;
	private int ARRAY_SIZE;
	double[] values;
	
	/**
	 * add counter and ARRAY_SIZE to global variable.
	 * @param counter is how many times you want to add double.
	 * @param ARRAY_SIZE is a constant of an array size you define.
	 */
	public SumDoublePrimitive(int counter,int ARRAY_SIZE){
		this.counter = counter;
		this.ARRAY_SIZE = ARRAY_SIZE;
		this.values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
	}
	
	/**
	 * Sum array of double primitives and print out information etc. sum value,count value.
	 */
	public void run(){
		System.out.printf("Sum array of double primitives with count=%,d\n", counter);
		double sum = 0.0;
		// count = loop counter, i = array index value
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

}
