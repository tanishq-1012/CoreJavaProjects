import java.io.*;


public class Test1 {

	public static void main(String[] args) throws Exception{
		String fileName = "abc.txt";
		
		//This line will check whether the file called "abc.txt" exists or not
		//If it is available then it would go and point to that file otherwise
		//it will represent a java file object, not a physical file.
		
		File f = new File(fileName);
		System.out.println(f.exists());
		
		//It will create a physical file if the file does not exists for 
		//the java file object
		f.createNewFile();
		
		System.out.println(f.exists());
		
		
	}
	//JVM shutdown now

}
