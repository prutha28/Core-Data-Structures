package dp;

/**
 * A child is running up a staircase with n steps, and can hop either 1 step, 2 steps or 3 steps at a time.
 * To count the #ways he can run up the stairs. 
 * NOT the no of steps.
 * @author prutha
 *
 */
public class NStepProblem {

	static int[] map = new int[ 100 ] ;
	
	public static void main(String[] args) {
		for (int i = 0; i < map.length; i++) {
			map[i] = -1 ;
		}
		System.out.println("The no of ways is : " + countWaysDP(5, map));
	}


	/**
	 * This method calculates the number of ways to reach nth step
	 * bottom-up approach.
	 * @param n
	 * @return
	 */
	//	public static int countWays( int n){
	//		
	//		// Base Cases
	//		if( n <= 0)
	//			return 0 ;
	//		
	//		else if( n == 1)
	//			return 1 ;
	//		
	//		else if( n == 2)
	//			return 2 ;
	//		else if( n == 3)
	//			return 3 ;
	//		else 
	//			return 1 + countWays(n-1) ;
	//		
	//	}


	// Top Down Approach:

	/**
	 * To get to the n th step, the person can either 
	 * reach the (n-1)th step & take a single hop of 1 step.
	 * or reach the (n-2)th hop & take a single hop of 2 steps.
	 * or reach the (n-3)th hop & take a single hop of 3 steps
	 * 
	 * 
	 * Its not  ( countWays(n-1)  + 2 *countWays(n-2)	+ 3*countWays(n-3)) ; because cases will overlap.
	 * In 2 *countWays(n-2), these 2 ways are already accounted for while counting countWays(n-1) 
	 * 
	 */


	// Normal Recursion
	public static int countWays( int n ){

		if( n < 0)
			return 0 ;

		if( n == 0)
			return 1 ;

		else
			return ( countWays(n-1)  
					+ countWays(n-2)
					+ countWays(n-3)) ;
	}


	// Dynamic Programming

	public static int countWaysDP( int n, int map[] ){

		if( n < 0)
			return 0 ;

		if( n == 0)
			return 1 ;

		if( map[ n] != -1)
			return map[n] ;

		else{
			map[n] = ( countWaysDP(n-1, map)  
					+ countWaysDP(n-2, map)
					+ countWaysDP(n-3, map)) ;
			
			return map[n];
		}
	}


}
