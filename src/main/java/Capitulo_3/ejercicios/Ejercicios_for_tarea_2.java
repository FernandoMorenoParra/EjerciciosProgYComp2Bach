package Capitulo_3.ejercicios;

import java.util.Scanner;

public class Ejercicios_for_tarea_2 {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cuantos numeros desea incorporar a la suma:");
		repeticiones = sc.nextInt();
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			if (num > 10) {
				suma = suma + num;		
			}
			   System.out.println("La suma de los numeros mayores de 10 es: " + suma);
	        }
        	}
            }
