package maximumContiguousSum;

public class MaximumContiguousSum {

	static int A[]  = { -1, 6, 5, -9, 8 , 2, -4 } ;
	
	public static void main( String[] args){
		
		System.out.println(new MaximumContiguousSum().maxSum( 0, A.length -1)) ;
	}


	public int maxSum( int start, int end){
		
		if( end == start )
			return A[start] ;
		
		return MAX(maxSum( start, --end) + A[end] , A[end]) ;
	}


	private int MAX(int i, int j) {
		return (i>=j) ? i : j ;
	}

}
