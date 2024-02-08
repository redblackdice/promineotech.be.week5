
public class AsteriskLogger implements Logger {
	/**
	 * Asterisks prefix and suffix around the error message.
	 * @param msg The message to be shown
	 */
	public void log(String msg) {
		System.out.println("***" + msg + "***");
	}
	/**
	 * Asterisks border around the error message.
	 * @param msg The message to be shown
	 */
	public void error(String msg) {
		// Build the top and bottom asterisk border: (3 + "error: ") 10 + msg length + 3
		int lengthToRepeat = msg.length();
		StringBuilder sb = new StringBuilder("*************");
		while(lengthToRepeat-- > 0)
			sb.append("*");
		System.out.println(sb.toString());
		System.out.println("***Error: " + msg + "***");		
		System.out.println(sb.toString());
	}
}