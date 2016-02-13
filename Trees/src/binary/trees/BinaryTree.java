package binary.trees;

public class BinaryTree implements IBinaryTree{

	
	public Node insert(Node root, Node newNode) {
		if( root == null){
			root = newNode ;
			return newNode ;
		}else if( root.left == null){
			return insert( root.left, newNode) ;
		}else{
			return insert( root.right, newNode) ;
		}
		
	}

	public boolean search(Node root, int data) {
		
		return false;
	}

	public int delete(Node root, int data) {
		return 0;
	}

}
