package Strings;

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
		char[] resultChar = null ;
		char[] sArr = s.toCharArray() ;
		
		for (int i = 0; i < sArr.length; i++) {
			
		}
		return new String(resultChar);
	}

}
