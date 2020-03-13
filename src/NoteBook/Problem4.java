package NoteBook;

public class Problem4 {
	
	private static String compress(String s) {
		String out = "";
		int sum = 1;
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				sum++;
			}else {
				out = out + s.charAt(i) + sum;
				sum = 1;
			}
		}
		out = out + s.charAt(s.length() - 1) + sum;
		return out.length() < s.length() ? out :s;
	}

	public static void main(String[] args) {
		// Compress to a String ->aabccdee to -> a2b1c2d1e2
		
		System.out.print(compress("aabccdee"));
		

	
	}

}
