package hash.implementation;

/**
 * @author prutha
 * This class represents the analog of Map.Entry<K,V>
 * Each bucket in the table array is a pointer of Type Item.
 * Each Item will store the key, value, hashcode & a next pointer.
 */


public class Item {

	String key ;
	Person person ;
	int hashCode ;
	Item next ;	
	
	
	public Item( String key, Person person){
		this.key = key ;
		this.person = person ;
	}
	
	public Item( String key, Person person, int hashCode){
		this( key, person) ;
		this.hashCode = hashCode ;
	}	
	
	public String toString() {
		return "Item [key=" + key + ", person=" + person + ", hashCode="
				+ hashCode + ", next=" + next + "]";
	}

}
