package Capitulo_5;

public class Ejercicios_array_Suma_Media_Array_Generado_Al_Azar {

	public static void main(String[] args) {
	 int array[] = new int[150];
	 int suma = 0;
	 float media, mayor, menor;
	 
	 //Inicializa los valores dentro del array
	 for (int i = 0; i < array.length; i++) {
		 array[i] = (int) Math.round(Math.random() * 100);
	 }
	 
	 //Calculo suma, media, mayor y menor
	 for (int i = 0; i < array.length; i++) {
		suma = suma + array[i];
		if (i == 0) { //La primera iteracion del bucle
			mayor = array[i];
			menor = array[i];
		}
		else { // El resto de iteracions del bucle
			//if (array[i] > mayor) {
				mayor = array[i];
			}
		//if (array[i] < menor) {
			menor = array[i];
		}
		//}
	//}
	 //Calculo de la media
	 media = suma / (float) array.length;
	 
	 //Muestra los valores del array en la consola
     for (int i = 0; i < array.length; i++) {
		System.out.println(array[i] + " ");
	}
     System.out.println();
     System.out.println("La suma de los numeros es: " + suma);
	}

}
