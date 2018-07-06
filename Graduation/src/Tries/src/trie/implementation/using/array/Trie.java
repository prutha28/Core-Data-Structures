package trie.implementation.using.array;

public class Trie {

	TrieNode startNode = new TrieNode() ; 
	
	public void add( String word){
		
		if( word.length() == 0 ){// base case
			startNode.word = true ;
			return ;
		}
		
		char letter = word.charAt(0) ;
		int index = letter - 'a' ;	// for b , 98 - 97 = 1 index
		
		if( startNode.children[index] == null ){
			startNode.children[index] = new TrieNode(letter) ;
		}
		TrieNode current = startNode.children[index] ;
		while( current != null){
//			current = current.n
		}
		
	}
	
}
