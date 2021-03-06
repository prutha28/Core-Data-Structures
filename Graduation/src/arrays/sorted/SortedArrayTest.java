package arrays.sorted;

import java.util.List;

public class SortedArrayTest {

	public static void main(String[] args) throws EmptyArrayException, FullArrayException {

		SortedArray sa = new SortedArray() ;
		
		sa.showContents() ;
		sa.add("mary") ;
		sa.add("john") ;
		sa.add("jane") ;
		sa.add("peter0") ;
		sa.add("heena") ;
		sa.add("meredith") ;
		sa.add("derek");
		sa.add("peter1") ;
		sa.add("ana") ;
		sa.add("ana") ;
		sa.showContents() ;
		System.out.println();
		
		int index = 5 ;
		System.out.println("Element at "+ index  + " is " + sa.elementAtIndex(5)) ;
		System.out.println();
		
		index = 4 ;
		System.out.println("After Deleting element " + sa.deleteElementAtIndex(index) + " at index " + index );
		sa.showContents() ;
		System.out.println();
		
		System.out.println("After deleting " + sa.delete("peter0"));
		sa.showContents() ;
		System.out.println();
		
		List<Integer> indices = sa.searchAll("ana") ;
		System.out.println("After deleting all occurrences of ana at indices " + indices ) ;
		sa.deleteAllOccurences("ana");
		sa.showContents() ;
		System.out.println();
		
		System.out.println("After deleting element " + sa.deleteFromBegin() + " from the start");
		sa.showContents() ;
		System.out.println();
		
		System.out.println("After deleting element " + sa.deleteFromEnd() + " from the end");
		sa.showContents() ;
		System.out.println();
		
	}

}
