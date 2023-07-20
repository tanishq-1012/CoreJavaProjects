import java.io.FileWriter;
import java.io.*;

public class Test11 {

	public static void main(String[] args)throws Exception {
		FileWriter fw = new FileWriter("xyz.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(105);
		bw.write("Neuron");
		
		bw.newLine();
		
		char[] ch = {'P','W','S','K','I','L','L','S'};
		bw.write(ch);
		bw.newLine();
		
		bw.write("Unicorn");
		
		bw.flush();// To make sure the operation is success full on file.
		bw.close();
		
		

	}

}
