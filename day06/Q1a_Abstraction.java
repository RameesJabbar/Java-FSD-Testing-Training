package day06;
abstract class Car
{
	Car() //constructor
	{
		System.out.println("Car has 4 wheels");
	}
	abstract void engine(); //abstract methods
	abstract void safety();
	void color() //regular method
	{
		System.out.println("There are various colors");
	}
}
class Audi extends Car
{
	void engine() 
	{
		System.out.println("Audi has more powerfull engine");
	}
	void safety()
	{
		System.out.println("Audi has more safety features");
	}
	void color() //color method is overridden
	{
		System.out.println("This is black colour Audi");
	}
}

public class Q1a_Abstraction {

	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.engine();
		audi.safety();
		audi.color();
	}

}
