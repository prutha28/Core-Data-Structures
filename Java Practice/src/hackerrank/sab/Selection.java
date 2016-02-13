package hackerrank.sab;

public enum Selection {

	X(true),
	Y(false),
	Z(true);
	
	Selection() {
	}
	
	Selection(boolean correct ) {
	}
	
	private boolean correct ;
	
	public void setCorrect( boolean correct ){
		this.correct = correct ;
	}
}


