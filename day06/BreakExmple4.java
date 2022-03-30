package day06;

public class BreakExmple4 {

	public static void main(String[] args) {
		//outer loop
		outer:
		for(int i=1; i<=3; i++)
		{
			inner:
			for(int j=1; j<=3; j++)
			{
				System.out.println(i+" "+j);
				if(j==2)
				{
					break inner; //inner loop will terminate
				}
				if(i==j)
				{
					continue outer;
				}
				System.out.println("Bye");
			}
					
			
			}
	}
}
