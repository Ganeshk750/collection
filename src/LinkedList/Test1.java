package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		
		LinkedList<Book> l = new LinkedList<Book>();
		l.add(new Book(101,"Let us C", "Yashwant"));
		l.add(new Book(100, "You dont know js","Simpson"));
		l.add(new Book(105, "Play with js","Simpson"));
		
		//Removing data using listIterator 
		ListIterator<Book> l2 = l.listIterator();
		l2.add(new Book(108,"Hearts of Js", "Simpson"));//adding to the first record bcz the cursor is pointing to the first positions
		while(l2.hasNext()) {
			Book b = l2.next();
			if(b.bname.equals("Let us C")) {
				l2.remove();
			}
			
		}
		//Print the data using for-each loop
		for(Book b1 : l) {
			System.out.println(b1.bid+"--"+b1.bname+"->"+b1.bAuther);
		}
		
	}

}
