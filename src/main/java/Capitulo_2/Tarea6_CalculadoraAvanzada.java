package Capitulo_2;

import java.util.Scanner;

public class Tarea6_CalculadoraAvanzada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		float num, ind, num2 ;
		
  System.out.println("Menú de la calculadora");
  System.out.println("1.- Potencia");
  System.out.println("2.- Raíz");
  System.out.println("3.- Módulo");
  System.out.println("\n\tIntroduzca opcion: ");
  
  
  opcion = sc.nextInt();
  switch (opcion) {
  case 1: //Cálculo de la potencia
	  System.out.println("Introduzca la base: ");
	  num = sc.nextInt();
	  System.out.println("Introduzca el exponente: ");
	  num2 = sc.nextInt();
	  System.out.println("La potencia es: " + (Math.pow(num, num2)));
	  break;
  case 2: //Cálculo de la raiz
	  System.out.println("Introduzca el radicando de la raiz: ");
	  num = sc.nextFloat();
	  System.out.println("Introduzca el indice: ");
	  num2 = sc.nextFloat();
	
	 System.out.println("La raiz es: " + Math.pow(num, 1f/num2));
	  break;
  case 3: //Cálculo del modulo
	  System.out.println("Introduzca el dividendo: ");
	  num = sc.nextInt();
	  System.out.println("Introduzca el divisor: ");
	  num2 = sc.nextInt();
	  System.out.println("El módulo es: " + (num%num2));
  
  
  }
  }	
  }

