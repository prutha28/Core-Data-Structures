package binary.trees;

public class BinaryTreeTest {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree() ;
		bt.root = new Node(1) ;
		bt.root.left = new Node(2) ;
		bt.root.right = new Node(3) ;
		bt.root.left.left = new Node(4) ;
	}

}
