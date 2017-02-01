package stopwatch;

/**
 * Call a stopwatch to measure the time that each task use to run.
 * @author Non Puthikanon
 *
 */
public class TaskTimer {
	
	/**
	 * Measure the time that each task use to run and print it out.
	 * @param r is the task that you want to measure.
	 */
	public void measureAndPrint(Runnable r){
		Stopwatch timer = new Stopwatch();
		timer.start();
		r.run();
		
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
