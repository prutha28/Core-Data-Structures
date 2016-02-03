package fixed.size.stacks;

public class Stack implements IStack {

	private static int SIZE = 10 ;
	private int[] data; 
	private int top ;
	
	public Stack(){
		data = new int[ SIZE ] ;
		top = -1 ;
	}

	public void push(int element) {
		
	}

	public int pop() {
		return 0;
	}

	public int top() {
		return 0;
	}

	public int size() {
		return 0;
	}

	public void showContents() {
		
	}
}
