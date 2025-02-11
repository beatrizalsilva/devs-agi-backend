package devsagi.semana03.matrizes.exercicio05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3},
                {6, 7},
                {1, 2}
        };

        int[][] b = {
                {6, 1, 9},
                {4, 3, 7}
        };

        if (a[0].length == b.length) {
            int limite = a[0].length;
            int[][] resultado = new int[3][3];

            for (int l = 0; l < resultado.length; l++) {
                for (int c = 0; c < resultado[0].length; c++) {
                    for (int i = 0; i < limite; i++) {
                        resultado[l][c] += a[l][i] * b[i][c];
                    }
                }
            }

            for (int[] linhas : resultado) {
                System.out.println(Arrays.toString(linhas));
            }
        } else {
            System.out.print("Não foi possível fazer a multiplicação!");
        }
    }
}
