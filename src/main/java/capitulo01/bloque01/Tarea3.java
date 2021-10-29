package capitulo01.bloque01;

import java.util.Scanner;
    public class Tarea3 {
	public static void main(String[] args) {
		float N1, N2, N3, Suma, Media;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Introduzca un 1º numero: ");
		 N1 = sc.nextFloat();
		 System.out.println("El numero es: " + N1);
		 
		 System.out.println("Introduzca un 2º numero: ");
		 N2 = sc.nextFloat();
		 System.out.println("El numero es: " + N2);
		 
		 System.out.println("Introduzca un 3º numero: ");
		 N3 = sc.nextFloat();
		 System.out.println("El numero es: " + N3);
		 
		 Suma = N1 + N2 +N3;
		 Media = Suma / 3;
		 System.out.println("La suma total es: " + Suma );
		 System.out.println("La media total es: " + Media);	
}
}
