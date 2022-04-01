package SBA_2;

import java.io.*;

public class Q2 {
	public static void main(String[] args) {
		try {
			File file = new File("SBA2_2.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			// content for file
			PrintWriter pw = new PrintWriter(file);
			pw.println("'this is the content'");
			pw.println("file exists");
			pw.close();
			System.out.println("file created and adding content = Done");
			System.out.println();
			System.out.println("****Reading from the file****");
			try {
				FileReader fr = new FileReader("SBA2_2.txt");
				int i;
				while ((i = fr.read()) != -1)
					System.out.print((char) i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
