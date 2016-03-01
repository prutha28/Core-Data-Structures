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
	}

}
