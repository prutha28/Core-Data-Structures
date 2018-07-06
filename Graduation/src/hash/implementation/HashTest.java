package hash.implementation;

public class HashTest {

	public static void main(String[] args) {

		Hash hash = new Hash() ;

		Person robb = new Person("robb", "stark", 17) ;
		Person jon = new Person("jon", "snow", 16) ;
		Person arya = new Person("arya", "stark", 12) ;
		Person sansa = new Person("sansa", "stark", 15) ;
		Person sanas = new Person("sanas", "stark", 15) ;

		// Insertions
		hash.put(robb.getFirstname(), robb) ;
		hash.put(jon.getFirstname(), jon) ;
		hash.put(arya.getFirstname(), arya) ;
		hash.put(sansa.getFirstname(), sansa) ;
		hash.put(sanas.getFirstname(), sanas) ;

		hash.print() ;

		// Searching
		String lookUpKey = new String("robb") ;

		if(hash.get(lookUpKey) == null){
			System.out.println("Key not found");
		}else{
			System.out.println("Key found");
		}

		System.out.println("The number of elements in the hash map before removing is " + hash.size());

		// removing
		if(hash.get(lookUpKey) != null){
			hash.remove(lookUpKey) ;
			System.out.println("After Removing");
			hash.print() ;
		}


		// Size
		System.out.println("The number of elements in teh hash map after removing is " + hash.size());


		// Iterating over keys
		System.out.println();
		System.out.println("Iterating over the keys");

		for( String key : hash.keySet()){
			System.out.println("Key : " + key + ", Value : " + hash.get(key));
		}

		// Iterating over values
		System.out.println();
		System.out.println("Iterating over the values");

		for( Person person : hash.values()){
			System.out.println(person);
		}

		// Iterating over items.
		System.out.println();
		System.out.println("Iterating over the items");

		for( Item item : hash.entries()){
			System.out.println(item);
			System.out.println();
		}


		// Check for key
		lookUpKey = "sansa" ;
		if( hash.containsKey(lookUpKey)){
			System.out.println("The key " + lookUpKey + " is present in the hash.");
		}else{
			System.out.println("The key " + lookUpKey + " is not present in the hash.");
		}

		lookUpKey = "robb" ;
		if( hash.containsKey(lookUpKey)){
			System.out.println("The key " + lookUpKey + " is present in the hash.");
		}else{
			System.out.println("The key " + lookUpKey + " is not present in the hash.");
		}

		// Check for value

		Person lookUpPerson = new Person("catelyn", "Tully", 30) ;
		if( hash.containsValue(lookUpPerson)){
			System.out.println("The key " + lookUpPerson + " is present in the hash.");
		}else{
			System.out.println("The key " + lookUpPerson + " is not present in the hash.");
		}
		

		lookUpPerson = new Person("arya", "stark", 12) ;
		if( hash.containsValue(lookUpPerson)){
			System.out.println("The key " + lookUpPerson + " is present in the hash.");
		}else{
			System.out.println("The key " + lookUpPerson + " is not present in the hash.");
		}
		
		// Clearing contents of hashmap
		
		if( !hash.isEmpty()){
			hash.clear() ;
		}else{
			System.out.println("Hash map is already empty.");
		}
		
		
		
	}
}
