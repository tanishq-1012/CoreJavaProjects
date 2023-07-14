import java.io.*;
public class Test8 {

	public static void main(String[] args)throws IOException {
		File f1 = new File("tan.txt");
		FileWriter f2 = new FileWriter(f1,true);
		//We set true for appending but if we make it false then it will override the output.
		
		
		//Performing write operation on a file
		
		f2.write(97);
		f2.write("\n");
		f2.write("Hello Sachin how are you ???");
		f2.write("\n");
		char[] ch = {'P','W','S','K','I','L','L','S'};
		f2.write(ch);
		
		//making the data to write to the file
		f2.flush();
		
		//closing the resource
		f2.close();
		
		System.out.println("Open tan.txt to see the output");
	}

}
