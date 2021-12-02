package Capitulo_5;

public class Ejercicios_array_Clasificacion_Numeros_Pares_E_Impares {

	public static void main(String[] args) {
			int array[] = new int[10];
			
			for(int i = 0; i < array.length; i++) {
				array[i] = (int) Math.round(Math.random() * 100);
				
			}
	        for (int i = 0; i < array.length; i++) {
	        	System.out.println(array[i] + " ");	
	        	
	          if (array[i] % 2 == 0) {
	        	  array[i] = array[2];    

	       }

	          if (array[i] % 3 == 0) {
	        	  array[i] = array[3];
	        	 
	       }
	       
	        }
	        System.out.println("Numeros pares: " + array[2] + " ");
	        System.out.println();
	        System.out.println("Numeros impares: " + array[3] + " ");
		}
}
	
	


