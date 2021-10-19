package capitulo01.bloque01;

import java.util.Scanner;

public class Ejemplo01_introduccionDatosUsuario {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor introduzca un numero: ");
	int num = sc.nextInt();
	System.out.println("El numero introducido es: " + num);
	
	System.out.println("Por favor introduzca un numero flotante: ");
	float num2 = sc.nextFloat();
	System.out.println("El numero introduciod es:" + num2);
	
	System.out.println("Por favor introduzca un numero string: ");
	String num3 = sc.next();
	System.out.println("El numero introducido es: " + num3);

	}

}
