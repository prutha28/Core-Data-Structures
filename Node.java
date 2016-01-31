
class Node{
	
	int data ; 
	Node next ;


	// Empty Node
	public Node(){
		this(-1) ;
	}

	public Node( int data ){
		this.data = data ;
		this.next = null ;
	}

	public void showContents(){
		System.out.println( " The Node contents :" + this.data ) ;
		System.out.println( " The Node points to :" + this.next ) ;
	}
}
