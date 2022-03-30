package day06;

public class Continue_exmple1 {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++)
		{
			if(i==5)
				continue; //using continue it will skip the rest statement
			System.out.println(i);
		}
	}

}
