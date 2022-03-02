package texalaassig1;

import java.io.IOException;
import java.net.MalformedURLException;

import service.Service;

public class Texalaassig1 {
	public static void main(String[] args) throws IOException {
		Service htmlcode= new Service();
		try {
			htmlcode.service("http://www.google.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
