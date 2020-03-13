package NoteBook;

import java.util.HashMap;
import java.util.Set;

public class Problem7 {

	
	public static void duplicate(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char [] strArray = inputString.toCharArray();
		for(char c : strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			}else {
				charCountMap.put(c, 1);
				System.out.println("Duplicate Character in:"+ inputString);
			}
			
			Set<Character> charInstring = charCountMap.keySet();
			for(char ch: charInstring) {
				if(charCountMap.get(ch) > 1) {
					System.out.println(ch+":"+charCountMap.get(ch));
				}
			}
		}
	}

	public static void main(String[] args) {
		
		duplicate("javaessential");
		
	
	}

}
