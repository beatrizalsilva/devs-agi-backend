package devsagi.semana02.condicionais.exercicio03;

import java.util.Scanner;

public class TipoDeInvestimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte opcao;

        System.out.print("Menu de opções: \n1.CDB 2.CDI\n3.Tesouro 4.FII");
        System.out.print("\nDigite a opção desejada: ");
        opcao = input.nextByte();
        input.close();

        switch (opcao) {
            case 1:
                System.out.println("Investimento CDB");
                break;
            case 2:
                System.out.println("Investimento: CDI");
                break;
            case 3:
                System.out.println("Investimento: Tesouro direto");
                break;
            case 4:
                System.out.println("Investimento: FII");
                break;
            default:
                System.out.println("Erro! Insira uma opção válida por favor.");
        }
    }
}
