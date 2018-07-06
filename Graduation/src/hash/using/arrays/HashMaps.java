package hash.using.arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMaps {

	public static void main(String[] args) {

		Map<String, Integer> linkedmap = new LinkedHashMap<>() ; 
		Map<String, Integer> treemap = new TreeMap<>() ;
		Map<String, Integer> map = new HashMap<>() ;
		
		map.put("Sansa Stark", 14 ) ;
		map.put("Robb Stark", 16 ) ;
		map.put("Bran Stark", 10 ) ;
		map.put("Ned Stark", 32 ) ;
		map.put("Jon Snow", 14 ) ;
		map.put("Arya Stark", 12 ) ;
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet() ;
		Iterator itr = entries.iterator() ;
		
		while( itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("Keys");
		Set<String> keys = map.keySet() ;
		Iterator<String> keyItr = keys.iterator() ;
		
		while( keyItr.hasNext()){
			System.out.println(keyItr.next());
		}
		
		System.out.println("Values");
		Collection<Integer> values = map.values();
		Iterator<Integer> valueItr = values.iterator();
		
		while( valueItr.hasNext()){
			System.out.println(valueItr.next());
		}
	}

}
