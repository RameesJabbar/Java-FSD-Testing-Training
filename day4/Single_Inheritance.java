//single inheritance
package day4;
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		//creating object for dog class
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
	}

}
