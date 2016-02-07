package stacks.using.dynamic.arrays;

import dynamic.arrays.DynamicArray;

public class Stack implements IStack {

	DynamicArray da ;
	
	public Stack(){
		da = new DynamicArray(10, 2) ;
	}
	
	public void push(int element) {
		da.insertAtStart(element) ;
	}

	public int pop() {
		return da.deleteFromBegin() ;
	}

	public int top() {
		return da.elementAtIndex(0) ;
	}

	public int size() {
		return da.count ;
	}

	public void showContents() {
		System.out.println("The Stack Contents from top to bottom.");
		da.showContents() ;
	}

	public boolean isEmpty() {
		return (da.count == 0 );
	}

	public boolean isFull() {
		return false;
	}

}
