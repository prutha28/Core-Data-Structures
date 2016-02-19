package dp;

public class MagicIndexinArray {

	public static void main(String[] args) {
		
//		int[] A = { -1, -2, 0 , 3, 4 } ;
		int[] A = { 0, 1, 3 , 4, 5 } ;
		int magicIndex = checkForMagicIndex( A, 0 , A.length-1) ;
		
		if( magicIndex == -1){
			System.out.println("No such index found");
		}else{
			System.out.println("Magic index:" + magicIndex);
		}
	}

	private static int checkForMagicIndex(int[] A, int begin, int end) {
		
		int mid = (begin + end)/2 ;
		
		if ( mid > A[mid])
			return checkForMagicIndex(A, mid+1, end) ;
		
		else if( mid < A[mid])
			return -1 ;
		
		else//( mid == A[mid])
			return mid ;
		
	}

	
	
}
