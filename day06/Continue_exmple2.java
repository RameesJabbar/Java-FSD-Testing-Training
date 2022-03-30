package day06;

public class Continue_exmple2 {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
			if(i==j)
			{
				continue; //using continue it will skip the rest statement
			}
			System.out.println(i+" "+j);
			}
		}
	}

}
