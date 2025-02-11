package devsagi.semana02.condicionais.exercicio01;

import java.util.Scanner;

public class AprovacaoDoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float media;

        System.out.print("Digite a média do aluno: ");
        media = input.nextFloat();
        input.close();

        if (media >= 6){
            System.out.print("Aluno aprovado!");
        } else if (media >= 4 && media < 6) {
            System.out.print("Aluno em recuperação!");
        } else {
            System.out.print("Aluno reprovado!");
        }
    }
}
