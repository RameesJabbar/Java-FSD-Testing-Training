package SBA_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {
	public static void main(String[] args) throws IOException
	{
	try {
	FileReader file=new FileReader("SBA2_2.txt");
	int data=file.read();
	while(data!=-1) {
	System.out.print((char)data);
	data=file.read();
	}
	file.close();
	}
	catch (FileNotFoundException e)
	{
	e.printStackTrace();
	}
	}

}
