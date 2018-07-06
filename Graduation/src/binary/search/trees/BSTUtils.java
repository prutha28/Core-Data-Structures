package binary.search.trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class BSTUtils {

	public int size( BSTNode root){

		if( root == null)
			return 0 ;

		return ( 1 + size( root.left) + size(root.right) );
	}

	public int minValue( BSTNode root){
		BSTNode current = root ;

		while( current.left != null){
			current = current.left ;
		}

		return current.data ;
	}

	public BSTNode minNode( BSTNode root){
		BSTNode current = root ;

		while( current.left != null){
			current = current.left ;
		}

		return current ;
	}

	public int maxValue( BSTNode root){
		BSTNode current = root ;

		while( current.right != null){
			current = current.right ;
		}

		return current.data ;
	}

	public int minValue_rec( BSTNode root){

		if( root == null)
			return 0;

		if( root.left == null && root.right == null)
			return root.data ;

		else
			return minValue_rec(root.left) ;
	}

	// Traversals
	public void inorderTraversal( BSTNode root){

		if( root == null)
			return ;
		inorderTraversal(root.left) ;			// First process the left child
		System.out.print(root.data + " ");		// Next process the root.
		inorderTraversal(root.right) ;			// Last process the right child
	}

	public void preorderTraversal( BSTNode root){
		if( root == null)
			return ;
		System.out.print(root.data + " ");
		preorderTraversal(root.left) ;
		preorderTraversal(root.right) ;
	}

	public void postorderTraversal( BSTNode root){
		if( root == null)
			return ;
		postorderTraversal(root.left) ;
		postorderTraversal(root.right) ;
		System.out.print(root.data + " ");
	}

	public BSTNode mirror( BSTNode root){

		if( root == null )
			return null ;

		//		if( root.right == null && root.left == null){
		//			return root ;
		//		}
		//
		//		else if( root.right == null && root.left != null){
		//			root.right = root.left ;
		//			root.left = null ;
		//		}
		//		else if( root.right != null && root.left == null){
		//			root.left = root.right ;
		//			root.right = null ;
		//		}
		else{
			BSTNode temp = root.left ;
			root.left = root.right ;
			root.right = temp;
			mirror(root.right) ;
			mirror(root.left) ;
		}
		return root ;
	}


	public void doubleTree( BSTNode root ){

		if( root == null)
			return  ;

		doubleTree(root.left) ;
		doubleTree(root.right) ;

		BSTNode newNode = new BSTNode(root.data) ;
		newNode.left = root.left ;
		root.left = newNode ;

	}

	public BSTNode removeHalfNodes( BSTNode root){

		if( root == null)
			return null ;

		root.left = removeHalfNodes(root.left) ;
		root.right = removeHalfNodes(root.right) ;

		if( root.left == null && root.right == null)
			return root ;

		else if( root.right == null)
			return root.left ;

		else if( root.left == null )
			return root.right ;

		return root ;

	}


	public boolean isBSTSame( BSTNode a, BSTNode b){

		if( a == null && b == null)
			return true ;

		else if( a != null && b != null){
			return ( (a.data == b.data ) && 
					isBSTSame(a.left, b.left) &&
					isBSTSame(a.right, b.right) ) ;
		}else{
			return false ;
		}

	}

	public void printAllLevels( BSTNode root){

		for (int level = 0; level < height( root ); level++) {
			printAtLevel( root, level ) ;
		}
	}


	private void printAtLevel(BSTNode root, int level) {

		if( root == null)
			return ;

		if( level == 0 ) // 
			System.out.println(root.data);

		printAtLevel(root.left, level-1) ;
		printAtLevel(root.right, level-1) ;
	}

	// assuming 1 for the root node.
	public int height(BSTNode root) {

		if( root == null)
			return 0;	

		else{
			return 1 + max (height(root.left), height(root.right)) ; 
		}
	}

	private int max(int a, int b) {
		return ( a >=b ) ? a : b ;
	}

	public void BFS( BSTNode root){

		Queue<BSTNode> q = new LinkedList<BSTNode>();

		if( root == null )
			return ;

		q.offer(root) ;

		root.color = "grey" ;
		root.distance = 0 ;
		root.parent = null ;

		while( !q.isEmpty()){

			BSTNode removed = q.poll() ;

			if( removed != null){
				System.out.print(removed.data + " ");
				if( removed.left != null){
					q.offer(removed.left) ;
					removed.left.parent = removed ; 
					removed.left.color = "grey" ;
					removed.left.distance = 1 + removed.distance ;
				}

				if( removed.right != null){
					q.offer(removed.right) ;
					removed.right.parent = removed ;
					removed.right.color = "grey" ;
					removed.right.distance = 1 + removed.distance ;
				}
			}
			
//			Iterator<BSTNode> itr = q.iterator() ;
//			while( itr.hasNext()){
//				System.out.print( itr.next() + " ");
//			}
//			System.out.println();
			removed.color = "black" ;
		}
	}		
		
		BSTNode lca(BSTNode root, int v1, int v2){

		       if( root == null )
		           return null ;
		    
		        if( v1 < root.data && v2 < root.data ){
		            return lca( root.left, v1 , v2)  ;
		        }
		    
		    
		        if( v1 > root.data && v2 > root.data ){
		            return lca( root.right, v1 , v2)  ;
		        }
		    
		        else{
		            return root ;
		        }
		}


}
