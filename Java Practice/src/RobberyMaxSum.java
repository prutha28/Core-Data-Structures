
//http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/

/**
 */
public class RobberyMaxSum {

	static int a[] = { 5, 5, 10, 40, 50 , 35 } ;

	public static void main( String[] args) {
		int sum = findMaxSum( a ) ;
		System.out.println(sum);
	}
	
	
	private static int findMaxSum( int a[]) {
		
		int incl = a[0] ;
		int excl = 0 ;
		
		for (int i = 1; i < a.length; i++) {
			int temp = incl ;
			incl = a[i] + excl ;
			excl =  temp;
		}

		return max( incl, excl) ;
	}

	private static int max(int incl, int excl) {
		return (incl >= excl) ? incl : excl ;
	}
	
}
