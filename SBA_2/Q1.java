
/*1.Create an arraylist of user-defined data type Book. it should have:-
i)Name of the Book
ii)Author of the book
iii)year of publication of the book
iV)number of copies sold.
sort the array list based on the year of publication.*/
package SBA_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Pbook{
private String name,author;
private Integer cpy,year;
public Pbook(String name,String author,Integer cpy, Integer year) {
this.name=name;
this.author=author;
this.cpy=cpy;
this.year=year;
}
public Integer getYear() {
return year;
}
@Override
public String toString() {
return " date="+year+", name="+name+", author="+author+",cpy="+cpy+"\n";
}
}
public class Q1 {
public static void main(String[] args) {
ArrayList<Pbook> bk=new ArrayList<Pbook>();
bk.add(new Pbook("wings of fire","APJ ABDUL kALAM",400,2000));
bk.add(new Pbook("an i deniel","ashlin",120,1997));
bk.add(new Pbook("Tw States","Chethan Bhagat",500,2003));
bk.add(new Pbook("The Alchemist","Paulo Coelho",1500,1988));
System.out.println(" beforesorting:\n"+bk);
bk.sort((source,target) -> {return (source.getYear() -
target.getYear());});
bk.sort(Comparator.comparingInt(Pbook::getYear));
System.out.println(bk);
}
}