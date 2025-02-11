package devsagi.semana03.matrizes.exercicio01;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }
}
