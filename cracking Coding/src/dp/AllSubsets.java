package dp;

import java.util.HashSet;
import java.util.Set;

public class AllSubsets {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>() ;
		set.add(5) ;
		set.add(6) ;
		set.add(7) ;


		Set<Set<Integer>> result = subsets(set) ;

		for (Set<Integer> s : result) {
			System.out.println(s);
		}

		
	}


	public static Set<Set<Integer>> subsets( Set<Integer> set ){

		int n = set.size() ;
		Set<Set<Integer>> result = new HashSet<Set<Integer>>() ;
		Set<Set<Integer>> temp = new HashSet<Set<Integer>>() ;
		if( n == 0 )
			return null ;

		else if( n == 1){
			result.add(new HashSet()) ;
			result.add(set) ;
			return result ;
		}
		else if( n > 1){

			Integer[] arr = new Integer[set.size()] ;
			arr = set.toArray(arr) ;
			int current = arr[0] ;
			HashSet<Integer> newSet = new HashSet<Integer>();

			for (int i = 1; i < arr.length; i++) {
				newSet.add(arr[i]) ;
			}
			temp = subsets(newSet) ; // Set(n-1)
			result = temp ;
			Set<Integer> t ;
			
			for (Set<Integer> s : temp) {
				
			}
			result.addAll(temp) ;
		}
		return result;

	}

}
