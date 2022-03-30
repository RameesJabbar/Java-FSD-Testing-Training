package day09;

public class Static_Example2 {
	static int cube(int x)//static method
	{
		return x*x*x;
	}
	int square(int x)//non-static method
	{
		return x*x;
	}
	public static void main(String[] args)
	{
		int result=cube(3);//27
		Static_Example2 obj=new Static_Example2();
		int res=obj.square(5);//25
		System.out.println(result);
		System.out.println(res);
	}
}
