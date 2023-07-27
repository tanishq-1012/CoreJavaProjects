import java.io.*;
import java.util.*;
public class ProopertiesApp {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Application.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		
		System.out.println("URL IS ::"+url);
		System.out.println("USER IS ::"+user);
		System.out.println("PASSWORD IS ::"+password);
	
	}

}
