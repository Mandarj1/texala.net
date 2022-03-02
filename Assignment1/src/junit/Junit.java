package junit;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Junit {
	public void junit(String str) throws IOException {
		URL url = new URL(str);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
			String line = null;
			StringBuilder sb = new StringBuilder();
			while ((br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				try {
					FileWriter myFile = new FileWriter("web-content.txt");
					myFile.append(sb);

					System.out.println("html code written in web-content.txt file");
				} catch (Exception e) {
					System.out.println("an error occurred");
					e.printStackTrace();
				}
			}
		}
	}
}
