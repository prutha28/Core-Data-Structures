

public class LongestCommonSubstring {


	public static void main(String[] args) {

//		System.out.println( LCSubstr("bbabab", "abab") ) ;
		char[] X = "bbabab".toCharArray() ;
		char[] Y = "abab".toCharArray() ;
		System.out.println(LCSubStr_geeks(X,Y, X.length, Y.length) ) ;
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




	/* Returns length of longest common substring of X[0..m-1] and Y[0..n-1] */
	public static int LCSubStr_geeks(char X[],char Y[], int m, int n){
		int length=0;
		for(int i=0; i<m; i++){
			int prev_count=0,count=0;
			for(int j=0; j<n; j++){
				if(X[i+j]==Y[j]){
					count++;
					if(j==n-1)
						prev_count = max(prev_count,count);}
				else{
					prev_count = max(prev_count,count); 
					count = 0; }
			}
			length = max(length, prev_count);
		}
		return length;
	}
	public static int LCSubstr( String a, String b){

		int m = a.length() ;
		int n = b.length() ;

		int L[][] = new int[m+1][n+1] ; // Storage table.

		int count = 0 ;
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if( i == 0 || j == 0 )
					L[i][j] = 0 ;

				else if( a.charAt(i-1) == b.charAt(j-1))
				{
					L[i][j] = 1 + L[i-1][j-1] ;
					count = max( count, L[i][j] ) ;
				}
				else
					L[i][j] =  0 ;
			}
		}
		System.out.println( L[m][n] ) ;
		return count ;
	}

	private static int max(int a, int b) {
		return (a>=b ? a : b );
	}




	//		int z = 0 ;
	//		Set<String> ret = new HashSet<String>() ;
	//		
	//		for (int i = 0; i <= m; i++) {
	//			for (int j = 0; j <= n; j++) {
	//				if( i == 0 && j== 0 ){
	//					L[i][j] = 0 ;
	//				}
	//			}
	//		}
	//		
	//		for (int i = 1; i < L.length-1; i++) {
	//			for (int j = 1; j < L[i].length-1; j++) {
	//
	//				if (a.charAt(i) == b.charAt(j)){
	//					if (i == 1 || j == 1)
	//						L[i][j] = 1 ;
	//					else
	//						L[i][j] = L[i-1][j-1] + 1 ;
	//
	//					if (L[i][j] > z){
	//						z = L[i][j] ;
	//						ret.add(a.substring(i-z+1 , i+1)) ;
	//					}
	//					else{ 
	//						if (L[i][j] == z){
	//							ret.add(a.substring(i-z+1 , i+1)) ;
	//						}
	//					}
	//				}
	//				else{
	//					L[i][j] = 0 ;
	//				}
	//
	//			}
	//		}
	//		return ret ;
	//	}



}

