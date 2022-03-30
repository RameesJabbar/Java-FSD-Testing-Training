package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("------Creating the file------");
			File file = new File("C:Assignment.txt");
			if(file.createNewFile())
			{
				System.out.println("New file ("+file.getName()+") Created");
			}
			else
			{
				System.out.println("File alredy exists");
			}
			try
			{
				System.out.println("------Writing to the file-------");
				FileWriter obj = new FileWriter("C:Assignment.txt");
				obj.write("Java is an object oriented programming language");
				obj.close();
				System.out.println("Content written succesfully");
			}
			catch(IOException e)
			{
				System.out.println("Some unknown error occured");
			}
			try
			{
				System.out.println("------Reading from the file------");
				Scanner sc = new Scanner(file);
				while(sc.hasNextLine())
				{
					String Data = sc.nextLine();
					System.out.println(Data);
				}
				sc.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Some unknown error occured");
				System.out.println(e);
			}
		}
		catch(IOException e)
		{
			System.out.println("Unknown error");
			System.out.println(e);
			
		}
	}
}

		
	


