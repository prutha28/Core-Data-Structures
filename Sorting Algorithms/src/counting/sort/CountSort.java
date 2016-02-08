package counting.sort;

public class CountSort {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 2, 1, 3, 4, 1, 2, 4 } ;
		int k = 5 ;
		new CountSort().sort( arr, k ) ;
	}

	private void sort(int[] A, int k) {

		int Count[] = new int[k+1] ;		// Tricky! size is (k+1)

		for (int i = 0; i < Count.length; i++) {
			Count[i]= 0 ;
		}

		// Count now contains the frequency count for each element in A.
		for (int i = 0; i < A.length; i++) {
			Count[A[i]] = Count[A[i]] + 1 ; 
		}

		//Count[i] contains the no of elements <= i
		for (int i = 1; i < Count.length; i++) {
			Count[i] = 	Count[i] + Count[i-1] ;																																																																																																																																																																												
		}

		// B is the output array
		int B[] = new int[ A.length] ;
		
		for (int i = 0; i < B.length; i++) {
			B[Count[A[i]] - 1] = A[i] ;				// Tricky! Dont forget the -1 in teh index
			Count[A[i]] = Count[A[i]] - 1;
		}
		
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
	}
}