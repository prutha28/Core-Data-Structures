package hackerRank;

public class LCSExample {


	public static void main( String[] args) {
		System.out.println(LCS("ABC", "BADCC") );
	}

	public static int LCS( String s1, String s2){

		int m = s1.length() ;
		int n = s2.length() ;

		if( m <= 0 || n <= 0 ){
			return 0 ;
		}else if( s1.charAt(m-1) == s2.charAt(n-1)){
			return (1+ LCS(s1.substring(0,--m),s2.substring(0,--n))) ;
		}else{
			return max(LCS(s1.substring(0,--m),s2.substring(0,n)), 
					LCS(s1.substring(0,m),s2.substring(0,--n))) ;
		}
	}

	static int max( int a, int b){
		if( a >=b) 
			return a ;
		else 
			return b ;
	}
}
