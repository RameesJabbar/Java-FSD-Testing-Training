package day06;
public class Q3b_Break {

	public static void main(String[] args) {
		label : for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
			if(i==5 && j==5)
			{
				break label;
			}
			System.out.println(i+" "+j);
			}
		}
	}

}
