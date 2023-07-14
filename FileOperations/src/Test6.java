import java.io.*;
public class Test6 {

	public static void main(String[] args)throws Exception {
		int dirCount = 0;
		int fileCount = 0;
		
		String location = "/Users/tanishqsharma/Desktop/FULLSTACKJAVA";
		File f = new File(location);
		
		String[] names = f.list();
		
		for(String name : names) {
			//
			File f1 = new File(f,name);
			
			if(f1.isDirectory())
				dirCount++;
			else if(f1.isFile())
				fileCount++;
			
			System.out.println(name);
		}
		System.out.println("Total number of files :: "+ fileCount);
		System.out.println("Total number of directory :: "+ dirCount);
	}

}
