package capitulo01.bloque01;

import java.util.Scanner;

public class Tarea5_Condicionales2 {
 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float num1;
		
		System.out.println("Introduzca un primer numero:" );
		num1 = sc.nextFloat();
		
		if (num1 % 2 == 0) {
		System.out.println("El numero " + num1 + " es par");	
		}
		else {
		System.out.println("El numero es impar " + num1);	
		}
	
	
	}
		
		
	
	
	
	
	


}

