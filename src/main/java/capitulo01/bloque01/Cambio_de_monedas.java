package capitulo01.bloque01;

import java.util.Scanner;

public class Cambio_de_monedas {

	public static void main(String[] args) {
		int cuenta, pago, cambio, m100, m50, m25, m5, m1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la cuenta: ");
		cuenta = sc.nextInt();
		System.out.println("La cuenta es de:" + cuenta);
		
		System.out.println("Introduzca con cuanto desea pagarlo:");
		pago = sc.nextInt();
		System.out.println("El pago es de: " + pago);
		
		cambio = pago - cuenta;
		//switch(cambio) {
		//case 1:
		if(cambio >= 100) {
		m100 = cambio/100;
		System.out.println("Monedas de 100: " + m100 );
		
		//case 2:
		if(cambio >= 50 && cambio<100) {
		m50 = cambio/50;
		System.out.println("Monedas de 50: " + m50);
		
		}
		}
	
}
}
	

	


