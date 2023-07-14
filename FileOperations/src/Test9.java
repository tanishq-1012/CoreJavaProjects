import java.io.*;
public class Test9 {

	public static void main(String[] args) throws Exception {
		FileReader f1 = new FileReader("Harry.txt");
		int i = f1.read();
		
		while(i!=-1) {
			System.out.println((char)i);
			i = f1.read();
		}
	}

}
