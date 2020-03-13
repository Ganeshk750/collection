package StringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Stirng");
	   String input = sc.nextLine();
	   String [] words = input.split(" ");
	   Map<String, Integer> wordMap = new HashMap<String, Integer>();
	   for(String str : words) {
		   if(wordMap.get(str) != null) {
			  wordMap.put(str, wordMap.get(str)+ 1);
		   }else {
			 wordMap.put(str, 1); 
		   }
		   Set<String> strA = wordMap.keySet();
			  for(String str1: strA)  {
				  System.out.println("Word:"+ str1 + wordMap.get(str1));
			  }
	   }

	}

}
