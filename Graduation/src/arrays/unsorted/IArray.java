package arrays.unsorted;

import java.util.List;

/** 
	Stores an array of elements of the specified type int.

**/

public interface IArray{

	/**
	 * In this method inserts the element at the end of the array.
	 * 
	 * @param element
	 * @return true if the element was inserted successfully
	 * false if the element was not inserted ( due to array index out of bounds)
	 */
	public boolean add(int element) ;
	public boolean insertAtStart( int element) ;
	public boolean insertAtEnd( int element) ;

	/**
	 * inthis method inserts the specified element at the specified index 
	 * @param element
	 * @param index
	 * @return
	 */
	public boolean insertAtIndex( int element, int index ) ;
	
	/**
	 * inthis returns the element at the specified index.
	 * @param index
	 * @return
	 */
	public int elementAtIndex( int index ) ;
	
	/**
	 * LINEAR SEARCH
	 * This method searches the specified element in the array & returns the index 
	 * where the element was first found, returns -1 otherwise.
	 * @param element
	 * @return
	 */
	public int search( int element ) ;
	public List<Integer> searchAll(int element) ;
		
	/**
	 * Deletes the first occurrence of the specified element
	 * @param element
	 * @return
	 */
	public int delete( int element) ;
	
	public int deleteElementAtIndex( int index ) ;
	
	/**
	 * This method deletes all the occurrences of the specified element.
	 * @param element
	 * @return the array of indices of elements that were removed.
	 */
	public Integer[] deleteAllOccurences( int element ) ;

	public int deleteFromBegin() ;
	public int deleteFromEnd() ;
	
	public int binarySearch( int element, int beginIndex, int endIndex) ;
	
	public int[] insertionSort( int[] arr ) ;
}