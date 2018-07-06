package trees;

public class PracticeTree {

	public Node insert( Node root, int data) {
		
		Node newNode = new Node(data);
		
		if( root == null) {			
			root = newNode;
			return root;
		}
		
		else if( data < root.data) {
			root.left = insert(root.left, data);
			return root.left;
		}
		else {
			root.right = insert(root.right, data);
			return root.right;
		}
		
	}
	
	
	public int findMaxVal( Node root) {
		
		if( root == null) {
			return Integer.MIN_VALUE;
		}
		
		Node current = root;
		
		while( current.right != null) {
			current = current.right;
		}
		return current.data;
	}
	
	
	public Node findMinNode( Node root) {
		
		if( root == null) 
			return null;
		
		else if( root.left == null) 
			return root;
		
		return findMinNode(root.left);
	}
	
	
	public void preOrder( Node root) {
		// root L R
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder( Node root) {
		//  L root R
		preOrder(root.left);
		System.out.println(root.data);
		preOrder(root.right);
	}
	
	public void postOrder( Node root) {
		//  L R root
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data);
	}
	
	
	
	public Node lca( Node root, Node n1, Node n2) {
		
		if( root == null)
			return null;
		
		else if( root.data == n1.data || root.data == n2.data) {
			return root;
		}
		
		Node left = lca(root.left, n1, n2);
		Node right = lca(root.right, n1, n2);
		
		if( left != null && right != null)
			return root;
		
		return ((left == null) ? right : left) ;
		
	}
	
	
	public boolean isSibling( Node root, Node node1, Node node2) {
		
		if( root == null)
			return false;
		
		else if(( root.left != null) && (root.right !=null)) {
			return (( root.left.data == node1.data) && (root.right.data == node2.data)) ||
				   (( root.right.data == node1.data) && (root.left.data == node2.data)) ;
		}
		
		return isSibling(root.left, node1, node2) ||
				isSibling(root.right, node1, node2);
			
	}

	public boolean isCousin( Node root, Node node1, Node node2) {
		
		if( root == null)
			return false;
		
		else {
			return ((level( root, node1, 0) == level( root, node2, 0)) &&
			!isSibling(root, node1, node2)) ; 
		}
	}


	private int level(Node root, Node node, int level) {
		
		if( root == null)
			return -1 ;
		
		else if( root.data == node.data) {
			return (level + 1);
		}
		
		int left = level( root.left, node, level + 1) ;
		int right = level( root.right, node, level + 1) ;
		
		if( left == -1 && right == -1) {
			// not found
			return -1;
		}
		else if( left == -1) {
			return right;
		}
		else {
			return left;
		}
	}
	
	
	
	public void printAtAllLevels( Node root) {
		
		int height = height(root);
		
		for( int i = 0 ; i < height; i++) {
			printAtEachLevel(root, i) ;
		}
	}


	private void printAtEachLevel(Node root, int level) {
		
		if( root == null ) 
			return ;
		
		if( level == 0 )
			System.out.println(root.data);
		
		printAtEachLevel(root.left, level-1);
		printAtEachLevel(root.right, level-1);
	}


	// maxDepth
	private int height(Node root) {
		
		if( root == null )
			return 0;
		else  {
		
			int left = 1 + height(root.left);
			int right = 1 + height(root.right);
			return (left >= right) ? left : right ;
		}
	}
	
	// diameter( root, 0)

//	private int diameter(Node root) {
//		
//		if( root == null )
//			return 0;
//		else  {
//			int l_height = maxPathLength(root.left);
//			int r_height = maxPathLength(root.right);
//			return ( l_height + r_height);
//		}
//	}
//	
//	private int maxPathLength(Node root) {
//		
//		if( root == null )
//			return 0;
//		else  {
//		
//			int left = 1 + height(root.left);
//			int right = 1 + height(root.right);
//			return (left + right);
//		}
//	}
	

	public int dist( Node root, Node node1, Node node2) {
		// (root to n1 + root to n2) - 2 * ( root to lca)
		// (lca to n1) +( lca to n2)
		if( root == null )
			return 0;

		Node lca = lca(root, node1, node2);
		int dist1 = distHelper(lca, node1);
		int dist2 = distHelper(lca, node2);
		return (dist1 + dist2) ;
	}
	
	public int distHelper( Node root, Node node) {
		
		if( root == null)
			return 0;
		
		return level(root, node, 0);
		
	}
	
	
	public boolean isIdentical( Node root1, Node root2) {
		
		if( root1 == null && root2 == null)
			return true ;
		
		else if(( root1 == null) || ( root2 == null))
			return false;
		
		else {
			return (( root1.data == root2.data) && 
					isIdentical(root1.left, root2.left) &&
					isIdentical(root1.right, root2.right));
		}
	}
	
	public boolean isSubtree( Node root, Node sub) {
		
	}
	
	public boolean hasPathSumFromRoot( Node root, int sum ) {
		
		if( root == null)
			return false;
		
		else if( root.data- sum == 0)
			return true;
		
		else {
			boolean left = hasPathSum(root.left, sum - root.data);
			boolean right = hasPathSum(root.left, sum - root.data);
			return (left || right) ;
		}
	}
	
	public boolean hasPathSum( Node root, int sum ) {
		
	
	}

	public int diameter( Node root) {
		
	}
	
	public boolean isBST(Node root) {
		
		if( root == null)
			return true;
		
	}
	
	public void printAllRootToLeafPaths( Node root) {
		
		if( root == null)
			return ;
		
		int path[] = new int[100] ;
		int pathlength = 0 ;
		printAllRootToLeafPathsHelper( root, path, pathlength);
	}


	private void printAllRootToLeafPathsHelper(Node root, int[] path, int pathlength) {
		
		if( root == null) {
			return ;
		}
		
		else if( root.left == null && root.right == null){
			// leaf node
			path[pathlength] = root.data;
			pathlength++;
			printArr(path, pathlength);
		}
		else {
			path[pathlength] = root.data;
			pathlength++;
			printAllRootToLeafPaths(root.left);
			printAllRootToLeafPaths(root.right);
		}
	}


	private void printArr(int[] path, int pathlength) {
		
		for (int i = 0; i < path.length; i++) {
			System.out.println(path[i]);
		}
	}
	
	public int numOfLeafs( Node root) {
		
		if( root == null)
			return 0;
		
		else if( root.left == null && root.right == null) {
			return 1;
		} 
		else {
			int left = numOfLeafs(root.left);
			int right = numOfLeafs(root.right);
			return (left + right) ;
		}
		
	}
	
	
	public int sumOfLeafs( Node root) {
		
		if( root == null)
			return 0;
		else if( root.left == null && root.right == null)
			return root.data;
		else {
			int leftSum = sumOfLeafs(root.left);
			int rightSum = sumOfLeafs(root.right);
			return ( rightSum + leftSum );
		}
	}
	
}
