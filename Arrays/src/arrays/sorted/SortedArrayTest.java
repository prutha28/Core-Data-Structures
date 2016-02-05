package arrays.sorted;

public class SortedArrayTest {

	public static void main(String[] args) throws EmptyArrayException, FullArrayException {

		SortedArray sa = new SortedArray() ;
		
//		String[] arr = { "mary", "john", "jane" , "ana" , "peter", "heena", "cristina" , "nathan", "meredith", "Derek" };
		
		sa.showContents() ;
		System.out.println("Index : " + sa.add("mary")) ;
		System.out.println("Index : " + sa.add("john")) ;
		System.out.println("Index : " + sa.add("jane")) ;
		System.out.println("Index : " + sa.add("peter0")) ;
		System.out.println("Index : " + sa.add("heena")) ;
		System.out.println("Index : " + sa.add("meredith")) ;
		System.out.println("Index : " + sa.add("derek"));
		System.out.println("Index : " + sa.add("peter1")) ;
		sa.showContents() ;
	}

}
