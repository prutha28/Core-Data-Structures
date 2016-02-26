package binary.search.trees;


public interface IBinarySearchTree{

	public BSTNode insert( BSTNode root, int data ) ;

	public boolean search(BSTNode root, int data ) ;

	public BSTNode delete( BSTNode root, int data ) ;

	public int size( BSTNode root ) ;
}
