package NoteBook;

public class Problem1 {

	public static void main(String[] args) {
		
		/* To Check String  Has Unique character true false*/
		
         String str = "java";
         boolean result = checkForUnique(str);
         System.out.println(result);
	}

	private static Boolean checkForUnique(String str) {
		boolean isUnique = false;
		for(char c : str.toCharArray()) {
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				isUnique = true;
			}else {
				isUnique = false;
			}
		}
		return isUnique;
	}

}
