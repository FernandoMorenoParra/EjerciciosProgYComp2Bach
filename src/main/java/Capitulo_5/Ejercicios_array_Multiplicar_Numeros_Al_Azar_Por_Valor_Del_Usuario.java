package Capitulo_5;

import java.util.Scanner;

public class Ejercicios_array_Multiplicar_Numeros_Al_Azar_Por_Valor_Del_Usuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int num;
		
		System.out.println("Introduzca el numero por el que desea multiplicarlo: ");
		num = sc.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			
		}
        for (int i = 0; i < array.length; i++) {
        	System.out.println(array[i] + " ");	
        	System.out.println("Multiplicado por " + num + " es: " + array[i]*num + " ");	

	}

	}
}
