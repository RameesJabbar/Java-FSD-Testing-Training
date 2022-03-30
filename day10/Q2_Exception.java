package day10;

public class Q2_Exception {

	public static void main(String[] args) {
		try
		{
			int[] arr1={1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr1[15]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
