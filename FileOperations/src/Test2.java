import java.io.*;


//java.io api classes are built using the standards of Unix os.
//In linux/unix os there is no difference between file and directory.
public class Test2 {

	public static void main(String[] args) {
		
		String directoryName = "IPLteams";
		
		//It treats as directory, for JVM no difference between directory and filename
		
		File f = new File(directoryName);
		System.out.println(f.exists());
		
		f.mkdir();// make directory
		
		System.out.println();
		System.out.println(f.exists());
		
	}

}
