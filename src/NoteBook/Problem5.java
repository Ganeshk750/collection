package NoteBook;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		
		
		String output = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String input = sc.next();
	
		for(int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println(output);
        if(input.equals(output)) {
        	System.out.println("String is palindrom");
        }else {
        	System.out.println("String is not palindrom");
        }
	}

}
