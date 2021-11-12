package Capitulo_3.ejercicios;

import java.util.Scanner;

public class Ejercicios_for_tarea_1 {

	public static void main(String[] args) {
		int suma = 0, num;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			if (num > 10) {
				suma = suma + num;		
				System.out.println("La suma es: " + suma);
		}
		}
		}
        }


