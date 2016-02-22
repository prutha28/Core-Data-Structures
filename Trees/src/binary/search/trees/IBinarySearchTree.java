package binary.search.trees;

import binary.trees.IBinaryTree;
import binary.trees.Node;

public interface IBinarySearchTree extends IBinaryTree{

	public Node insert( Node root, Node newNode) ;

	public boolean search(Node root, int data ) ;

	public int delete( Node root, int data ) ;

	public int size( Node root ) ;
}
