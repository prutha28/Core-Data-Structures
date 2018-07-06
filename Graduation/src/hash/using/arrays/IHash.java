package hash.using.arrays;

import java.util.List;
import java.util.Set;

public interface IHash<Integer, V> {

	// Insert
	public boolean put( Integer key, V value ) ;

	// Search
	public boolean get( Integer key ) ;
	
	// Delete
	public V remove( Integer key ) ;
	
	public Set<Integer> keySet() ;
	
	public List<V> values() ;
	
	public int size() ;

	public boolean isEmpty() ;

	public boolean containsKey( Integer key ) ;
	
	public boolean containsValue( V value) ;
	
}
