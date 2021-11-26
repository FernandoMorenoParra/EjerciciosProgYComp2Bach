package Capitulo_5;

public class Ejercicios_array_bucle_numeros_al_azar_suma_media {

	public static void main(String[] args) {
		// Declaro el array
		int array[] = new int[5];
		//Variable "suma" que almacenara el resultado de la suma
		int suma = 0,  media;
		
		//Iniciarlizar los valores del array
		for (int i = 0; i < array.length;i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			}

		//Saco en consola los valores de array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		//Suma los numeros, por ejemplo, 21, 33, 10, 0, 24
		for(int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		//Muestro en la consola el resultado
		System.out.println("Suma: " + suma);

	}

}
