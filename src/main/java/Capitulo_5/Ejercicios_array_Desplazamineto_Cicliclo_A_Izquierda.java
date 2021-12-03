package Capitulo_5;

public class Ejercicios_array_Desplazamineto_Cicliclo_A_Izquierda {

	public static void main(String[] args) {
    int array[] = new int[] {1, 2, 3, 4, 5};
    int aux;
  
    //Imprimir en la consola antes de la rotacion
    System.out.print("Array: ");
    for (int i = 0; i < array.length; i++) {
    	System.out.print(array[i] + " ");
	}
    System.out.println();
    
    //Rotacion ciclica
    aux = array[array.length-1];
    for (int i = array.length - 2; i >= 0; i--) {
    	array[i +1] = array[i];		
	}
    array[0] = aux;
    
    //Imprimir en la consola despues de la rotacion
    System.out.print("Array: ");
    for (int i = 0; i < array.length; i++) {
    	System.out.print(array[i] + " ");
	}
    System.out.println();
	}

}
