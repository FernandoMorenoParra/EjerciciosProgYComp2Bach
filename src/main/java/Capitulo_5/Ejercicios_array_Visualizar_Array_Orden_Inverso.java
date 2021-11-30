package Capitulo_5;

public class Ejercicios_array_Visualizar_Array_Orden_Inverso {

	public static void main(String[] args) {
		int array[] = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
        System.out.println();
        
        for (int i = array.length-1; i>=0; i--) {
		System.out.println(array[i] + " ");
		}
	}

}
