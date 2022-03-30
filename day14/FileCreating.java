package day14;

import java.io.File;
import java.io.IOException;

public class FileCreating {

	public static void main(String[] args) {
		try {
			File f1 = new File ("C: New file.txt");
			if (f1.createNewFile())
			{
				System.out.println("A new file named "+f1.getName()+" Created");
			}
			else
			{
				System.out.println("File Already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("An unexpected error occured");
			System.out.println(e);
		}
	}

}
