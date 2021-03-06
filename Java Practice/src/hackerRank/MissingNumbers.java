package hackerRank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
		//        Scanner sc = new Scanner( System.in) ;
		//        int n = sc.nextInt() ;
		//        int a[] = new int[n] ;
		//        for( int i = 0 ; i<n; i++){
		//            a[i] = sc.nextInt();
		//        }
		//        
		//        int m = sc.nextInt() ;
		//        int b[] = new int[m] ;
		//        for( int j = 0 ; j< m ; j++){
		//            b[j] = sc.nextInt();
		//        }
		//        

		int a[] = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206} ; 
		int b[] = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204} ;
		SortedSet<Integer> missingNos = missingNumbers(a, b) ;

		for( Integer i : missingNos){
			System.out.print(i + " ") ;
		}
	}

	public static SortedSet<Integer> missingNumbers( int a[], int b[] ){

		int n = a.length ;
		int m = b.length ;

		Arrays.sort(a, 0 , n) ;
		Arrays.sort(b, 0 , m) ;

		int i = 0 ;
		int j = 0 ;

		SortedSet<Integer> missingNos = new TreeSet<Integer>() ;

		// a [203, 203, 204, 204, 205, 205, 206, 206, 207, 208]
		// b [203, 203, 204, 204, 204, 205, 205, 205, 206, 206, 206, 207, 208]
	      
        while( i < n && j < m ){
			//System.out.println( " i = " + i +  " j = " + j);
			if( a[i] == b[j] ){
				i++ ;
				j++ ;
			}else if( b[j] < a[i] ){
				missingNos.add(b[j]) ;
				j++ ;
			}else{
				missingNos.add(a[i]) ;
				i++ ;
			}
		}

        
        while(i < n){
			missingNos.add(a[i]) ;
			i++ ;
		}
        
        while(j < m){
			missingNos.add(b[j]) ;
			j++ ;
		}


		return missingNos ;
	}



}