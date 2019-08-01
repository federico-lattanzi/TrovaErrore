package errori4;

public class Test implements Runnable{//La classe doveva essere implementata e non estesa
	
	private Thread thread;
	
	public Test() {
		this.thread=null;
	}

	@Override//Mancava l'ovverride
	public void run() {
		int i = 0;
		for(i=0;i<10;i++) {
			System.out.println("i="+i);
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.run();//Non era start ma run
	}
}
