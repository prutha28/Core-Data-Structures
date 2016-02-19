package hackerRank;

import java.util.Scanner;


// https://www.hackerrank.com/challenges/anagram
/**
 * 
 * @author prutha
 *
 * Input :
 * 
 * 	6
	aaabbb
	ab
	abc
	mnop
	xyyx
	xaxbbbxx
	
	Output :
	3
	1
	-1
	2
	0
	1
 */

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in) ;
		int T = sc.nextInt() ;
		sc.nextLine() ;
		int i = 1 ;
		int n = 0 ;

		while( i <= T){
			n = numberOfChanges(sc.nextLine()) ;
			System.out.println(n) ;
			i++ ;
		}
	}

	public static int numberOfChanges(String s){

		int n = s.length() ;
		if( n %2 != 0 ){
			return -1 ;
		}

		int mid = s.length() /2 ;

		// First String
		String s1 = s.substring(0, mid);
		String s2 = s.substring(mid, n );
		int[] letters = new int[256] ; 

		for( char c : s1.toCharArray()){
			int val = c ;
			letters[val] += 1 ;
		}

		int count = 0 ;
		for( char c : s2.toCharArray()){
			int val = c ;
			letters[val] -= 1 ;
			if( letters[val] < 0 ){
				count++ ;
			}
		}
		return count ;
	}

}

