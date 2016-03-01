package hash.implementation;

import java.util.Collection;
import java.util.Set;

public interface IHash {

	// Search
	public Person get( String key ) ;
	
	// Insert
	public void put( String key, Person value ) ;
	
	// Delete
	public Person remove( String key ) ;
	
	public boolean isEmpty() ;
	
	public boolean containsKey( String key ) ;
	
	public boolean containsValue( Person value) ;
	
	public int size() ;
	
	public Set<String> keySet() ;
	
	public Collection<Person> values() ;
	
	public Collection<Person> entries() ;
	
}
