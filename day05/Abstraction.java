package day05;
abstract class Bike
{
	Bike() // constuctor
	{
		System.out.println("Bike class constuctor");
	}
	void run() //regular method
	{
		System.out.println("Bike class run method");
	}
	abstract void display(); //abstract method (not having a body)
}
class Suzuki extends Bike
{
	void run() //method overriding
	{
		System.out.println("Suzuki class run method");
	}
	void display() //The abstract method is being implemented
	{
		System.out.println("Suzuki is a top tier bike");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Bike obj = new Suzuki();
		obj.run();
		obj.display();
	}

}
