
public class Cordinate {

	int xCordinate ;
	int yCordinate ;
	String direction ; // "V" , "H", "D"
	
	public Cordinate() {
		this(0,0,"") ;
	}
	
	public Cordinate(int xCordinate, int yCordinate, String direction) {
		this.xCordinate = xCordinate ;
		this.yCordinate = yCordinate ;
		this.direction = direction ;
	}
	
	public String toString(){
		return "(" + 
				xCordinate + 
				", " + 
				yCordinate + 
				")" + direction ; 
	}
}
