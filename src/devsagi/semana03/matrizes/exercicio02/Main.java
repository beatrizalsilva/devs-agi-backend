package devsagi.semana03.matrizes.exercicio02;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2,3,4,1},
                {5,6,7,2},
                {8,9,1,3},
                {2,4,6,4}
        };

        int soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            int somaLinha = 0;
            for (int c = 0; c < matriz[l].length; c++) {
                soma += matriz[l][c];
                somaLinha += matriz[l][c];
            }
            System.out.printf("A soma dos elementos da linha %d é %d.%n", l, somaLinha);
        }
            System.out.printf("\nA soma de todos os elementos da matriz é %d.%n", soma);
            System.out.println();

        for (int c = 0; c < matriz[0].length; c++) {
            int somaColuna = 0;
            for (int l = 0; l < matriz.length; l++) {
                somaColuna += matriz[l][c];
            }
            System.out.printf("A soma dos elementos da coluna %d é %d.%n", c, somaColuna);
        }
    }
}
