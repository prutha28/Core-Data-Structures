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
		
		System.out.println("The number of elements in teh hash map after removing is " + hash.size());
		
		
	}
}
