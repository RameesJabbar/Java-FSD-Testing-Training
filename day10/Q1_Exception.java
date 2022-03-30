package day10;

public class Q1_Exception {

	public static void main(String[] args) {
		try
		{
			String str1 = null;
			System.out.println(str1.length());
			try
			{
				int a = 10/0;
				System.out.println(a);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.println("Rest of the code");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Cant divided by 0");
		}
	}

}
