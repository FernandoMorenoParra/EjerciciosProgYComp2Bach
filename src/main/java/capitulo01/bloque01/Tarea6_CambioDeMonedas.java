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
	
	cambio = pago - cuenta;
	m100 = cambio/100;
	System.out.println("Monedas de 100: " + m100 + " = " + m100*100);
	
	c100 = cambio%100;	
	m50 = c100/50;
	System.out.println("Monedas de 50: " + m50 + " = " + m50*50);
	
	c50 = c100%50;	
	m25 = c50/25;
	System.out.println("Monedas de 25: " + m25 + " = " + m25*25);
	
	c25 = c50%25;
	m10 = c25/10;
	System.out.println("Monedas de 10: " + m10 + " = " + m10*10);
	
	c10 = c25%10;
	m5 = c10/5;
	System.out.println("Monedas de 5: " + m5 + " = " + m5*5);
	
	c5 = c10%5;
	m1 = c5/1;
	System.out.println("Monedas de 1: " + m1 + " = " + m1*1);
	System.out.println("Total de cambio: " + cambio +"€");
	
	}
}
