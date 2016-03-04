import java.util.Arrays;
import java.util.Collections;


public class mainClass{

	public static void main( String[] args){
		
		String order = "dfbcae";
		String s = "acd" ;
		
		StringComparator[] a = new StringComparator[s.length()] ;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new StringComparator(s.charAt(i), order) ;
		}
		
		Collections.sort(Arrays.asList(a)) ;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);	
		}
		
	}

}

class StringComparator implements Comparable<StringComparator>{

	char c ;
	int order ;

	public StringComparator( char c , String orderString){
		this.c = c ;
		this.order = orderString.indexOf(c) ;
	}

	public int compareTo(StringComparator other) {

		if( this.order > other.order)
			return 1 ;
		else if( this.order < other.order)
			return -1;
		else return 0 ;
	}

	public String toString() {
		return "" + c ;
	}
	
	
}
