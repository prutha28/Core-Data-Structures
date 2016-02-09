package hackerRank;
import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		//        Scanner sc = new Scanner(System.in) ;
		//        int T = sc.nextInt() ;
		//        if(!( T > 0 && T <= 10)){
		//           return ; 
		//        }
		//        
		//        for( int i = 1; i <= T; i++){
		//            String s = sc.nextLine() ;
		String s ; 
//		s = "ivvkxq" ;
		s = "ivvkx";
		if( !s.isEmpty() && isFunny(s)) 
			System.out.println("Funny");
		else
			System.out.println("Not Funny") ;
		//        }
	}



	public static boolean isFunny(String s ){
		int i = 0 ; // Start of the String
		int j = s.length() - 1 ; // End of the String

		while( i < j ){
			int term1 = Math.abs(s.charAt(i+1) - s.charAt(i)) ;
			int term2 = Math.abs(s.charAt(j) - s.charAt(j-1)) ;
			if( term1 != term2 ) {
				return false ;
			}
			i++ ;
			j-- ;
		}
		return true ;
	}
}