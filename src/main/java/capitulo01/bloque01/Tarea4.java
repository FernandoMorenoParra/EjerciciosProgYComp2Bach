package capitulo01.bloque01;

import java.util.Scanner;

public class Tarea4 {
	public static void main(String[] args) {
		float n1, n2, aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escoja un 1º numero: ");
		n1 = sc.nextFloat();
		System.out.println("El numero 1º es: " + n1);
		
		System.out.println("Escoja un 2º numero: ");
		n2 = sc.nextFloat();
		System.out.println("El numero 2º es: " + n2);
		
		System.out.println("n1: " + n1 + " - n2: " + n2);
		aux = n1;
		n1 = n2;
		n2 = aux;
		System.out.println("n1: " + n1 + " - n2: " + n2);
		
		
	}
}
