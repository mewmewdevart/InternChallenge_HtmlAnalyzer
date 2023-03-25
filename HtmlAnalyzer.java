/*
* Project: Html Analyzer
• Author: Larissa Cristina Benedito ツ
• Description: This program is a Html Analyzer for the Axur's technical challenge, capable of obtaining the text snippet
from the deepest level of an HTML structure given a URL, even for poorly formed HTML structures.
			Challenge Finished: 03/25/2023
				Check out my other projects on Github: https://github.com/mewmewdevart
*/

import java.net.URL; // Open connections to internet resources using URLs to read or record data
import java.net.URLConnection;  // Open the good connection doors(HTTP) using URLs
import java.io.InputStream; // Convert byte streams to character streams
import java.util.Scanner; // Read input information
import java.net.MalformedURLException; // Error : Invalid URLs
import java.io.IOException;  // Error: Input/output error while reading or writing

public class HtmlAnalyzer {
	public static void main(String[] args) {
		// Check if the correct number of arguments have been provided in the command line
		if (args.length == 1) {
			String urlString = args[0];
			try {
				URL url = new URL(urlString);
				URLConnection connection = url.openConnection();
				connection.connect();
	
				InputStream inputStream = connection.getInputStream();
				Scanner scanner = new Scanner(inputStream);
	
				int depth = 0;
				String currentTag = "";
				boolean foundText = false;

				// Read line by line from the web page 
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine().trim();

					// Check if exist empty line
					if (line.isEmpty())
						continue;

					// Filter the differents prefixs of HTML tag's
					if (line.startsWith("</")) {
						currentTag = currentTag.substring(0, currentTag.length() - line.length() + 2);
						depth--;
					} else if (line.startsWith("<")) {
						currentTag += line + ">";
						depth++;
					} else {
						if (!foundText && depth == 2) {
							System.out.println(line);
							foundText = true;
						}
					}

					if (depth == 0)
						currentTag = "";
				}
				scanner.close();
	
				// Check the errors
				if (!foundText)
					System.exit(1);
			} catch (MalformedURLException e) {
				System.out.println("malformed HTML");
				System.exit(1);
			} catch (IOException e) {
				System.out.println("URL connection error");
				System.exit(1);
			}
		} else {
			System.exit(1);
		}
	}
}
