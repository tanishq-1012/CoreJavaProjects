import java.io.*;
public class Test12 {

	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("xyz.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!= null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();// internally fr.close() call will happen
	}

}
