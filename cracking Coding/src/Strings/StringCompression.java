package Strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class StringCompression {

	public static void main(String[] args) {

		String s = "aaabbbbccad" ;
		String result = compress(s) ;

		if( result.length() < s.length() ){
			System.out.println(result);
		}else{
			System.out.println(s);
		}
	}

	private static String compress(String s) {

		String result = "" ;
		int i = 0 ;
		while( i < s.length()){
			Character currentChar = s.charAt(i) ;
			Integer count = 0 ;
			while( i < s.length() && s.charAt(i) == currentChar ){
				count++ ;
				i++ ;
			}
			result = result.concat(currentChar.toString() + count.toString() );
		}

		return result ;
		//      Problem with This Approach is , it will print all the total counts {a=4, b=4, c=2, d=1}
		//		LinkedHashMap<Character, Integer> characterCounts = new LinkedHashMap<Character, Integer>() ;

		//		for (int i = 0; i < s.length(); i++) {
		//			char current = s.charAt(i) ;
		//			if( characterCounts.get(current) == null)
		//				characterCounts.put(s.charAt(i), 1) ;
		//			else{
		//				int currentcount = characterCounts.get(current)  ;
		//				characterCounts.put(s.charAt(i), 1 + currentcount) ;
		//			}
		//		}
		//		System.out.println(characterCounts);

	}

}
