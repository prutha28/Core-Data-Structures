package fixed.size.stacks.of.strings;

public class Stack implements IStack {

	private static int SIZE = 10 ;
	private char[] data; 
	private int top ;
	
	public Stack(){
		data = new char[ SIZE ] ;
		top = -1 ;
	}

	public void push(char element) {
		if( isFull())
			System.out.println("Stack is full, cant push more elements.");
		else{
			top++ ;
			data[ top ] = element ;
		}
	}

	public char pop() {
		if( isEmpty()){
			System.out.println("Stack is empty, nothing to pop.");
			return '\0';
		}
		char popped = data[ top ];
		top-- ;
		return popped ;
	}

	public char top() {
		return data[ top ];
	}

	public int size() {
		return ( top + 1);
	}

	public void showContents() {
		int i = top ;
		if( i==-1){
			System.out.println("Stack is Empty!");
			return ;
		}
		System.out.println("Stack top-down.");
		while( i > -1){
			System.out.println( data[i] );
			i-- ;
		}
	}

	public boolean isEmpty() {
		return ( top == -1 ? true : false );
	}

	public boolean isFull() {
		return (size()== SIZE? true : false) ;
	}
}
