package fixed.size.stacks.of.strings;

public interface IStack {

	public void push( char element ) ;
	
	public char pop() ;
	
	public char top() ;
	
	public int size() ;
	
	public void showContents() ;
	
	public boolean isEmpty() ;
	
	public boolean isFull() ;
	
}
