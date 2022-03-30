//multylevel inheritance
package day4;
class Animal1
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Puppy extends Dog1
{
	void weeping()
	{
		System.out.println("Puppy is weeping");
	}
}

public class Multylevel_Inheritance {

	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.eat();
		puppy.bark();
		puppy.weeping();
	}

}
