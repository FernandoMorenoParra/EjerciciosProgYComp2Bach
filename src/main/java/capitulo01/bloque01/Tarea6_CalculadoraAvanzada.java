package capitulo01.bloque01;

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
  case 1: 
	  System.out.println("Introduzca un numero: ");
	  num = sc.nextInt();
	  System.out.println("Introduzca un exponente: ");
	  num2 = sc.nextInt();
	  System.out.println("La potencia es: " + (Math.pow(num, num2)));
	  break;
  case 2:
	  System.out.println("Introduzca un numero: ");
	  num = sc.nextFloat();
	  System.out.println("Introduzca un indice: ");
	  ind = sc.nextFloat();
	  num2 = 1/ind;
	 System.out.println("La raiz es: " + (num * num2));
	  break;
	  
  case 3:
	  System.out.println("Introduzca un numero: ");
	  num = sc.nextInt();
	  System.out.println("Introduzca un divisor: ");
	  num2 = sc.nextInt();
	  System.out.println("El módulo es: " + num%num2);
  
  
  }
  }	
  }

