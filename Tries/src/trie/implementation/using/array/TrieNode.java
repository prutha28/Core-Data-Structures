package trie.implementation.using.array;

import java.util.Arrays;

public class TrieNode {

	char c ;
	public boolean word ;
	public TrieNode[] children ;
	
	public TrieNode(){
		this.c = 0 ;
		this.children = new TrieNode[ 26 ] ;
	}

	public TrieNode( char c){
		this.c = c ;
		this.word = false ;
		this.children = new TrieNode[ 26 ] ;
	}

	public String toString() {
		return "TrieNode [c=" + c + ", word=" + word
				+ ", children=" + Arrays.toString(children) + "]";
	}
	
}
