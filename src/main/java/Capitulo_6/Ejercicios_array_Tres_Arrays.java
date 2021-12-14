package Capitulo_6;

public class Ejercicios_array_Tres_Arrays {

	public static void main(String[] args) {
    int[] array1 = new int[5], array2 = new int[5];
    float medias[] = new float[5];
    
    //Inicializo los valores de los dos primeros arrays
    for (int i = 0; i < medias.length; i++) {
		array1[i] = obtenerNumeroAlAzar();
		array2[i] = obtenerNumeroAlAzar();
	}
    
    //Mostrar el array en pantalla
    muestraArray(array1);
    muestraArray(array1);

	}
	
    /**
     * 
     * @param array
     */
	public static void muestraArray (int array[]) {
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @return
	 */
	public static int obtenerNumeroAlAzar() {
		int numAzar = (int) Math.round(Math.random() * 100);
		return numAzar;
	}
}
