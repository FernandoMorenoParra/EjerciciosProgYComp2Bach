package capitulo01.bloque01;

import java.util.Scanner;

public class Tarea5_Condicionales {
 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		System.out.println("Introduzca un primer numero:" );
		num1 = sc.nextFloat();
		System.out.println("El numero introducido es: " + num1);
		
		System.out.println("Introduzca un segundo numero:" );
		num2 = sc.nextFloat();
		System.out.println("El numero introducido es: " + num2);
	
	if(num1 > num2) {
	
	System.out.println("El numero mayor es: " + num1);
	}
	else {
	System.out.println("El numero mayor es: " + num2);
	
	}
	}
	
	
	


}
