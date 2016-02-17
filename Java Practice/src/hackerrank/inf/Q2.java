package hackerrank.inf;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Q2 {

	static long minarea(int[] x, int[] y, int k) {

		// X & y are pairs of coordinates

		// Algo : 
		// 1. Store teh ordered pair of coordinates in a map
		// 2. FInd a pair of corrdinates for which difference in their y coordinates = difference in their x coordinates
		//  AND difference = K+1


		if( x.length != y.length)
			return -1 ;


		List<Integer> xDiff = new ArrayList<Integer>() ;
		List<Integer> yDiff = new ArrayList<Integer>() ;
		int xDif = 0 ;
		int yDif = 0 ;
		SortedSet<Long> areas = new TreeSet<Long>() ;

		for (int i = 0; i < x.length-1; i++) {
			for (int j = i+1; j < x.length; j++) {

				xDif = Math.abs(x[j] - x[i]) ;
				xDiff.add(xDif) ;

				yDif = Math.abs(y[j] - y[i]);
				yDiff.add(yDif) ;

				if( (xDif == yDif) && (xDif == k+1)){
					areas.add((long) Math.pow(xDif, 2)) ;
				}
			}
		}

		if( areas.size() > 0 ){
			return areas.first() ;
		}else{
			return 0 ;
		}
	}


	public static void main(String[] args) {
		int x[] = { 2, 5, 4, 5, 5} ; 
		int y[] = { 1, 4, 4, 9, 8} ;
		int k = 2 ;

		System.out.println(minarea(x, y, k));
	}

}
