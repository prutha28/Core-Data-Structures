package hackerrank.inf;

public class Q1 implements Runnable  {

	private Thread t ;
	private String threadName ;
	
	public Q1(String threadName) {
		this.threadName = threadName ;
	}

	public void run() {
		while( true){
			System.out.print(threadName);
		}
	}
	
	public void start(){
		
		if( t == null){
			t = new Thread(this, threadName) ;
			t.start() ;
		}
	}
	
	public static void main(String[] args) {
		Q1 A = new Q1("A") ;
		Q1 B = new Q1("B") ;
		B.start() ;
		A.start() ;
	}

}
