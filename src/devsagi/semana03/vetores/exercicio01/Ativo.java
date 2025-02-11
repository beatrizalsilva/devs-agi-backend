package devsagi.semana03.vetores.exercicio01;

import java.util.Scanner;

public class Ativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] precos = new double[5];
        double crescimentoAcumulado, crescimentoPercentual;

        for (int dia = 0; dia < precos.length; dia++) {
            System.out.printf("Digite o preço do valor do ativo do dia %d: ", dia + 1);
            precos[dia] = input.nextDouble();
        }
        input.close();

        crescimentoAcumulado = 1.0;
        for (int i = 1; i < precos.length; i++) {
            crescimentoAcumulado *= (1 + (precos[i] - precos[i - 1]) / precos[i - 1]);
        }

        crescimentoPercentual = (crescimentoAcumulado - 1) * 100;
        System.out.printf("\nCrescimento percentual acumulado em 5 dias: %.2f%%", crescimentoPercentual);
    }
}
