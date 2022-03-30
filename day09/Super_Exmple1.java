package day09;
class Animal// super-class/ parent-class
{
	String color="white";
}

public class Super_Exmple1 extends Animal {
	String color="brown";
	void printcolor()
	{
		System.out.println(color);//brown
		System.out.println(super.color);//white
	}
	public static void main(String[] args)
	{
		Super_Exmple1 obj1=new Super_Exmple1();
		obj1.printcolor();
	}
}
