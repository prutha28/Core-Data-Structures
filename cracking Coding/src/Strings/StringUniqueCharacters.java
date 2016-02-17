package Strings;

/**
 * 
 * @author prutha
 *
 *
 *	Method 1: 
 */




public class StringUniqueCharacters {

	// Assume that all characters are ascii ( 0-127 = 128 total possible characters)
	public static void main(String[] args) {

		String s = "prutha~!@#$%^&*" ;
		if(areAllCharsUnique(s)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	private static boolean areAllCharsUnique(String s) {

		
		if( s.length() > 128){
			return false ;
		}
		int letters[] = new int[128] ;

		for (int i = 0; i < s.toCharArray().length; i++) {
			int val = s.charAt(i) ;
			letters[val] = letters[val] - 1 ;
			if( letters[val] < -1){
				return false ;
			}
		}
		return true ;
	}

}
