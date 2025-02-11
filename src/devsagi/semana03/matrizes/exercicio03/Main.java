package devsagi.semana03.matrizes.exercicio03;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Diagonal principal: ");
        for (int l=0; l<matriz.length; l++) {
            System.out.print(matriz[l][l] + " ");
        }
    }
}
