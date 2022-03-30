package day09;

public class Static_Exmple1 {
	static int count=0; // a.count, b.count, c.count
	Static_Exmple1()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		Static_Exmple1 a=new Static_Exmple1();
		Static_Exmple1 b=new Static_Exmple1();
		Static_Exmple1 c=new Static_Exmple1();	
	}

}
