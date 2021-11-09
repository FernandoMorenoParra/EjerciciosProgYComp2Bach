package capitulo01.bloque01;

import java.util.Scanner;

public class Tarea6_CambioDeMonedas {

	public static void main(String[] args) {
		int m100, c100,m50, c50, m25, c25, m10, c10, m5, c5, m1, c1, cuenta, cambio, pago;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la cuenta: ");
		cuenta = sc.nextInt();
		System.out.println("La cuenta es de:" + cuenta);
		
		System.out.println("Introduzca con cuanto desea pagarlo:");
		pago = sc.nextInt();
		System.out.println("El pago es de: " + pago);
		if (cuenta > pago) {
			System.out.println("Error, el pago es menor a la cuenta");				
		}
		if (cuenta < pago) {
			
	cambio = pago - cuenta;
	m100 = cambio/100;
	System.out.println("Monedas de 100: " + (cambio/100));
	cambio &= 100;
	System.out.println("Monedas de 50: " +  (cambio/50));
	cambio &= 50;
	System.out.println("Monedas de 25: " +  (cambio/25));
	cambio &= 25;
	System.out.println("Monedas de 10: " +  (cambio/10));
	cambio &= 10;
	System.out.println("Monedas de 5: " +  (cambio/5));
	cambio &= 5;
	System.out.println("Monedas de 1: " +  (cambio/1) );
	cambio &= 1;
	System.out.println("Total de cambio: " + cambio +"€");	
	}
	}
    }

