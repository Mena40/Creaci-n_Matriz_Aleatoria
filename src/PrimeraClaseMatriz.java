import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PrimeraClaseMatriz {
    //crear un matriz nxn con números aleatorias y luego se debe sumar las diagonales
    public static void main(String[] args) {
//declaración de variables, arrays
        int fila = 4;
        int columna = 4;
        int[][] matrizDiagonal = new int[fila][columna];
        int sumatoriaDiagonal1 = 0;
        int sumatoriaDiagonal2 = 0;
        int validacion = 0;
        ArrayList guardarprimeradiagonal = new ArrayList<Integer>();
        ArrayList guardarsegundadiagonal = new ArrayList<Integer>();

        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
/*
la matriz es completada con números aleatorios desde el número 1 hasta el 12.
el +1 es para que no nos muestre el 0
Math.random() * Max)+ Min
 */
                matrizDiagonal[i][j] = ((int) (Math.random() * 12) + 1);

                System.out.print(matrizDiagonal[i][j] + " ");//impresión de matriz
                validacion = i + j;
                // se espera que el resultado sea el valor total de índices

                if (i == j) {//sumatoria de diagonal izquierda-derecha cuando los indices son iguales
                    sumatoriaDiagonal1 += matrizDiagonal[i][j];
                    //lo utilizo para guardar los datos de la primera diagonal y luego mostrarlos
                    guardarprimeradiagonal.add(matrizDiagonal[i][j]);
                }
                if (validacion == (fila - 1)) {
                    /*sumatoria de la otra diagonal cuando los índices nos da un resultado
                    igual a la cantidad de filas
                    */

                    sumatoriaDiagonal2 += matrizDiagonal[(i)][j];
                    //lo utilizo para guardar los datos de la segunda diagonal
                    guardarsegundadiagonal.add(matrizDiagonal[(i)][j]);
                }
            }
            System.out.println();
        }

        System.out.println("             ");
        System.out.println("cuando son iguales los indices" + guardarprimeradiagonal);
        System.out.println("la otra diagonal" + guardarsegundadiagonal);
        System.out.println("Diagonal Izquierda derecha Arriba abajo " + sumatoriaDiagonal1);
        System.out.println("Diagonal izquierda derecha abajo arriba " + sumatoriaDiagonal2);

    }
}
/* otra forma de realizar una matriz

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<int[]> lista = new ArrayList<int[]>();
        for (int i = 0; i < matriz.length; i++) {
            lista.add(matriz[i]);
        }
        for (int[] fila : lista) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
        }
    }
*/
