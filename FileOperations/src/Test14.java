import java.io.*;
public class Test14 {

	public static void main(String[] args)throws Exception {
		PrintWriter pw = new PrintWriter("file6.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader("file4.txt"));
		String line1 = br1.readLine();
		
		BufferedReader br2 = new BufferedReader(new FileReader("file5.txt"));
		String line2 = br2.readLine();
		
		while(line1!=null || line2!=null) {
			pw.println(line1);
			line1 = br1.readLine();
			
			pw.println(line2);
			line2 = br2.readLine();
		}
		
		pw.flush();
		
		br1.close();
		br2.close();
		pw.close();
		
		System.out.println("Open file6.txt to see the output");
	}

}
