/**
 captura una matriz de numeros , si los numeros de entrada son positivos guardalos de derecha a izquierda de arriba hacia abajo.. 
 si los numeros son negativos almacenalos de izquierda a derecha
*/

import java.util.Scanner; 
import java.util.Arrays;
class Main {
  public static void main(String[] args) {

    Scanner n = new Scanner(System.in);
    int MAX_ROWS = 3;
    int MAX_COLS = 4;
    int m[][] = new int[MAX_ROWS][MAX_COLS];
    int x1 = 0, y1 = MAX_COLS - 1;
    int x2 = MAX_ROWS - 1, y2 = 0;
    int count = 0;

    // Captura todos los inputs en un arreglo 
    while(count < MAX_ROWS * MAX_COLS) {
      int in = n.nextInt();
      
      if (in >= 0) {
        // Almacena valor
        m[x1][y1] = in;

        // Negativos
        if (y1 > 0) {
          // Decrementa indice de columna
          y1 --;
        } else {
          // Reinicia indice de columna
          y1 = MAX_COLS - 1;
          // Incrementa indice de renglon
          x1 ++;
        }

      } else {
        // Almacena valor
        m[x2][y2] = in;

        // Positivos
        if (y2 < MAX_COLS - 1) {
          // Incrementa indice de columna
          y2 ++;
        } else {
          y2 = 0;
          x2 --;
        }

      }
      count ++;
    }
    // imprime arreglo de captura 
    Main.print2D(m);
  }
  public static void print2D(int mat[][]) 
  { 
    // Loop through all rows 
    for (int i = 0; i < mat.length; i++) {
      // Loop through all elements of current row 
      for (int j = 0; j < mat[i].length; j++) 
        System.out.print(mat[i][j] + " ");

      System.out.println(" ");
    }
  } 
}
