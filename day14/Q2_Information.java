package day14;

import java.io.File;

public class Q2_Information {

	public static void main(String[] args) {
		File file = new File("C:Assignment.txt");
		if(file.exists())
		{
			System.out.println("Name of the file is: "+file.getName());
			System.out.println("Absolute path of the file is "+file.getAbsolutePath());
			System.out.println("Is the file readable: "+file.canRead());
			System.out.println("Is the file writable: "+file.canWrite());
			System.out.println("Is the file is executable: "+file.canExecute());
			System.out.println("Size of the file is : "+file.length()+" Bytes");
		}
		else
		{
			System.out.println("File doesnot exist");
		}
	}

}
