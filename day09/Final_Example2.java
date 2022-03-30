package day09;
class Example
{
	final void test()
	{
		System.out.println("test method in Example class");
	}
}

public class Final_Example2 extends Example {
	//void test()
	{
		System.out.println("test method in FinalExmp2 class");
	}
	public static void main(String[] args)
	{
		Final_Example2 a=new Final_Example2();
		a.test();
	}

}
