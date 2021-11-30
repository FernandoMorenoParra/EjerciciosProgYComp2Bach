package Capitulo_5;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Ejercicios_array_Azar_Numeros_Entre_Menos100_Y_100 {

	public static void main(String[] args) {
		int array[] = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
			
		}
        for (int i = 0; i < array.length; i++) {
        	System.out.println(array[i] + " ");		
		}
        
        for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
			}
		System.out.println();
		System.out.println(array[i] + " ");
        }
	
	}

}
