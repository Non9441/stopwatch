package stopwatch;

/**
 * Task that append chars to a string.
 * 
 * @author Non Puthikanon
 *
 */
public class AppendString implements Runnable {
	private int count;
	private String result = "";

	/**
	 * add count to global variable.
	 * 
	 * @param count
	 */
	public AppendString(int count) {
		this.count = count;

	}

	/**
	 * Append chars to a String and print out final length of String.
	 */
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
	}

	public String toString() {
		return (String.format("Append %,d chars to String\nfinal string length = %d", count, result.length()));
	}

}
