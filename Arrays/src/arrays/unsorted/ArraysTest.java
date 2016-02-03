package arrays.unsorted;

public class ArraysTest {

	public static void main(String[] args) {
		
		Array arr = new Array() ;
		
		// Insertions
		System.out.println("INSERTIONS");
		arr.add(10) ;
		arr.add(20) ;
		arr.insertAtStart(100) ;
		arr.insertAtStart(109) ;
		arr.insertAtEnd(99) ;
		arr.add(66) ;
		arr.insertAtIndex(33, 3 ) ;
		
		System.out.println("Array Contents : ");
		arr.showContents() ;
		
		// Searching
		System.out.println("SEARCHING");
		System.out.println("The element at index 4 is " + arr.elementAtIndex(4)) ;
		System.out.println("The element 33 was found at index " + arr.search(33));
		System.out.println("The element 3 was found at index " + arr.search(3));
		arr.add(10) ;
		System.out.println("Array Contents : ");
		arr.showContents() ;
		System.out.println("The element 10 was found at indices : " + arr.searchAll(10));

		// Deleting
		System.out.println();
		System.out.println("DELETIONS");
		arr.add(100) ;
		arr.insertAtIndex(100, 7) ;
		System.out.println("Array Contents Before Deletions: ");
		arr.showContents() ;
		
		System.out.println("After Deleting the first occurence of element 10, ( index = " + arr.delete(10) + ")");
		arr.showContents() ;
		
		System.out.println();
		
		System.out.println("After Deleting all the instances of element 100,  ( indices = " + arr.deleteAllOccurences(100) + ")");
		arr.showContents() ;
		
		System.out.println("Deleting from the beginning : " + arr.deleteFromBegin());
		System.out.println("Deleting from the end : " + arr.deleteFromEnd());
		arr.showContents() ;
	}

}
