import java.util.HashMap;
import java.util.Map;


public class NumberWordMapping {

	static Map<Integer, String> numberWordMapping = new HashMap<Integer, String>() ;

	public static void main( String args[]){
		buildMap() ;
		System.out.println(numberToWords(131356) );
	}



	public static String numberToWords(int num) {
		StringBuilder sb = new StringBuilder() ;
		String tensStr = "" ;
		String onesStr = "" ;
		String millionStr = "" ;
		String thousandStr = "" ;
		String hundredStr = "" ;

		if( num/100000 != 0){
			millionStr = numberWordMapping.get(num/100000) ;
			sb.append(millionStr + " " + "Million" + " ");
			num = num % 100000 ;
		}
		
		if( num /1000 != 0){
			if( numberWordMapping.get(num/1000) != null)
				thousandStr = numberWordMapping.get(num/1000) ;
			else{
				thousandStr = numberWordMapping.get(((num/1000)/10) * 10);
				thousandStr = thousandStr + " " + numberWordMapping.get(((num/1000)% 10));
			}
			sb.append(thousandStr +  " " + "Thousand" + " ");
			num = num % 1000 ;
		}
		
		if( num /100 != 0){
			hundredStr = numberWordMapping.get(num/100) ;
			sb.append(hundredStr +  " " + "Hundred" + " ");
			num = num % 100 ;
		}
		
		if( num /10 != 0){
			if(numberWordMapping.get(num) != null){
				tensStr = numberWordMapping.get(num) ;
				sb.append(tensStr + " ");
			}else{
				tensStr = numberWordMapping.get((num /10) * 10) ;
				tensStr = tensStr + numberWordMapping.get((num /10)%10) ;
				sb.append(tensStr + " ");
			}
			num = num % 10 ;
		}
		
		else{ //if(num != 0) {
			onesStr = numberWordMapping.get(num) ;
			sb.append(onesStr);
		}
		return sb.toString() ;
	}


	public static Map<Integer, String> buildMap(){
		numberWordMapping.put(1, "One") ;
		numberWordMapping.put(2, "Two") ;
		numberWordMapping.put(3, "Three") ;
		numberWordMapping.put(4, "Four") ;
		numberWordMapping.put(5, "Five") ;
		numberWordMapping.put(6, "Six") ;
		numberWordMapping.put(7, "Seven") ;
		numberWordMapping.put(8, "Eight") ;
		numberWordMapping.put(9, "Nine") ;
		numberWordMapping.put(10, "Ten") ;
		numberWordMapping.put(11, "Eleven") ;
		numberWordMapping.put(12, "Twelve") ;
		numberWordMapping.put(13, "Thirteen") ;
		numberWordMapping.put(14, "Fourteen") ;
		numberWordMapping.put(15, "Fifteen") ;
		numberWordMapping.put(16, "Sixteen") ;
		numberWordMapping.put(17, "Seventeen") ;
		numberWordMapping.put(18, "Eighteen") ;
		numberWordMapping.put(19, "Nineteen") ;
		numberWordMapping.put(20, "Twenty") ;
		numberWordMapping.put(30, "Thirty") ;
		numberWordMapping.put(40, "Fourty") ;
		numberWordMapping.put(50, "Fifty") ;
		numberWordMapping.put(60, "Sixty") ;
		numberWordMapping.put(70, "Seventy") ;
		numberWordMapping.put(80, "Eighty") ;
		numberWordMapping.put(90, "Ninety") ;
		return numberWordMapping ;
	}
}
