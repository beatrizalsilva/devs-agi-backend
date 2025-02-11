package devsagi.semana03.matrizes.exercicio07;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {9,8,76,6},
                {19,2,36,4},
                {53,4,38,2},
                {5,61,6,87}
        };
        int somaPrimaria = 0, somaSegundaria = 0;

        for (int l = 0; l < matriz.length; l++) {
            somaPrimaria += matriz[l][l];
            somaSegundaria += matriz[l][matriz.length - 1 - l];
        }
        System.out.printf("Soma da diagonal principal: %d", somaPrimaria);
        System.out.printf("\nSoma da diagonal secundária: %d", somaSegundaria);
    }
}
