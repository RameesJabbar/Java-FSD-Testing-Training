package day06;

public class Continue_exmple3 {

	public static void main(String[] args) {
		aa:
		for (int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
			if(i==2 && j==2)
			{
				continue aa; //using continue it will skip the rest statement
			}
			System.out.println(i+" "+j);
			}
		}
	}

}
