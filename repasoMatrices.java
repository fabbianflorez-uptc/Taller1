//---------------------------------------//
//--FABIAN LEONARDO FLOREZ GONZALEZ------//
//---CODIGO 202614060--------------------//
//---------------------------------:D----//
package repasoMatrices;

public class repasoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("  +++ punto 1: la matriz en espiral +++ \n");
		//1. llenar una matriz 5x5 en espiral (caracol) con números del 1 al 25 e imprimirla
		
		int[][]  matriz_caracol = new int[5][5];
		int  num = 1; 
		int fila_inicio = 0;
		int fila_fin = 4;
		int col_inicio = 0;
		int col_fin = 4;
		
		while(num <= 25) {
			// de izquierda a derecha
			for(int i = col_inicio; i <= col_fin; i++) {
				matriz_caracol[fila_inicio][i] = num++;
			}
			fila_inicio++;
			
			// de arriba pa abajo
			for(int i = fila_inicio; i <= fila_fin; i++) {
				matriz_caracol[i][col_fin] = num++;
			}
			col_fin--;
			
			// de derecha a izq
			for(int i = col_fin; i >= col_inicio; i--) {
				matriz_caracol[fila_fin][i] = num++;
			}
			fila_fin--;
			
			// de abajo pa arriba
			for(int i = fila_fin; i >= fila_inicio; i--) {
				matriz_caracol[i][col_inicio] = num++;
			}
			col_inicio++;
		}
		
		// aca imprimo la matriz
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matriz_caracol[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n  -~-~ punto 4 ~-~-  ");
		//4. dada una matriz cuadrada imprimir la suma de cada fila y de cada columna
		for(int  i = 0; i < 5; i++) {
			int sum_fila = 0;
			int sum_columna = 0;
			for(int j = 0; j < 5; j++) {
				sum_fila += matriz_caracol[i][j];
				sum_columna += matriz_caracol[j][i];
			}
			System.out.println("fila " + i + " suma " + sum_fila + " | y la columna " + i + " da " + sum_columna);
		}

	}

}
