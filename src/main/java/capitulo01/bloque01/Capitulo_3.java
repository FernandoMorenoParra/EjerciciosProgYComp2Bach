package capitulo01.bloque01;



public class Capitulo_3 {
	public static void main(String[] args) {
    System.out.println("Cuenta adelante: ");
	for(int i = 0; i<10 ; i++ ) {
		System.out.println(i);
	}
	System.out.println("Cuenta atras: ");
	for(int i = 10; i>0 ; i-- ) {
		System.out.println(i);
	}
    System.out.println("Genereacion de numero al azar");
    for(int i = 0; i<10 ; i++ ) {
    	int numAzar = (int) Math.round(Math.random() * 100);
    	System.out.println("Numero al azar: " + numAzar);
    }
	
	
	}
}
