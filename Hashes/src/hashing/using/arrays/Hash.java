package hashing.using.arrays;

import java.util.List;
import java.util.Set;

public class Hash<Integer, V> implements IHash<Integer, V>{

	private static final int SIZE = 10;
	int hashArray[] ;
	
	public Hash(){
		hashArray = new int[ SIZE ] ;
	}
	
	public boolean put(Integer key, V value) {
		
		int index = hashcode(key) ;
		return false;
	}

	private int hashcode(Integer key) {
		return 0;
	}

	public boolean get(Integer key) {
		return false;
	}

	public V remove(Integer key) {
		return null;
	}

	public Set<Integer> keySet() {
		return null;
	}

	public List<V> values() {
		return null;
	}

	public int size() {
		return 0;
	}

	public boolean isEmpty() {
		return ( size() == 0 ? true : false );
	}

	public boolean containsKey(Integer key) {
		return false;
	}

	public boolean containsValue(V value) {
		return false;
	}
	
}
