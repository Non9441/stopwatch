package stopwatch;

/**
 * This is a stopwatch that can measure the time from start until you make it
 * stop.
 * 
 * @author Non Puthikanon
 *
 */
public class Stopwatch {
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean isRun = false;

	/**
	 * You will get the elapsed time in second.
	 * 
	 * @return is the value of elapsed time in double in second.
	 */
	public double getElapsed() {
		if (this.isRun == false) {
			return (this.stopTime - this.startTime) * NANOSECONDS;
		} else {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		}
	}

	/**
	 * This method make the stopwatch start the timer.
	 */
	public void start() {
		if (this.isRun == false) {
			this.startTime = System.nanoTime();
			this.isRun = true;
		}
	}

	/**
	 * This method make the stopwath stop the timer.
	 */
	public void stop() {
		if (this.isRun == true) {
			this.stopTime = System.nanoTime();
			this.isRun = false;
		}
	}

}
