package hackerRank;

import java.util.Scanner;

public class DollarsIcecream {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in) ;
		int T = sc.nextInt() ;

		for( int i = 1; i <= T; i++){
			int dollars = sc.nextInt() ;
			int size = sc.nextInt() ;
			int flavors[] = new int[size] ;

			for( int j = 0; j < size; j++){
				flavors[j] = sc.nextInt() ;
			}

			findIndices( flavors, dollars) ;
		}
	}


	public static void findIndices( int[] flavors, int dollars){
		int remainder = 0 ;
		for( int i = 0; i < flavors.length; i++){
			remainder = dollars - flavors[i] ;

			int j = i +1 ;
			while( j < flavors.length){
				if( remainder == flavors[ j ]){
					System.out.print( i + 1 ) ;		// Adding +1 to make it 1- based indexing
					System.out.print(" " + (j +1) ) ;  // Adding +1 to make it 1- based indexing
				}
				j++ ;
			}
		}
	}
}
