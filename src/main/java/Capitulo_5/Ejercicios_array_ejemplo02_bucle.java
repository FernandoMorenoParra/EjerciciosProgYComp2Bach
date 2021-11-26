package Capitulo_5;

public class Ejercicios_array_ejemplo02_bucle {

	public static void main(String[] args) {
		// Declaro el array
		int array[] = new int[100];
		
		//Iniciarlizar los valores del array
		for (int i = 0; i < array.length;i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			}

		//Saco en consola los valores de array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
