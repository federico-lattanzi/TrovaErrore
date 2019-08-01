package errori7;

public class SommaDueNumeri {
	public static void main(String[] args) {
		System.out.print("Questo programma somma due numeri.");//Ho chiuso i doppi apici e sostituo la virgola con un punto e virgola
		double i = 185;//Bisognava dare un tipo alla variabile i
		double j = 1936.27;//Ho cambiato il tipo della variabile j da int a double poichè il numero ha una virgola
		System.out.print("La somma di "+i+" e "+j+" e': ");
		double somma = i+j;//Per stampare la somma ho crato una variabile dove ho fatto la somma delle due variabili
		System.out.println(somma);
	}
}
