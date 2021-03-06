package string.operations.using.stacks;

import fixed.size.stacks.of.strings.Stack ;

public class PalindromeCheck {

	Stack palStack = new Stack() ;

	public static void main(String[] args) {
		String word = "madam";
		new PalindromeCheck().checkForPalindrome(word) ;
	}

	private void checkForPalindrome( String word) {
		pushWordOnStack( word );
		if( isPalindrome(word)){
			System.out.println("Its a palindrome!");
		}else{
			System.out.println("Its not a palindrome!");
		}
	}

	private void pushWordOnStack( String word ) {
		for (int i = 0; i < word.length(); i++) {
			palStack.push(word.charAt(i)) ;
		}
	}

	private boolean isPalindrome( String word) {

		boolean isPalindrome = true ;
		for( int i = 0 ; i < word.length(); i++){
			if(palStack.pop() != word.charAt(i)){
				return false ;
			}
		}
		return isPalindrome ;
	}
}