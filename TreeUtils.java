package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeUtils {

	public static int arr[];
	
	public static void main(String args[]) {
		
	}
	
	
	// Height or Depth of binary tree
	// assuming 1 for the root node.
	public int height( Node root) {
		
		if( root == null)
			return 0;
		
		else {
			return ( 1 + max( height(root.left), height(root.right)));
		}
	}
	
	// 3 
	public int maxDepth( Node root) {
	
		if( root == null)
			return 0;
		
		else {
			int leftDepth = 1 + maxDepth(root.left);
			int rightDepth = 1 + maxDepth(root.right);
			return max( leftDepth, rightDepth);
		}
		
	}
	
	// Recursively finds the number of nodes in the tree
	public int size( Node root) {
		
		if( root == null)
			return 0;
		
		else 
			return ( size(root.left) + 1 + size( root.right));
	}
	
	// Recursively finds the sum of all nodes
	public int sum( Node root) {
	
		if( root == null)
			return 0;
		else 
			return sum( root.left) + root.data + sum(root.right) ;
	}
		
	
	private int min(int a, int b) {
		return ((a >= b) ? b : a );		
	}
	
	private int max(int a, int b) {
		return ((a >= b) ? a : b );		
	}

	// Find the node with the least value in a BST
	// Non Recursive solution
	public static Node findMinNode(Node root) {
		
		Node current = root;
		
		if( current == null) 
			return null;
		
		while( current.left != null ) {
			current = current.left;
		}
		
		return current;
		
	}
	
	// Find the node with the least value in a BST
	// Recursive solution
	public int findMin(Node root) {
		
		if( root == null)
			return -1;
		
		else if( root.left == null )
			return root.data;
		
		else 
			return findMin(root.left);	
	}
	

	public Node findMinNodeRec( Node root) {
		
		if( root == null) 
			return null;
		
		else if( root.left == null) 
			return root;
		
		return findMinNodeRec(root.left);
	}
	
	
	// Prints in the order 
	// L root R
	public void printInOrder(Node root) {
		
		if( root == null)
			return ;
		
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}
	
	// root L R
	public void printPreOrder(Node root) {
		
		if( root == null)
			return ;
		
		System.out.println(root.data);
		printInOrder(root.left);
		printInOrder(root.right);
	}
	
	// L R Root
	public void printPostOrder(Node root) {
		if( root == null)
			return ;
		
		printInOrder(root.left);
		printInOrder(root.right);
		System.out.println(root.data);
	}
	

	
	public boolean isMirror( Node root1, Node root2) {
		
		// Think of a 0 node tree
		// Think of tree with only 3 nodes, 1 L child, root, 1 R child
		
		// Base case
		if( root1 == null && root2 == null) {
			return true;
		}
		else if( root1 != null && root2 != null) {
			
			return ( (root1.data == root2.data) 
					&& (isMirror(root1.left, root2.left))
					&& (isMirror(root1.right, root2.right)));
		}
		else {
			// 1 null, other non-null
			return false;
		}
			
	}
	
	public boolean isBST(Node root) {
		return false;
	}
	
	public Node removeHalfNodes( Node root){
		return null;
	}
	
	
	// 7
	// Given a binary tree and a sum, return true if the tree has a root-to-leaf path 
	// such that adding up all the values along the path equals the given sum. 
	// Return false if no such path can be found. 
	public boolean hasPathSum( Node root, int sum) {
		// return true if we run out of tree and sum==0 
		// Used for leaf nodes also
		if( root == null)
			return (sum == 0); 	// << Critical >>
		
		else if( root.left != null & root.right != null) {
			// leaf node
			return ((sum- root.data) == 0);
		}
		else {
			return (hasPathSum(root.left, sum-root.data) ||
					hasPathSum(root.right, sum-root.data));
		}
		
		
		// OR
		
//		if( root == null)
//			return false;
//		
//		else if( root.data- sum == 0)
//			return true;
//		
//		else {
//			boolean left = hasPathSum(root.left, sum - root.data);
//			boolean right = hasPathSum(root.left, sum - root.data);
//			return (left || right) ;
//		}
	}
	
	
	public void printPathsWithPathSum( Node root, int[] path, int pathLength, int sum) {
		
		if( root == null)
			return ;
		
		path[pathLength] = root.data;
		pathLength++;
		sum = sum-root.data;
		
		if( sum == 0 ) {
			// root.left == null && root.right == null 
			// Leaf is reached and sum is zero
			// Path Found
			printArr(path);
			return ;
		}
		printPathsWithPathSum(root.left, path, pathLength, sum);
		printPathsWithPathSum(root.right, path, pathLength, sum);
	}
	
	// DO //
	// 8
	// Given a binary tree, print out all of its root-to-leaf paths
	public void printAllRootToLeaf( Node root) {
		List<Integer> path = new ArrayList<>();
		int pathLength = 0 ;
		printAllRootToLeafHelper(root, path, pathLength);	
	}
	
	public void printAllRootToLeafHelper( Node root, List<Integer> path, int pathLength) {
		
		if( root == null )
			return ;
		
		path.add(pathLength, root.data);
		pathLength++ ;
		
		if( root.left == null && root.right == null) {
			// leaf is reached, print out the array contents
			printArr(path);
		}
		else {
			printAllRootToLeafHelper(root.left, path, pathLength);
			printAllRootToLeafHelper(root.right, path, pathLength);
		}
	}
	
	private void printArr(List<Integer> path) {
		System.out.println("Array Contents");
		for( int i : path) {
			System.out.println(path.get(i) + ", ");
		}
	}

	private void printArr(int[] path) {
		System.out.println("Array Contents");
		for( int i : path) {
			System.out.println(path[i] + ", ");
		}
	}
	
	
	// Problems when you only want to deal with leaf nodes
	// When you need to do (left results + right results)
	public int numberOfLeafNodes( Node root) {
		
		if( root == null)
			return 0;
		
		else if( root.left == null && root.right == null) {
			return 1 ;
		}
		else {
			// When you need processing the left subtree and right subtree individually
			// and returning the aggregate result.
			int leftCount = numberOfLeafNodes(root.left);
			int rightCount = numberOfLeafNodes(root.right);
			return leftCount + rightCount ;
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

	// TODO
	// https://www.geeksforgeeks.org/delete-leaf-nodes-with-value-k/
	// Given a Binary tree, delete all leaf nodes with values equal to K
	// First search for a node with value k, only if it is a leaf delete it
	// Each step of recursion will return the pointer to the subtree from which 
	// node was deleted ( after the node was indeed deleted)
	public Node deleteLeafNodesWithValueK( Node root, int k ) {
		
		if( root == null)
			return null;
		
		else if( (root.data == k) && (root.left == null && root.right == null)) {
			// node with value k was located and is leaf
			return null;
		} 
		else {
			root.left = deleteLeafNodesWithValueK( root.left, k);
			root.right = deleteLeafNodesWithValueK( root.right, k);
			return root;
		}
	}
	
	// TODO
	public Node doubleTree(Node root) {
		return null;
	}
	
	// Level wise traversal
	public void printAtAllLevels( Node root) {
		
		if( root == null)
			return ;
		
		// Assuming levels start from 1 
		// i.e. level of the root of the tree is 0
		int i = 0 ;
		
		while( i <= height(root)) {
			printAtLevel(root, i) ;
			i++;
		}
	}
	
	
	private void printAtLevel(Node root, int level) {
		
		if( root == null)
			return ;
		
		else if( level == 0) {
			System.out.println(root.data);
		}
		else {
			printAtLevel(root.left, level -1) ;
			printAtLevel(root.right, level -1) ;
		}
	}


	
	// Given a binary tree, write a function that returns true if the tree satisfies below property.
	//For every node, data value must be equal to sum of data values in left and right children.
	// Consider data value as 0 for NULL children.
	
	public boolean isSumNode( Node root) {
		
		if( root == null)
			return true;
		
		else if( root.left == null && root.right == null) {
			// leaf node
			return true;
			// This condition is needed. 
			// Without this condition, for any leaf node, 
			// leafnode's value = 0 + 0 will return false  
		}
		else {
			// Created to deal with cases when one of the nodes is null
			// Set the sum of that side to 0
			int leftSum = ((root.left == null) ? 0 : root.left.data);
			int rightSum = ((root.right == null) ? 0 : root.right.data);
			
			return ( root.data == (leftSum + rightSum)) && 
					isSumNode(root.left) && 
					isSumNode(root.right);
		}
		
	}
	
	// Given a binary tree, Write a function that returns true if the given Binary Tree is SumTree else false. 
	// A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes 
	// present in its left subtree and right subtree. 
	// An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.
	// https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
	// O(n^2)
	public boolean isSumTree( Node root) {
		
		if( root == null)
			return true;
		
		else if( root.left == null && root.right == null)
			return true;
		
		else {
			int leftSum = sum(root.left) ;
			int rightSum = sum(root.right);
			return (root.data == (leftSum + rightSum)) &&
					isSumNode(root.left) && 
					isSumNode(root.right);
		}
	}
	
	// Technique : Keep calculating the sum for the 
	public boolean isSumTree2( Node root) {
		// by doubling
		

	}

	
	// DO
	// Given a binary tree rooted at root, find the least common ancestor
	// of data1 and data2
	
	// Technique 1 : 
	// 1. Find the path array from root to node1
	// 2. Find the path array from root to node2
	// 3. Traverse both arrays until you find the diversion
	
	// Technique 2 :
	public Node LCA( Node root, int data1, int data2) {
		
		if( root == null)
			return null;
		
		else if((root.data == data1) || (root.data == data2)) {
			// if root data is equal to anyone of the data
			// root itself is the LCA
			return root;
		}
		
		Node left = LCA(root.left, data1, data2);
		Node right = LCA(root.right, data1, data2);
		
		// If both of the above calls return Non-NULL, then one key
        // is present in one subtree and other is present in other subtree.
        // So this node is the LCA
		if(( left != null) && (right != null)) 
			return root;
		
		return ((left != null) ? left : right);	
	}
	
	public boolean isCousin( Node root, int n1, int n2) {
		
		// If 2 nodes are cousins, they have to be at the same level
		// but their parents should not be the same i.e. 
		// they should not be siblings
		
		if( root == null)
			return false;
		
		return( (level(root, n1, 0)==level(root, n2, 0)) && 
				!isSibling(root, n1, n2));
		
	}
	
	// DO
	// Returns the level of a particular node in the tree.
	// If node is not found, it returns -1
	public int level(Node root, int n, int level) {
		// if tree is empty level will be -1
		// This is also helpful to decide if the node was found in the left/right subtree
		if( root == null )
			return -1;
		
		else if( root.data == n) {
			return ( 1 + level);
		}
		
		int left = level(root.left, n , level);
		int right = level(root.left, n , level);
		
		return ( (left != -1) ? left : right) ; 
	}

	// DO
	public boolean isSibling(Node root, int n1, int n2) {
		
		// If 2 nodes have the same parent
		if( root == null)
			return false;
		
		else if( root.left != null && root.right != null) {
			return ((root.left.data == n1 && root.right.data == n2) || 
					(root.right.data == n1 && root.left.data == n2));
		}
		
		else {
			return isSibling(root.left, n1, n2) || isSibling(root.right, n1, n2);
		}
		
	}
	
	// DO
	// Given any 2 nodes in a binary tree, find the distance between those nodes
	// Technique 1 : distance( root, n1) + distance( root, n2) - 2 * distance( root,lca)
	// Technique 2 : distance(lca, n1) + distance(lca, n2)
	public int distance( Node root, int n1, int n2) {
		
		if( root == null)
			return -1 ;
		
		Node lcaNode = LCA( root, n1, n2);
		// Treating the lca as the root, find the distance from it to both nodes
		int dist1 = level(lcaNode, n1, 0);
		int dist2 = level(lcaNode, n2, 0);
		return (dist1 + dist2) ;
	}
	
	// https://www.geeksforgeeks.org/print-nodes-dont-sibling-binary-tree/
	// Print all nodes that do not have sibling
	public void printNodesWithNoSib( Node root) {
		
		if( root == null)
			return ;
		
		else if( root.left != null && root.right != null ) {
			// Internal node with 2 children
			printAllRootToLeaf(root.left);
			printAllRootToLeaf(root.right);
		}
		else if( root.left != null && root.right == null) {
			// no sibling, print it
			System.out.println(root.left.data);
		}
		
		else if( root.left == null && root.right != null) {
			// no sibling, print it
			System.out.println(root.right.data);
		}
		
		else {
			return;
		}
	}
	
	
	public int diameter( Node root, int depthTillNow) {
		
		if( root == null)
			return 0;
		
		else {
			int depth = maxDepth(root);	
		}
	}
	
	
	public int maxDepth( Node root) {
		
		if( root == null)
			return 0;
		
		else {
			int left =  1 + maxDepth(root.left);
			int right = 1 + maxDepth(root.right);
			return max(left, right);
		}
	}
}
