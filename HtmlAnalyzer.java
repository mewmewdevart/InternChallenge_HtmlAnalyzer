/*
* Project: Html Analyzer
• Author: Larissa Cristina Benedito ツ
• Description: This program is a Html Analyzer for the Axur's technical challenge, capable of obtaining the text snippet
from the deepest level of an HTML structure given a URL, even for poorly formed HTML structures.
			Challenge Finished: 03/27/2023
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

				int max_deep = 0;
				int current_deep = 0;
				String deep_text = "";
				StringBuilder currentText = new StringBuilder();

				// Read line by line from the web page 
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine().trim();

					if (line.isEmpty()) {
						continue;
					}
					// Check the prefix of tag </>
					if (line.startsWith("</")) {
						current_deep--;
						if (current_deep == max_deep) {
							if (deep_text.isEmpty()) {
								deep_text = currentText.toString().trim();
							}
							currentText = new StringBuilder();
						}
					} else if (line.startsWith("<")) {
						current_deep++;
					} else {
						currentText.append(line).append(" ");
						if (current_deep > max_deep) {
  							max_deep = current_deep;
							deep_text = currentText.toString().trim();
							currentText = new StringBuilder();
						}
					}
				}
				scanner.close();

				if (deep_text.isEmpty())
					System.exit(1);

				System.out.println(deep_text);
			} catch (MalformedURLException e) {
				System.out.print("malformed HTML");
				System.exit(1);
			} catch (IOException e) {
				System.out.print("URL connection error");
				System.exit(1);
			}
		} else {
			System.exit(1);
		}
	}
}
