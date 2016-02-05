package dynamic.arrays;

public class DynamicArraysTest {

	public static void main(String[] args) {

		IArray arr = new DynamicArray( 5, 2 ) ;
		arr.add( 40 ) ;
		arr.add( 10 ) ;
		arr.add( 78 ) ;
		arr.insertAtEnd(21) ;
		arr.insertAtIndex( 0, 99 ) ;
		System.out.println("Array Contents ...");
		arr.showContents() ;
		
		arr.add( 8 ) ;
		arr.add( 45 ) ;
		arr.add( 35 ) ;
		
		arr.add( 56 ) ;
		arr.add( 71 ) ;
		arr.add( 22 ) ;
		
		arr.showContents() ;
	}

}
