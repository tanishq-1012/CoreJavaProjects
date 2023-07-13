import java.io.*;

//We can also choose the location of the file
public class Test4 {

	public static void main(String[] args)throws IOException {
		String location = "IPLteams";
		File f = new File(location);
		f.mkdir();
		
		File f1 = new File(f, "java.txt");
		f1.createNewFile();
	}

}
