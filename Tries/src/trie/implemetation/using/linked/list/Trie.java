package trie.implemetation.using.linked.list;

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
		
		add(word.substring(1)) ;
		
	}
	
	
	public boolean isWord( String s ){
		
		
	}
	
}
