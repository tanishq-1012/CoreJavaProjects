import java.io.*;
public class Test3 {

	public static void main(String[] args)throws IOException {
		
		File f = new File("Ineuron");
		f.mkdir();//make directory
		System.out.println("Is f pointing to a directory :: "+f.isDirectory());
		
		File f1 = new File(f,"abc.txt");// Make a text file name abc in the Ineuron directory.
		f1.createNewFile();
		System.out.println("Is f1 pointing to a file :: "+f1.isFile());
		
	}
	

}
