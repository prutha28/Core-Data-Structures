package hackerRank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DeletionsToMakeValidString {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in) ;
		String ans = "" ;
//		int n = numberOfChanges(sc.nextLine()) ;
//		int n = numberOfChanges("aaabbbccccdd") ;
		int n = numberOfChanges("aabbbc") ;
		if( n <= 1)
			ans = "YES" ;
		else
			ans = "NO" ;
		System.out.println(ans) ;
	}


	public static int numberOfChanges( String s){

		Map<Character, Integer> charCountsMap = new HashMap<Character, Integer>() ;

		// calculate counts for each element.
		for( char c : s.toCharArray()){
			if( charCountsMap.get(c) == null){
				charCountsMap.put(c, 1 ) ;
			}else{
				int count = charCountsMap.get(c) ;
				charCountsMap.put(c, count +1 ) ;
			}
		}

		// Find the mode of the frequencies
		Collection counts = charCountsMap.values() ;
		Iterator<Integer> itr1 = counts.iterator() ;
		int mode = findMode(charCountsMap) ;

		int deletions = 0 ;
		while( itr1.hasNext()){
			int count = itr1.next() ;
			if( count < mode)
				deletions += count ;
			else
				deletions += ( count - mode) ;
		}
		return deletions ;

	}


	private static int findMode(Map<Character, Integer> charCountsMap) {
		// Find the mode of the frequencies
		Iterator<Integer> itr1 = charCountsMap.values().iterator() ;

		Map<Integer, Integer> countsFrequency = new HashMap<Integer, Integer>() ;

		while( itr1.hasNext()){
			int c = itr1.next() ;
			if( countsFrequency.get(c) == null){
				countsFrequency.put(c, 1 ) ;
			}else{
				int count = countsFrequency.get(c) ;
				countsFrequency.put(c, count +1 ) ;
			}
		}

		Collection c = countsFrequency.values() ;
		int max = Integer.MIN_VALUE ;
		Iterator<Integer> itr2 = countsFrequency.values().iterator() ;

		while( itr2.hasNext()){
			int element = itr2.next() ;
			if( element > max)     {
				max = element ;
			}
		}
		int mode = max ;
		return mode ;

	}
}
