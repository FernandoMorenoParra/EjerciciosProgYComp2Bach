package Capitulo_2;

import java.util.Scanner;

public class Tarea6_MenuDeOpciones {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int opcion, seguir = 1 ;
			double num, num2, cat, rc, ind;
			while (seguir == 1) {
			
	        System.out.println("Menú de la calculadora");
	        System.out.println("1.- Hipotenusa de un triangulo");
	        System.out.println("2.- Superficie de una circuferencia");
	        System.out.println("3.- Perimetro de una circunferencia");
	        System.out.println("4.- Area de un rectangulo");
	        System.out.println("5.- Area de un triangulo");
	        System.out.println("0.- Salir de la aplicacion");
	        System.out.println("\n\tIntroduzca una opcion: ");
	  
	        opcion = sc.nextInt();
		    switch(opcion) {
		case 1: 
			System.out.println("Introduzca el primer cateto del triangulo: ");
			num = sc.nextInt();
			System.out.println("Introduzca el segundo cateto del triangulo: ");
			num2 = sc.nextInt();
		    System.out.println("La hipotenusa es: " +  (Math.hypot(num, num2)));	  
		    System.out.println("Teclea 1 para volver al menu"); 
		    seguir = sc.nextInt();
		    break;
		case 2:
			System.out.println("Introduzca un radio: ");
			num = sc.nextInt();
			System.out.println("La superficie de la circufenrencia es: " + (Math.PI * num * num));
			 System.out.println("Teclea 1 para volver al menu"); 
			    seguir = sc.nextInt();
			break;
		case 3:
			System.out.println("Introduzca un radio: ");
			num = sc.nextInt();
			System.out.println("El perimentro de la circunferencia es: " +  (Math.PI * num * 2));
			 System.out.println("Teclea 1 para volver al menu"); 
			    seguir = sc.nextInt();
			break;
		case 4: 
			System.out.println("Introduzca la base del rectangulo: ");
			num = sc.nextInt();
			System.out.println("Introduzca la altura del rectangulo: ");
			num2 = sc.nextInt();
			System.out.println("El area del rectangulo es: " + (num * num2));
			 System.out.println("Teclea 1 para volver al menu"); 
			    seguir = sc.nextInt();
			break;
		case 5:
			System.out.println("Introduzca la base del triangulo: ");
			num = sc.nextInt();
			System.out.println("Introduzca la altura del triangulo: ");
			num2 = sc.nextInt();
			System.out.println("El area del triangulo es: " + ((num * num2) / 2));
			 System.out.println("Teclea 1 para volver al menu"); 
			    seguir = sc.nextInt();
			break;	
		case 0:
			System.out.println("¿Desea salir de la aplicacion?");
			System.out.println(" 1 = NO");
			System.out.println(" 2 = SI");
		    seguir = sc.nextInt();
		    System.out.println("Aplicacion cerrada");
		    System.out.println("Gracias por usarme :D");
			break;
		default:
			System.out.println("Error, opcion incorrecta");
		}
		}
		}
	    }


