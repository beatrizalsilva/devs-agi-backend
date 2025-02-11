package devsagi.semana03.vetores.exercicio05;

import java.util.Scanner;

public class AltaEQueda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] precos = new int[10];
        int diasDeAlta = 0, diasDeBaixa = 0;

        for (int dia = 0; dia < precos.length; dia++) {
            System.out.printf("Digite o preço da ação do dia %d: ", dia + 1);
            precos[dia] = input.nextInt();
        }
        input.close();

        for (int dia = 1; dia < precos.length; dia++) {
            if (precos[dia] > precos[dia - 1]) {
                diasDeAlta++;
            } else {
                diasDeBaixa++;
            }
        }

        System.out.printf("Dias de alta: %d\n", diasDeAlta);
        System.out.printf("Dias de baixa: %d\n", diasDeBaixa);
    }
}
