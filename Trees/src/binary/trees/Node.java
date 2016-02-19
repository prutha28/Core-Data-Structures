package binary.trees;

public class Node {

	public int data ;
	public Node left ;
	public Node right ;
	
	public Node(){
		this(-1) ;
	}
	
	public Node( int data){
		this.data = data ;
		this.left = null ;
		this.right = null ;
	}
}
