package day06;
interface Mobile
{
	void apple(); //abstract methods
	void samsung();
}
class Secuirity implements Mobile 
{
	public void apple()
	{
		System.out.println("Apple has more secuirity features");
	}
	public void samsung()
	{
		System.out.println("Less than apple");
	}
}
class Os implements Mobile
{
	public void apple()
	{
		System.out.println("IOS");
	}
	public void samsung()
	{
		System.out.println("Android OS");
	}
}

public class Q1b_Interface {

	public static void main(String[] args) {
		Secuirity secuirity = new Secuirity();
		secuirity.apple();
		secuirity.samsung();
		Os os = new Os();
		os.apple();
		os.samsung();
	}

}
