package RandeomUsages;

import java.util.Random;

/* To Generate  Random Names*/
public class Problem1 {
	
	public static void main(String[] args) {
		String name [] = {"Ganesh", "Deepak","Aditya", "Arnav", "Mudit","Sashi" };
		
		//System.out.println(name[new Random().nextInt(name.length)]);
		String a = name[new Random().nextInt(name.length)];
		System.out.println(a);
	}

}
