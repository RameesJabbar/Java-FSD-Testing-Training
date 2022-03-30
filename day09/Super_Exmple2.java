package day09;
class Anim
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}

public class Super_Exmple2 extends Anim{
	void eat()
	{
		System.out.println("Cat is eating");
	}
	void test()
	{
		super.eat();
	}
	public static void main(String[] args)
	{
		Super_Exmple2 obj1=new Super_Exmple2();
		obj1.eat();
		obj1.test();
	}
}

