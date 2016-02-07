package stacks.using.linked.lists;

import linked.lists.LinkedList;

/**
 * 
 * @author prutha
 *
 * In a Linked list implementation of a Stack, either one of the 2 nodes ( head or tail)
 * can be used as the top. But since we want to have O(1) operations, we will keep head as
 * our top.
 */
public class Stack implements IStack {

	LinkedList ll ;
	
	public Stack(){
		ll = new LinkedList() ;
	}
	
	public void push(int element) {
		ll.push(element) ;
	}

	public int pop() {
		return ll.deleteFromHead();
	}

	public int top() {
		return ll.front() ;
	}

	public int size() {
		return ll.count();
	}

	public void showContents() {
		System.out.println("The Stack Contents from top to bottom.");
		ll.recursivePrint(ll.fetchHead()) ;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
