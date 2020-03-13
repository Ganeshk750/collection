package NoteBook;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		/* To check two string are anagram */ 
        
		System.out.println(checkAnagram("abcd","dabc"));
	}

	private static boolean checkAnagram(String string, String string2) {
		if(string.length() != string2.length()) {
			return false;
		}
		char [] a = string.toCharArray();
		char [] b = string2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a,b);
	}

}
