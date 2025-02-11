package devsagi.semana03.matrizes.exercicio04;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 3, 4},
                {5, 6, 7}
        };

        for (int c=0; c<matriz[0].length; c++) {
            for (int l=0; l<matriz.length; l++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }
}
