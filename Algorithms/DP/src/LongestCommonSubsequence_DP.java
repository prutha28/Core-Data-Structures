
// Works with the assumption that the smaller string is in s1 and is along the row.

public class LongestCommonSubsequence_DP {

	static String s1 = "ABACAC" ;
	static String s2 = "ABAACACAA" ;

	public static void main(String[] args) {
		LCS( s1, s2) ;
	}

	public static void LCS( String s1, String s2 ){

		int m, n ;
		m = s1.length() ;
		n = s2.length() ;

		int L[][] = new int[ m +1 ][n + 1] ;
		Cordinate[][] c = new Cordinate[m+1][n+1] ; 

		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[i].length; j++) {
				if( i == 0 || j== 0){
					L[i][j] = 0 ;
					c[i][j] = new Cordinate() ;
				}
			}
		}

		for (int i = 1; i < L.length; i++) {
			for (int j = 1; j < L[i].length; j++) {
				if( s1.charAt(i-1) == s2.charAt(j-1)){
					L[i][j] = 1 + L[i-1][j-1] ; // Add 1 + the diagonal element
					c[i][j] = new Cordinate(i-1,j-1, "D") ;

				}else{
					// Take the maximum of the cell above and to the left.
					int max = 0 ;
					if(max(L[i][j-1], L[i-1][j]) == 1){

						max = L[i][j-1] ;
						c[i][j] = new Cordinate(i,j-1, "H") ;

					}else if(max(L[i][j-1], L[i-1][j]) == 2) {
						max = L[i-1][j] ;
						c[i][j] = new Cordinate(i-1,j, "V") ;
					}
					L[i][j] = max ;
				}
			}

		}

		showMatrix(L) ;
		showMatrix(c) ;
		System.out.println(buildLCSFromCoordinateMatrix(c)) ;
	}

	private static void showMatrix(Cordinate[][] c) {
		System.out.println("Cordinates");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
	}

	private static void showMatrix(int[][] l) {
		System.out.println("LCS of " + s1 + " and " + s2) ;
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].length; j++) {
				System.out.print(l[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public static String buildLCSFromCoordinateMatrix( Cordinate[][] c){

		StringBuilder sb = new StringBuilder() ;
		int i = c.length-1 ;
		int j = c[i].length-1;
		while ((i > 0 )&&  ( j > 0)) {
			if( c[i][j].direction.equals("D")){
				if( max(s1.length(), s2.length()) == 1)
					sb.append(s1.charAt(i-1)) ; // i-1 because the length of the size of the matrix is 1 + string's length ( m+1)
				else
					sb.append(s2.charAt(j-1)) ;
			}
			i = c[i][j].xCordinate ;
			j = c[i][j].yCordinate ;
		}

		return reverse(sb.toString()) ;
	}



	private static String reverse(String s) {

		int i = 0 ;
		int j = s.length() - 1 ;
		char[] cArr = s.toCharArray() ;

		while( i <= j ){
			char temp = cArr[i] ;
			cArr[ i ] = cArr[ j] ;
			cArr[ j ] = temp ;
			i++ ;
			j-- ;
		}
		return new String(cArr);
	}

	/**
	 * This method checks which of the 2 numbers are greater.
	 * If num1 is greater it returns 1 
	 * If num2 is greater it returns 2
	 * @param num1
	 * @param num2
	 * @return
	 */
	private static int max(int num1, int num2) {
		if( num1 >= num2)
			return 1;
		else
			return 2 ;
	}
}
