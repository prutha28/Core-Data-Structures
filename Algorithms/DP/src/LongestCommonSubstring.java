import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class LongestCommonSubstring {


	public static void main(String[] args) {

//		Scanner sc = new Scanner( System.in) ;
//		int T = sc.nextInt() ;
//		sc.nextLine() ;
//		int i = 1 ;

		
		Set<String> s = LCSubstr("aaabbb", "aab") ;
		System.out.println(s);
		
//		while( i <= T){
//			String s1 = sc.nextLine() ;
//			String s2 = sc.nextLine() ;

//			if( hasSubstring(s1, s2) > 0 )
//				System.out.println("YES") ;
//			else
//				System.out.println("NO") ;
//			i++ ;
//		}
		
		
	}

	//	public static int hasSubstring( String a, String b){
	//
	//		int indexA = a.length()-1 ;
	//		int indexB = b.length()-1 ;
	//
	//		if( indexA < 0 || indexB <0 )
	//			return 0 ;
	//
	//		if( a.charAt(indexA) == b.charAt(indexB)){
	//			return ( 1+ hasSubstring(a.substring(0,--indexA), b.substring(0,--indexB))) ;
	//		}else{
	//			return 0 ;
	//		}
	//	}


	public static Set<String> LCSubstr( String a, String b){
		int m = a.length() ;
		int n = b.length() ;
		int L[][] = new int[m+1][n+1] ;
		int z = 0 ;
		Set<String> ret = new HashSet<String>() ;
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if( i == 0 && j== 0 ){
					L[i][j] = 0 ;
				}
			}
		}
		
		for (int i = 1; i < L.length-1; i++) {
			for (int j = 1; j < L[i].length-1; j++) {

				if (a.charAt(i) == b.charAt(j)){
					if (i == 1 || j == 1)
						L[i][j] = 1 ;
					else
						L[i][j] = L[i-1][j-1] + 1 ;

					if (L[i][j] > z){
						z = L[i][j] ;
						ret.add(a.substring(i-z+1 , i+1)) ;
					}
					else{ 
						if (L[i][j] == z){
							ret.add(a.substring(i-z+1 , i+1)) ;
						}
					}
				}
				else{
					L[i][j] = 0 ;
				}

			}
		}
		return ret ;
	}   

}
