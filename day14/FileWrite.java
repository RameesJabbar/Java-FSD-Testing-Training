package day14;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		try
		{
			FileWriter obj = new FileWriter("C: New file.txt");
			obj.write("iam writing to the file from program");
			obj.close();
			System.out.println("Content has been written succesfully");
		}
		catch(IOException e)
		{
			System.out.println("Some unexpected error occured");
			System.out.println(e);
		}
	}

}
