package Capitulo_6;

public class Ejercicios_matriz_Tarea01 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {{10, 20, 30}, 
			                          {40, 50, 60}, 	
			                          {70, 80, 90}};
muestraMatriz(matriz);
sonElementosNuloDebajoDiagonal(matriz);
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
	
	/**
	 * 
	 * @param matriz
	 */
	
	public static void sonElementosNuloDebajoDiagonal (int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(j < i && j < 0) {
}					
}
}
}
}



