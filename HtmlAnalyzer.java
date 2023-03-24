
public	class HtmlAnalyzer {
	public static void main(String[] args) {
		// Check if the correct number of arguments have been provided in the command line
		if (args.length == 1) {
			String urlString = args[0];
			System.out.println(urlString);
		} else { 
			System.out.println("Error: The program requires a limited arguments in the command line!");
			System.out.println("Try usage: java HtmlAnalyzer <insert-url-here>");
		}
	}
}
