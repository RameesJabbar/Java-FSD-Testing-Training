package day06;

public class BreakExmple3 {

	public static void main(String[] args) {
		//outer loop
		label1 : for(int i=1; i<=3; i++)
			{
			for(int j=1; j<=3; j++)
			{
			if(i==2 && j==2)
				break label1; //outer loop will terminate
			System.out.println(i+" "+j);
			}
		}
		System.out.println("End of the program");
	}

}
