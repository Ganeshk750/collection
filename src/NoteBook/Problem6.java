package NoteBook;

public class Problem6 {
	
   public static void main(String[] args) {
	
	   printPermutation("ABC".toCharArray(),0);
  }

   private static void printPermutation(char[] charArray, int currentFocus) {
    
	if(currentFocus == charArray.length - 1) {
		System.out.println(new String(charArray));
		return;
	}
	printPermutation(charArray, currentFocus + 1);
	for(int i = currentFocus + 1; i < charArray.length; i++) {
		char temp = charArray[currentFocus];
		charArray[currentFocus] =charArray[i];
		charArray[i] = temp;
		
		printPermutation(charArray, currentFocus + 1);
	}
  }
   
}
