package day09;
/*final*/ class Sample
{
	void run()
	{
		System.out.println("run method in Sample");
	}
}

public class Final_Example3 extends Sample {
	void run()
	{
		System.out.println("run method in FinalExmp3");
	}
	public static void main(String[] args)
	{
		Final_Example3 a=new Final_Example3();
		a.run();
	}
}

