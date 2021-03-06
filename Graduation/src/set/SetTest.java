package set;

import javax.print.attribute.standard.MediaSize.Other;

public class SetTest {

	public static void main(String[] args) {

		Set s = new Set() ;
		try{

			// INSERTIONS
			s.add(100) ;
			s.add(200) ;
			s.add(300) ;
			s.add(600) ;
			s.add(800) ;
			s.add(900) ;
			s.add(700) ;
			s.add(550) ;
			s.add(400) ;
			s.add(990) ;
			s.showContents() ;
			//			s.add(990) ;

			// DELETIONS
			s.delete(400) ;
			s.delete(900) ;
			s.delete(800) ;
			s.delete(700) ;
			System.out.println("Contents after deleting 100 :");
			s.showContents() ;
			//			s.remove(60) ;
			//			s.showContents() ;

			// SEARCHING
			System.out.println("Is 100 found in the set?" + s.search(100));
			System.out.println("Is 600 found in the set?");
			s.find(600) ;

			// Set Utils.
			System.out.println("---------------------------------------------");
			
			Set otherSet = new Set() ;
			otherSet.add(10) ;
			otherSet.add(100) ;
			otherSet.add(600) ;

			System.out.println("First set: ");
			s.showContents() ;
			System.out.println("Second set: ");
			otherSet.showContents() ;
			System.out.println();
			
			SetUtils utils = new SetUtils() ;
			System.out.println("The intersection of the 2 sets is ");
			Set intersection = utils.intersection(s, otherSet) ;
			intersection.showContents() ;
			
			System.out.println();
			System.out.println("The Union of the 2 sets is ");
			Set union = utils.union(s, otherSet) ;
			union.showContents() ;
			
		}catch(ElementNotInsertedException e){
			System.out.println("The element is already present in the set.");
		}
	}
}
