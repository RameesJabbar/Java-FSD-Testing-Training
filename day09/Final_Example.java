package day09;

public class Final_Example {
	int a=5;
	void test()
	{
		a=350;
		System.out.println("a value after changing="+a);
	}
	public static void main(String[] args)
	{
		Final_Example a=new Final_Example();
		System.out.println("a ="+a);
		a.test();
	}
}


