package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		try
		{
			File file = new File("C: New file.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("There is some unexpected problem");
			System.out.println(e);
		}
	}

}
