package hackerRank;
import java.util.Scanner;

public class IndexToRemoveToMakePalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int tests = sc.nextInt() ;
		String s[] = new String[tests] ;
		int i = 0 ;
		sc.nextLine() ;
		while( i < s.length ){
			s[i] = sc.nextLine() ;
			i++ ;
		}

		i= 0 ;
		while( i < s.length ){
			System.out.println(isPalindrome(s[i], 0, s[i].length()-1)) ; 
			i++ ;
		}

		//System.out.println("The index of character to be removed is " + isPalindrome(s, 0, s.length()-1));
	}

	public static int isPalindrome( String s, int start, int end){

		while( start < end){
			if( s.charAt( start ) != s.charAt(end )){
				if (isPalindrome(s, start, end-1) == -1){
					// remove char at end
					return end ;
				}
				else{
					// remove char at start
					return start ;
				}
			}
			start++ ;
			end-- ;
		}
		return -1 ; // if its already a palindrome.
	}



}
