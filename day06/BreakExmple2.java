package day06;

public class BreakExmple2 {

	public static void main(String[] args) {
		//outer loop
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
			if(i==2 && j==2)
				break; //when i become 5 loop will terminate
			System.out.println(i+" "+j);
			}
		}
	}

}
