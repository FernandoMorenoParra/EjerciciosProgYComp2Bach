package Capitulo_3.ejercicios;

import java.util.Scanner;
public class Ejercicios_for_tarea_4 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int media, num, repeticiones, suma, contador = 0;
    
    System.out.println("¿Cuantos numeros desea introducir?");
    repeticiones = sc.nextInt();
	
    for (int i = 0; i < repeticiones; i++) {
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		//suma = suma + num;
		contador++;
	
   // media = suma/contador;
   // System.out.println("La media de los numeros es igual a: " + media);
	}
	}

}
