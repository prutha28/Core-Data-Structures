package trie.implemetation.using.linked.list;

import java.util.Arrays;

public class TrieNode {

	char c ;
	TrieNode next ;
	boolean word ;
	TrieNode[] children ;	

	public TrieNode(){
	}

	public TrieNode( char c){
		this.c = c ;
		this.next = null ;
		this.word = false ;
		this.children = new TrieNode[ 26 ] ;
	}

	public String toString() {
		return "TrieNode [c=" + c + ", next=" + next + ", word=" + word
				+ ", children=" + Arrays.toString(children) + "]";
	}
}

