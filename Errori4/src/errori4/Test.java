package errori4;

public class Test implements Runnable{//La classe doveva essere implementata e non estesa
	
	private Thread thread;
	
	public Test() {
		this.thread=new Thread(this);//Istanziare il thread inserendo come parametro il runnable ovvero la classe stessa.
	}

	@Override//Mancava l'ovverride
	public void run() {
		int i = 0;
		for(i=0;i<10;i++) {
			System.out.println(i=+i);//rimuovere i doppi apici, poiché deve restituire la somma.
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
	}
}
