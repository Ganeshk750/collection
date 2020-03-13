package RandeomUsages;

import java.util.Random;

/* To Generate Random String*/

public class Problem2 {
    public static void main(String[] args) {
		String contains = "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz~!@#$%^&*";
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			sb.append(contains.charAt(random.nextInt(contains.length())));
		}
		String rmd = sb.toString();
		System.out.println(rmd);
	}
}
