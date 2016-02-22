
public class SecondLargestInArray {

	public static void main(String[] args) {
		
		int[] A = { 2, 6, 7, 5, 1, 5, 6, 8, 9 } ;
		System.out.println(findSecondLargest(A));
		
	}

	private static int findSecondLargest(int[] A) {
		
		int max = A[0] ;
		int prevMax = A[0] ;
		int prevPrevMax = A[0] ;
		
		int i = 1 ;
		
		while( i < A.length){
			
			if( A[i] > max){
				prevPrevMax = prevMax ;
				prevMax = max ;
				max = A[i] ;
			}
			i++ ;
		}
		
		return prevPrevMax ;
	}

}
