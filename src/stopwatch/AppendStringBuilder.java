package stopwatch;

/**
 * Task that append chars to a StringBuilder
 * @author Non Puthikanon
 *
 */
public class AppendStringBuilder implements Runnable{
	private int count;
	
	/**
	 * add count value to global variable.
	 * @param count is number that you want how long your String would be.
	 */
	public AppendStringBuilder(int count){
		this.count = count;
	}
	
	/**
	 * Append chars to a StringBuilder and print out final length of String.
	 */
	public void run(){
		final char CHAR = 'a';
		System.out.printf("Append %,d chars to StringBuilder\n", count);
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}

}

