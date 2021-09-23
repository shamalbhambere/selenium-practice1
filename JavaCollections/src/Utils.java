package KayakFlights;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utils {
	/**
	 * Method to sleep
	 * 
	 * @param timeInMillis
	 */
	public void sleep(long timeInMillis) {
		try {
			Thread.sleep(timeInMillis);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
			System.out.println("Interrupted!!");
		}
	}

	/**
	 * A method to print the logs on the console with the timestamp
	 * 
	 * @param message
	 */
	public void printLog(String message) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println("Time - " + dateFormat.format(cal.getTime())
				+ " Log - " + message);
	}

}
