package Capitulo_6;

public class Ejercicios_matriz_Ejemplo02 {

	public static void main(String[] args) {
		// Declaración de una matriz de 3 x 3
				int matriz[][] = new int[3][3];

				inicializaMatriz(matriz);
				muestraMatriz(matriz);
			}

			/**
			 * 
			 * @param matriz
			 */
			public static void inicializaMatriz (int matriz[][]) {
				// Inicializar los valores dentro de la matriz
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						matriz[i][j] = (int) Math.round(Math.random() * 100);
			}
			}		
			}
			
			/**
			 * 
			 * @param matriz
			 */
			public static void muestraMatriz (int matriz[][]) {
				// Visualizar los elementos de la matriz en la consola
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						System.out.print(matriz[i][j] + " ");
			}
					System.out.println();
			}
			}
		    }
