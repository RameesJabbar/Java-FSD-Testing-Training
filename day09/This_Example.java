package day09;

public class This_Example {
	int sum;
	This_Example(int example)
	{
		this.sum=example;
	}
	void display()
	{
		System.out.println("sum="+sum);
	}
	public static void main(String[] args)
	{
		This_Example obj=new This_Example(500);
		obj.display();
		This_Example two=new This_Example(750);
		two.display();

	}

}
