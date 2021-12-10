package Capitulo_6;

public class Ejercicios_array_Ordenacion_Burbuja {

	
	public static void main(String[] args) {
		int array[] = new int[20];
	    int menorDelIntervalo, posicionDelMenor;
		
		
		//Inicializo el array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100 );
	}
		
		//Muestro en pantalla
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		//Comenzamos con la seleccion directa
		for (int i = 0; i < array.length; i++) {
			menorDelIntervalo = array[i];
			//System.out.println("i vale: " + i);
			menorDelIntervalo = array[i];
			posicionDelMenor = i;
		for (int j = i; j < array.length; j++) {
			//System.out.println("\tj vale: " + j);
			if (array[j] < menorDelIntervalo) {
				menorDelIntervalo = array[j];
				posicionDelMenor = j;
				//System.out.println("\t\tEl nuevo menor es " + array[j]);
			}
			
		}
		//Cuando acabo el bucle de la "j" se que en la variable
		// "posicionDelMenor" tengo cargado el valor de la posicon que
		//ocupa el menor valor explorado por la variable j
		int aux = array[i];
		array[i] = array[posicionDelMenor];
		array[posicionDelMenor]= aux;
		}
		
		//Muestro en pantalla
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
	}
}
		
