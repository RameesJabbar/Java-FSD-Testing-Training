package day4;

public class Method_Overload {
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(11,13);
		add(10,11,12);
	}

}
