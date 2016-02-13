package hackerRank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GemsProblem {
	
	// This Map stores the element against the no of rocks in which it occurs.
	// So for rocks - abcbb, bbbad, aadb
	// Map will look like [( a, 3), ( b, 3), (c,1), (d,2)]
	// U should return all the keys, whose values are >= # of rocks
	    static Map<Character, Integer> elementOccurencesInRockMap ;
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner( System.in) ;
			int T = sc.nextInt() ;
			sc.nextLine() ;
			int i = 0 ;
			String rocks[] = new String[T] ;
			while( i < T){
				rocks[i] = sc.nextLine() ;
				i++ ;
			}
	       initMap() ;
	       parseRocks(rocks) ;
	       System.out.println(countNumberOfGemElements(rocks)) ;
	    }
	    
	    
	    private static void parseRocks( String[] rocks ){
	        int i = 0 ;
	        while( i < rocks.length){
	            int j = 0 ;
	            while( j < rocks[i].length()){
	            	if( elementOccurencesInRockMap.containsKey(rocks))
	            	
	            	
//	                int value = elementOccurencesInRockMap.get(rocks[i].charAt(j)) + 1;
//	                elementOccurencesInRockMap.put(rocks[i].charAt(j), value ) ;
	                j++ ;
	            }
	            i++ ;
	        }
	    }
	    
	    private static int countNumberOfGemElements( String[] rocks ){
	    	
	        Collection<Integer> values = elementOccurencesInRockMap.values() ;
	        int count = 0 ;
	        
	        for (Integer value : values) {
				if( value >= rocks.length){
					count++ ;
				}
			}
	        
	        return count ;
	    }
	    
	    private static void initMap() {
	        elementOccurencesInRockMap = new HashMap<Character, Integer>() ;
	        elementOccurencesInRockMap.put('a', 0) ;
	        elementOccurencesInRockMap.put('b', 0) ;
	        elementOccurencesInRockMap.put('c', 0) ;
	        elementOccurencesInRockMap.put('d', 0) ;
	        elementOccurencesInRockMap.put('e', 0) ;
	        elementOccurencesInRockMap.put('f', 0) ;
	        elementOccurencesInRockMap.put('g', 0) ;
	        elementOccurencesInRockMap.put('h', 0) ;
	        elementOccurencesInRockMap.put('i', 0) ;
	        elementOccurencesInRockMap.put('j', 0) ;
	        elementOccurencesInRockMap.put('k', 0) ;
	        elementOccurencesInRockMap.put('l', 0) ;
	        elementOccurencesInRockMap.put('m', 0) ;
	        elementOccurencesInRockMap.put('n', 0) ;
	        elementOccurencesInRockMap.put('o', 0) ;
	        elementOccurencesInRockMap.put('p', 0) ;
	        elementOccurencesInRockMap.put('q', 0) ;
	        elementOccurencesInRockMap.put('r', 0) ;
	        elementOccurencesInRockMap.put('s', 0) ;
	        elementOccurencesInRockMap.put('t', 0) ;
	        elementOccurencesInRockMap.put('u', 0) ;
	        elementOccurencesInRockMap.put('v', 0) ;
	        elementOccurencesInRockMap.put('w', 0) ;
	        elementOccurencesInRockMap.put('x', 0) ;
	        elementOccurencesInRockMap.put('y', 0) ;
	        elementOccurencesInRockMap.put('z', 0) ;
	    }
	}
