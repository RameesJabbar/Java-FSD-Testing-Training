package day14;

import java.io.File;

public class Fileget_Example {

	public static void main(String[] args) {
		File f = new File ("C: New file.txt");
		if(f.exists()) //checking file exist or not
		{
			System.out.println("The file name is: "+f.getName());
			System.out.println("Is the file writable: "+f.canWrite());
			System.out.println("The Absolute path of the file is: "+f.getAbsolutePath());
			System.out.println("Is the file readable: "+f.canRead());
			System.out.println("Size of the file (Bytes): "+f.length());
		}
			
		else
		{
			System.out.println("File does not exists");
		}
	}
	}


