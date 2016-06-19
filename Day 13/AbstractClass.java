//Day 13: Abstract Class Solution. 30- Days-of-Code Hackerrank Solution
//This program gives good example of Abstract Class and Inheritance

import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}

class MyBook extends Book{
	private int p;
	
	MyBook(String title,String author, int price){
		super(title,author);
		p=price;
	}

	@Override
	void display() {
		System.out.println(
				"Title: "+title+
				"\nAuthor: "+author+
				"\nPrice: "+p);
	}
}

public class AbstractClass
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}
