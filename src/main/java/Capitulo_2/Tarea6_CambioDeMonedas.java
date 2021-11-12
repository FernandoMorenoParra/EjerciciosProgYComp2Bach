package Capitulo_2;

import java.util.Scanner;

public class Tarea6_CambioDeMonedas {

	public static void main(String[] args) {
		int  cuenta, cambio, pago;
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

