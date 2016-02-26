
public class SummaryRanges {

	static int a[] = { 2, 3, 4, 5, 12, 14, 15, 16, 17, 19 } ;

	public static void main(String[] args) {
		printRanges() ;
	}

	public static void printRanges(){

		// Indices for high & lows
		int low = 0 ;
		int high = 0 ;
		int j = 1 ;
		StringBuilder sb = new StringBuilder() ;

		while( j < a.length){

			if( a[j] - a[j-1] == 1){
				high = j ;
			}else{
				if( low != high)
					sb.append(a[low] + "->" + a[high] + " ") ;
				else
					sb.append(a[low] + " ") ;
//				System.out.println(sb.toString());
				low = j ;
				high = j ;
			}
			j++ ;
		}

		System.out.println(sb.toString());
	}
}
