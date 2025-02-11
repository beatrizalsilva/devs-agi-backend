package devsagi.semana02.condicionais.exercicio04;

import java.util.Scanner;

public class PesquisaDeSatisfacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte opcao;

        System.out.print("Pesquisa de Satisfação! Escolha uma das opções apresentadas:");
        System.out.println("\n0.Péssimo 1.Muito ruim 2.Ruim \n3.Regular 4.Bom 5.Ótimo");
        System.out.print("Digite a opção desejada: ");
        opcao = input.nextByte();
        input.close();

        switch (opcao) {
            case 0:
                System.out.println("Sentimos muito, trabalharemos para melhorar nossos serviços.");
                break;
            case 1:
                System.out.println("Poxa! Vamos revisar nossos serviços e melhorar o que for preciso.");
                break;
            case 2:
                System.out.println("Obrigada pelo seu feedback! Vamos trabalhar para corrigir os pontos negativos.");
                break;
            case 3:
                System.out.println("Agradecemos sua opinião! Vamos buscar maneiras de tornar nossa experiência mais agradável.");
                break;
            case 4:
                System.out.println("Que bom que gostou! Continuaremos nos esforçando para melhorar nossos atendimentos.");
                break;
            case 5:
                System.out.println("Maravilha! Ficamos felizes em saber que você teve uma ótima experiência!");
                break;
            default:
                System.out.println("Insira uma opção válida.");
        }
    }
}
