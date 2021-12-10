package Capitulo_6;

public class Ejercicios_array_Ordenacion_Porcentaje_Superirores_A_Valor_Medio {

	public static void main(String[] args) {
			int array[] = new int[8];
			int suma = 0, contador = 0, media = 0;
		   			
			//Inicializo el array
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) Math.round(Math.random() * 100 );
		}
			
			//Muestro en pantalla
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
	
	//Suma los numeros y hago la media 
	for(int i = 0; i < array.length; i++) {
		suma = suma + array[i];
		contador = contador + 1;
		media = suma/contador;
		
		
	}
	//Muestro en la consola el resultado
	System.out.println("Suma: " + suma);
	System.out.println("Media:" + media);
}
}

