package insertion.sort;

public class ZinZagArray {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 7, 8 , -2, 25, 25}  ;
		print(arr) ;
		int result[] = wiggleArrangeArray( arr) ;
		print(result) ;
	}


	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	static int[] wiggleArrangeArray(int[] arr){

		if( arr.length < 2 || arr.length > 1000000) {
			System.out.println("Numbers are out of the range expected!") ;
		}

		int i, j ;
		int key ;
		int[] result = new int[arr.length] ;
		
		// First Sort the array
		for( j = 1 ; j < arr.length; j++)
		{
			if( arr[ j ] > 1000000 || arr[ j ] < -1000000 )
			{
				System.out.println("Number at index " + j + " is out the range expected!");
				return null ;
			}

			key = arr[ j ] ;
			i = j - 1 ;
			while( i >= 0 && arr[ i ] > key){
				arr[ i + 1] = arr[ i ] ;
				i-- ;
			}
			arr[ i + 1 ] = key ;
		}

		int start = 0 ;
		int end = arr.length - 1;
		int index = 0 ;

		while( start < end){
			result[index++] = arr[end--] ;
			result[index++] = arr[start++] ;
		}
		if( start == end){
			result[index] = arr[start] ;
		}
		return result ;
	}
}
