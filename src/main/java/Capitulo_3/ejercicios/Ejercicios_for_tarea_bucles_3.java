package Capitulo_3.ejercicios;

import java.util.Scanner;

public class Ejercicios_for_tarea_bucles_3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num, i , inicio , fin;
boolean numeroEsPrimo = true;

System.out.println("Escribe el numero con el que empiezas: ");
inicio = sc.nextInt();
System.out.println("Escribe el numero con el que acabas: ");
fin = sc.nextInt();
num = inicio;
i = 2;
while(num<= fin) {	
while(i < num) {
	if (num % i == 0) {
		numeroEsPrimo = false;
	}
	i++;
}
if(numeroEsPrimo == true) {
	System.out.println("El numero " + num + " es primo");
}
else {
	System.out.println("El numero " + num + " es compuesto");
}
num++;
numeroEsPrimo = true;
i = 2;
}
	}

}
