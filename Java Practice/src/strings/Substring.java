package strings;

public class Substring {

	public static void main(String[] args) {

		String a ="prutha" ;
		String b = "prutpruthkhapruth" ;

		if( isSubstring(a, b)){
			System.out.println(a + " is a substring of " + b);
		}else{
			System.out.println(a + " is not a substring of " + b);
		}
	}

	private static boolean isSubstring(String a, String b) {

		int i = 0 ;
		int j = 0 ;

		while( j < b.length()){

			if( a.charAt(i) == b.charAt(j)){

				if( i == a.length() -1)
					return true ;
				
				i++ ;
			}else{
				i = 0 ;
			}
			j++ ;
		}

		return false;
	}

}
