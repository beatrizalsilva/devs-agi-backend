package devsagi.semana03.matrizes.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int[][] matriz = {
                {5, 7, 9},
                {2, 4, 6}
        };

        System.out.print("Digite o número que deseja consultar na matriz 2x3: ");
        numero = input.nextInt();
        input.close();

        for (int l=0; l<matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] == numero) {
                    System.out.println("Número " + numero + " encontrado na posição: (Linha" + l + ", coluna " + c + ")");
                    return;
                }
            }
        }
        System.out.println("O número informado não pertence a matriz.");
    }
}
