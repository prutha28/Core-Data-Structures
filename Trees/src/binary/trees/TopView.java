package binary.trees;

public class TopView {

	public static void main(String[] args) {

		
	}

	void top_view(Node root)
	{
	 
	    if( root == null)
	        return ;
	 
	    top_view(root.left) ;
	    System.out.print(root.data + " ") ;
	    top_view(root.right) ;
	}
	
}
