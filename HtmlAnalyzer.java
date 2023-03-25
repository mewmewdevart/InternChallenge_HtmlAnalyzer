/*
• Author: Larissa Cristina Benedito ツ
• Description: This program is a Html Analyzer for the Axur's technical challenge, capable of obtaining the text snippet
from the deepest level of an HTML structure given a URL, even for poorly formed HTML structures.
			Challenge Finished: 03/00/2023
				Check out my other projects on Github: https://github.com/mewmewdevart
*/
import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;

public	class HtmlAnalyzer {
	public static void main(String[] args) {
		// Check if the correct number of arguments have been provided in the command line
		if (args.length == 1) {
			String urlString = args[0];
			try {
				URL url = new URL(urlString);
				System.out.println("URL: " + urlString);

				// Scanner object to read the contents of the web page
				Scanner scanner = new Scanner(url.openStream());
				
				// Read line by line from the web page and print it to the screen
				while (scanner.hasNext()) {
					System.out.println(scanner.nextLine());
				}

				scanner.close();
			} catch (MalformedURLException e) {
				System.out.println("malformed URL");
			} catch (IOException e) {
				System.out.println("URL connection error");
			}
		} else { 
			System.out.println("Error: The program requires one argument in the command line!\n Try usage: java HtmlAnalyzer <insert-url-here>");
		}
	}
}
