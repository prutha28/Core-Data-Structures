package Strings;

/**
 *  Questions to address: 
 *  1. Are all characters ascii?
 *  2. Are spaces to be considered
 *  3. Case sensitive
 *  
 * @author prutha
 *
 *	Algo1 : O( s.len + t.len) time, O(1) 
 *
 *	1. Traverse the first string, s.
 *	2. For each char in s, increment the corresponding index by 1.
 *	3. Traverse the second string t.
 *	4. For each char in s, decrement the corresponding index by 1.
 *	5. If after subtracting the result is 0, it would be 
 *	   if negative it would mean a new character. => not a perm.
 *
 *
 *	Algo2: Sort the strings and check if they are the same.
 */
public class AreStringsPermutation {

	public static void main(String[] args) {

		String s = "prutha" ;
		String t = "rputha" ;
		
		if( isAPermutationOf(s, t)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
	
	public static boolean isAPermutationOf( String s, String t){
		
		if( s.length() != t.length())
			return false ;
		
		int letters[] = new int[128] ; // ASCII only
		
		for (int i = 0; i < s.toCharArray().length; i++) {
			int val = s.charAt(i) ;
			letters[val] += 1 ; 
		}
		
		for (int i = 0; i < t.toCharArray().length; i++) {
			int val = t.charAt(i) ;
			letters[val] -= 1 ;
			if( letters[val] < 0 ){
				return false ;
			}
		}
		return true ;
	}
}
