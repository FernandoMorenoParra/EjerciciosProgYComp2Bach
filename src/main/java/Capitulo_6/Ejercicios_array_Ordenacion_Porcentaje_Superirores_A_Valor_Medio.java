package Capitulo_6;

public class Ejercicios_array_Ordenacion_Porcentaje_Superirores_A_Valor_Medio {

	public static void main(String[] args) {
    int array[] = new int[10];
    int suma = 0;
    float media;
    
    //Inicializo los valores del array
    for (int i = 0; i < array.length; i++) {
    	array[i] = (int) Math.round(Math.random() *100);
	}
    
    //Muestro el array
    for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
	}
    System.out.println();
    
    //Calculo el valor medio
    for (int i = 0; i < array.length; i++) {
		suma += array[i];
	}
    media = suma / (float) array.length;
    System.out.println("La media vale: " + media);
    
    //Calculo los numeros bajo el valor medio
    
	}
}