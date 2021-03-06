import java.util.Stack;


public class StackMachine {

	public static void main(String[] args) {
		System.out.println(solution("13+62*7+*"));
	}


	public static int solution(String S) {
		// write your code in Java SE 8

		Stack<String> opsStack = new Stack<String>() ;

		int i = 0 ;
		Integer element1 = null  ;
		Integer element2 = null ;

		if( S.length() <= 2){
			return -1 ;
		}

		while( i < S.length()){

			if(( S.charAt(i) == '*') || ( S.charAt(i) == '+')) {

				String result ;
				int r ;

				if( !opsStack.isEmpty()){
					element1 = Integer.getInteger(opsStack.pop()) ;
//					element1 = String..getNumericValue(opsStack.pop()) ; 
				}else{
					System.out.println("Stack is empty.") ;
					break ;
				}
				if( !opsStack.isEmpty()){
					element2 = Integer.getInteger(opsStack.pop()) ;
//					element2 = Character.getNumericValue(opsStack.pop()) ;
				}else{
					System.out.println("Stack is empty.") ;
					break ;
				}

				if( element1!= null && element2!= null){

					if(S.charAt(i) == '+'){
						r = element1.intValue() + element2.intValue() ;
						result = new Integer(r).toString() ;
						opsStack.push(result) ;
					}

					if(S.charAt(i) == '*'){
						r = element1.intValue() * element2.intValue() ;
						result = new Integer(r).toString() ;
						System.out.println(result);
						opsStack.push(result) ;
//						System.out.println(result.toCharArray()[0]);
					}
				}
			}else if( Character.isDigit(S.charAt(i))){
				opsStack.push(S) ;   
			}else{
				// System.out.println("Stack is empty.") ;
				throw new IllegalArgumentException() ;
			}

			i++ ;
		}
		if( opsStack.isEmpty()){
			// 			System.out.println("Stack is empty.") ;
			return -1;
		}else{
			return new Integer(opsStack.peek() );
		}

	}
}
