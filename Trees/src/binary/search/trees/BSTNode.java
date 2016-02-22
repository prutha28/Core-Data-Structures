package binary.search.trees;

public class BSTNode {

	int data ;
	BSTNode left ;
	BSTNode right ;
	
	public BSTNode(){
		this(-1) ;
	}
	
	public BSTNode( int data){
		this.data = data ;
		this.left = null ;
		this.right = null ;
	}
}
