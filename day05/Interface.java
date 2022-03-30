package day05;
interface shape
{
	void display(); //methods inside interface always be abstract methods 
}
class Rectangle implements shape
{
	Rectangle() //constructor 'Rectangle'
	{
		System.out.println("Rectangle class Rectangle constructor");
	}
	public void display()
	{
		System.out.println("Display method is called in rectangle class");
	}
}
class Triangle implements shape
{
	Triangle()
	{
		System.out.println("Triangle class Triangle constructor");
	}
	public void display()
	{
		System.out.println("Display method is called in Triangle class");
	}
}

public class Interface {

	public static void main(String[] args) {
		shape obj = null;
		obj = new Rectangle();
		obj.display();
		obj = new Triangle();
		obj.display();
	}

}
