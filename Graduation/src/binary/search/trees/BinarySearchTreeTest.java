package binary.search.trees;

public class BinarySearchTreeTest {

	public static void main( String[] args) {
		BinarySearchTrees bst = new BinarySearchTrees() ;

		System.out.println("INSERTIONS");
		bst.root = bst.insert(bst.root, 7) ;
		bst.root = bst.insert(bst.root, 4) ;
		bst.root = bst.insert(bst.root, 11) ;
		bst.root = bst.insert(bst.root, 3) ;
		bst.root = bst.insert(bst.root, 5) ;
		bst.root = bst.insert(bst.root, 9) ;
		bst.root = bst.insert(bst.root, 16) ;
		bst.root = bst.insert(bst.root, 2) ;
		bst.root = bst.insert(bst.root, 6) ;
		bst.root = bst.insert(bst.root, 17) ;
		bst.root = bst.insert(bst.root, 25) ;
		System.out.println("Inserting elements ...");

		System.out.println("InOrder Traversal");
		bst.utils.inorderTraversal(bst.root) ;

		System.out.println();
		System.out.println("PreOrder Traversal");
		bst.utils.preorderTraversal(bst.root) ;

		System.out.println();
		System.out.println("PostOrder Traversal");
		bst.utils.postorderTraversal(bst.root) ;

		System.out.println();
		System.out.println("The least element is " + bst.utils.minValue(bst.root));
		System.out.println("The least element is ( Recursively) " + bst.utils.minValue_rec(bst.root));
		System.out.println("The largest element is " + bst.utils.maxValue(bst.root));

		System.out.println("SEARCHING");

		int val = 11 ;
		if(bst.search(bst.root, val) )
			System.out.println(val + " is present");
		else
			System.out.println(val + " is not present");

		//		System.out.println("DELETIONS");
		//		System.out.println("After Deleting " + val);
		//		bst.root = bst.delete(bst.root, val) ;
		//		bst.utils.inorderTraversal(bst.root) ;
		//		System.out.println();
		//		
		//		val = 25 ;
		//		System.out.println("After Deleting " + val);
		//		bst.root = bst.delete(bst.root, val) ;
		//		bst.utils.inorderTraversal(bst.root) ;
		//		System.out.println();

		val = 23 ;
		System.out.println("After Deleting " + val);
		bst.root = bst.delete(bst.root, val) ;
		bst.utils.inorderTraversal(bst.root) ;
		System.out.println();

		//	 MIRROR
		bst.root = bst.utils.mirror(bst.root) ;
		bst.utils.inorderTraversal(bst.root) ;
		System.out.println();

		// DOUBLING THE TREE
		System.out.println("Doubling the tree");
		bst.utils.doubleTree(bst.root) ;
		bst.utils.inorderTraversal(bst.root) ;

		// REMOVING HALF NODES

		BinarySearchTrees bst1 = new BinarySearchTrees() ;
		// Building the tree.
		bst1.root = new BSTNode(2 ) ;
		bst1.root.left = new BSTNode(7 ) ;
		bst1.root.right = new BSTNode(5 ) ;

		bst1.root.left.right = new BSTNode(6 ) ;
		bst1.root.left.right.left = new BSTNode(1 ) ;
		bst1.root.left.right.right = new BSTNode(11 ) ;
		bst1.root.left.right.right.right = new BSTNode(19 ) ;
		
		bst1.root.right.right = new BSTNode(9 ) ;
		bst1.root.right.right.left = new BSTNode(4 ) ;
		
		System.out.println();
		System.out.println("Before Removing the half nodes");
		System.out.println("height : " + bst1.utils.height(bst1.root) );
//		bst1.utils.inorderTraversal(bst1.root) ;
		bst1.utils.BFS(bst1.root) ;
		
		System.out.println();
		bst1.utils.removeHalfNodes(bst1.root) ;
		System.out.println("After Removing the half nodes");
		bst1.utils.inorderTraversal(bst1.root) ;
		
	}
}
