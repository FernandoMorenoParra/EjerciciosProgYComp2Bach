package Capitulo_6;

import java.util.Scanner;

public class Ejercicios_array_Eliminar_Elemento_Array {

	public static void main(String[] args) {
    int array[] = new int[10];
    int posicionAEliminar;
    
    //Inializo sus valores
    for (int i = 0; i < array.length; i++) {
		array[i] = Ejercicios_array_Tres_Arrays.obtenerNumeroAlAzar();
	}
    //Muestro el array
    Ejercicios_array_Tres_Arrays.muestraArray(array);
  
    //Pregunto al usuario
    posicionAEliminar = pideEnteroAlUsuario();
    
    //Desplazo los numeros a la derecho de la posicion que me han dado
    for (int i = 0; i < array.length; i++) {
    	array[i-1] = array[i];
		
	}
    //Sobrescribo con un valor al azar la ultima posicon del array
    array[array.length-1] = Ejercicios_array_Tres_Arrays.obtenerNumeroAlAzar();
    
    //Muestro el array
    Ejercicios_array_Tres_Arrays.muestraArray(array);
	}
/**
 * 
 * @return
 */
	public static int pideEnteroAlUsuario() {
		Scanner sc = new Scanner(System.in);
		int entero;
		System.out.println("Introduzca un entero: ");
		entero = sc.nextInt();
		return entero;
	}
}
