import java.io.*;
public class Test5 {

	public static void main(String[] args) {
		int count = 0;
		
		String location = "/Users/tanishqsharma/Desktop/JavaPrograms";
		
		File f = new File(location);
		
		String[] names = f.list();
		
		for(String i : names) {
			count++;
			System.out.println(i);
			
		}
		System.out.println("Total number of files is :: "+count);

	}

}
