
// you can also use imports, for example:
import java.util.ArrayList;
import java.util.List;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class PostFix {

		private static final int MAX_LIMIT = (int)Math.pow(2,12);
		
		public int solution(String S) {
			List<Integer> list = new ArrayList<Integer>();
			if(S.length() == 0) {
				return -1;
			}
			for(int i = 0; i < S.length(); i++) {

				int result ;
				int element1 ;
				int element2 ;
				
				if(S.charAt(i) == '*' || S.charAt(i) == '+'){
				
					if(list.size() < 2) {
						return -1;
					} else {
						 result = 0;
						element1 = list.get(list.size()-1);
						element2 = list.get(list.size()-2);
						list.remove(list.size()-1);
						list.remove(list.size()-1);
						if(S.charAt(i) == '*'){
							result = element1*element2;
						}  else {
							result  = element1+element2;
						}

						if(result < MAX_LIMIT){
							list.add(result);
						} else {
							return -1;
						}
					}

				} else {
					list.add(Character.getNumericValue(S.charAt(i)));
				}
			}
			return list.get(0);
		}
	}

