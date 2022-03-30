package day4;
class Animal2
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class cat extends Animal2
{
	void weeping()
	{
		System.out.println("cat is meow");
	}
}
public class Hirarchial_Inheritance {

	public static void main(String[] args) {
		cat obj = new cat();
		obj.eat();
		obj.weeping();
		
	}

}
