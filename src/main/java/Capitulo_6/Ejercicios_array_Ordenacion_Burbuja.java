package Capitulo_6;

public class Ejercicios_array_Ordenacion_Burbuja {

	
	public static void main(String[] args) {
		int aux1, aux2;
		int array[] = new int[8];
		boolean c = false;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100 );
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		do {
			for (int i = 0; i < array.length; i++) {
				aux1 = i;
				aux2 = i;
				for (int a = i+1 ; a < array.length; a++) { 
					if (array[a] < array[i] ) {
						aux2 = a;
						aux1 = a;
						c = true;	
					}
					else {
						c=false;
					}
					
				}
				array[aux2]=array[i];
				array[i]=array[aux1];
			}
		}
		while(c = true);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
}
