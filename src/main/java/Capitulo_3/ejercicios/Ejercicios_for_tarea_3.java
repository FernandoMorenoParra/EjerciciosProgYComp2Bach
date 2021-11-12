package Capitulo_3.ejercicios;

import java.util.Scanner;

public class Ejercicios_for_tarea_3 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int repeticiones, num, contadorPositivos = 0, contadorNegativos = 0;

    System.out.println("¿Cuantos numeros desea introducir? ");
    repeticiones = sc.nextInt();
    
    for(int i = 0; i < repeticiones; i++) {
    	System.out.println("Introduzca un numero: ");
    	num = sc.nextInt();
    	if (num > 0) {
    		contadorPositivos++;		
    	}
    	if (num < 0) {
    		contadorNegativos++;
    } 
    }
    System.out.println("Positivios: " + contadorPositivos + " Negativos " + contadorNegativos);
	}
	}

