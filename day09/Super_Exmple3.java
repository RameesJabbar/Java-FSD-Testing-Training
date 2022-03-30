package day09;
class Animal1
{
	Animal1()
	{
		System.out.println("animal class constructor is called");
	}
}

public class Super_Exmple3 extends Animal1{
	Super_Exmple3()
	{
		super();
		System.out.println("sub class constructor is called");
	}
	public static void main(String[] args)
	{
		Super_Exmple3 a=new Super_Exmple3();
	}
}

