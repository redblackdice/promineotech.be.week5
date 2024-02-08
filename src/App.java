
public class App {
	/**
	 * Entry point of application showing the instantiation and usage of AsteriskLogger
	 * and SpacedLogger class.
	 * @param args Unused arguments
	 */
	public static void main(String args[]) {
		Logger loggers[] = { new AsteriskLogger(), new SpacedLogger() };
		for(Logger logger : loggers) {
			logger.log("log()");
			logger.error("error()");
		}
	}
}