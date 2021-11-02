package capitulo01.bloque01;

import java.util.Scanner;

public class Tarea5_Condicionales3 {
 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		System.out.println("Introduzca un primer numero:" );
		num1 = sc.nextFloat();
		System.out.println("El numero introducido es: " + num1);
		
		System.out.println("Introduzca un segundo numero:" );
		num2 = sc.nextFloat();
		System.out.println("El numero introducido es: " + num2);
	
	if(num1 < num2) {
	
	System.out.println("El numero menor es: " + num1);
	}
	else {
		if(num2 < num1) {
	System.out.println("El numero menor es: " + num2);
		}
		else {
			System.out.println("Los dos numeros son iguales");
		}
	}
	}
	
	
	


}
