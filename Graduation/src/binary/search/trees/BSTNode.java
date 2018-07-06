package binary.search.trees;

public class BSTNode {

	@Override
	public String toString() {
		return "BSTNode [data=" + data + ", distance=" + distance + "]";
	}

	int data ;
	BSTNode left ;
	BSTNode right ;
	public BSTNode parent ;
	public int distance ;
	public String color ;

	public BSTNode(){
	}

	public BSTNode( int data){
		this.data = data ;
		this.left = null ;
		this.right = null ;
	}
}
