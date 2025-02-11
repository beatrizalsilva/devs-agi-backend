package devsagi.semana03.vetores.exercicio03;

import java.util.Scanner;

public class FechamentoDeAcao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] precos = new float[10];
        float maiorValor, menorValor;

        for (int dia = 0; dia < precos.length; dia++) {
            System.out.printf("Digite o preço de fechamento de uma ação nos dias %d: ", dia + 1);
            precos[dia] = input.nextFloat();
        }
        input.close();

        maiorValor = precos[0];
        menorValor = precos[0];

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > maiorValor) {
                maiorValor = precos[i];
            }
            if (precos[i] < menorValor) {
                menorValor = precos[i];
            }
        }

        System.out.printf("\nMaior preço registrado: %.2f\n", maiorValor);
        System.out.printf("Menor preço registrado: %.2f\n", menorValor);
    }
}
