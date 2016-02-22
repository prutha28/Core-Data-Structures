package binary.trees;

public interface IBinaryTree {

	public Node insert( Node root, Node newNode) ;
	
	public boolean search(Node root, int data ) ;
	
	public int delete( Node root, int data ) ;
	
	public int size( Node root ) ;
	
}
