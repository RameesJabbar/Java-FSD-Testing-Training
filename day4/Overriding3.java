package day4;
class School
{
	int students_no=300;
}
class Computers_class extends School
{
	int students_no=45;

}
public class Overriding3 {

	public static void main(String[] args) {
		School obj = new Computers_class(); //upcasting
		System.out.println(obj.students_no); //300(Data members cannot be overridden 
	}

}
