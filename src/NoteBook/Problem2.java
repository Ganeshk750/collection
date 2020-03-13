package NoteBook;

public class Problem2 {

	public static void main(String[] args) {
		/* To reverse the string */
		String str = "Ganesh";
		char abc [] = str.toCharArray();
		for(int i = abc.length - 1 ; i >= 0; i--) {
			System.out.println(abc[i]);
		}

	}

}
