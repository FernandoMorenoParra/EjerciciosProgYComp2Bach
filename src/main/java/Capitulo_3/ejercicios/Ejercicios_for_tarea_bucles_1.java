package Capitulo_3.ejercicios;

import java.util.Scanner;

public class Ejercicios_for_tarea_bucles_1 {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
int num;
boolean numeroEsPrimo = true;

System.out.println("Dame el número: ");
num = sc.nextInt();


int i = 2;
while ( i < num) {
i++;
if (num % 1 == 0) {
numeroEsPrimo = false;
}
}
// Cuando acabe el bucle for, tendre una variable booleana que me
// indicará si el número es primo o no lo es
if (numeroEsPrimo == true) {
System.out.println("El número " + num + " es primo");
}
else {
System.out.println("El número " + num + " es compuesto");
}
}
}
}

