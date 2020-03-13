package Stack;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("ganesh");
		s.push("aditya");
		s.push("manish");
		s.push("deepak");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.search("ganesh"));
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.clear();
		System.out.println(s.isEmpty());
		
	}

}
