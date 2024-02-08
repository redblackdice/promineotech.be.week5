
public class SpacedLogger implements Logger {
	/**
	 * Adds spaces between the letters for a given string.
	 * @param text The text to add inner spaces
	 * @return The text with letters spaced out
	 */
	private String spacedText(String text) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < text.length(); ++i) {
			// Adds the character given at "i"
			sb.append(text.charAt(i));
			// Add space if less than the string length max
			if(i + 1 < text.length())
				sb.append(" ");
		}
		return sb.toString();
	}
	/**
	 * Prints out to system of string with spaces in between characters.
	 */
	public void log(String msg) {
		System.out.println(this.spacedText(msg));
	}
	/**
	 * Prints out to system of string with spaces in between characters, prefixed with "ERROR: ".
	 */
	public void error(String msg) {
		System.out.println("ERROR: " + this.spacedText(msg));
	}
}