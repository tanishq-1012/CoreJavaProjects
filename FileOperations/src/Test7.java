import java.io.*;
public class Test7 {

	public static void main(String[] args)throws Exception {
		int dirCount = 0;
		int jpgFileCount = 0;
		int txtFileCount = 0;
		int zipFileCount = 0;
		
		String location = "/Users/tanishqsharma/Desktop";
		File f = new File(location);
		
		String[] names = f.list();
		
		for(String name : names) {
			
			File f1 = new File(f,name);
			
			if(f1.isDirectory())
				dirCount++;
			else if(f1.isFile()) {
				if(name.endsWith(".png"))
					jpgFileCount++;
				if(name.endsWith(".txt"))
					txtFileCount++;
				if(name.endsWith(".zip"))
					zipFileCount++;
				
			}
			
			
			System.out.println(name);
		}
		System.out.println("Total number of JPG files :: "+ jpgFileCount);
		System.out.println("Total number of TXT files :: "+ txtFileCount);
		System.out.println("Total number of ZIP files :: "+ zipFileCount);
		System.out.println("Total number of directory :: "+ dirCount);

	}

}
