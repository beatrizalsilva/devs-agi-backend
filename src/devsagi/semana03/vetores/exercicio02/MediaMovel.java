package devsagi.semana03.vetores.exercicio02;

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] precos = new float[7];
        float media;

        for (int dia = 0; dia < precos.length; dia++) {
            System.out.printf("Digite o valor do ativo do dia %d: ", dia + 1);
            precos[dia] = input.nextFloat();
        }
        input.close();

        // Calcular média dos ultimos 3
        media = (precos[4] + precos[5] + precos[6]) / 3;

        System.out.printf("Media dos últimos 3 dias: %.2f", media);
    }
}
