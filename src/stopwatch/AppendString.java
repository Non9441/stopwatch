package stopwatch;

/**
 * Task that append chars to a string.
 * @author Non Puthikanon
 *
 */
public class AppendString implements Runnable{
	private int count;
	
	/**
	 * add count to global variable.
	 * @param count
	 */
	public AppendString(int count){
		this.count = count;
		
	}
	
	/**
	 * Append chars to a String and print out final length of String.
	 */
	public void run(){
		final char CHAR = 'a';
		System.out.printf("Append %,d chars to String\n", count);
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

}

