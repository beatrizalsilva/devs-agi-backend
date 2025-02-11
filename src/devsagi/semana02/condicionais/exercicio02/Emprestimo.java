package devsagi.semana02.condicionais.exercicio02;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float emprestimoDesejado, saldoMedio;

        System.out.print("Digite o saldo médio dos últimos 12 meses: ");
        saldoMedio = input.nextFloat();
        System.out.print("Digite o valor do empréstimo desejado: ");
        emprestimoDesejado = input.nextFloat();
        input.close();

        // Regra: empréstimo deve ser ≤ 40% do saldo médio
        float limiteEmprestimo = saldoMedio * 0.4f;

        if (emprestimoDesejado <= limiteEmprestimo) {
            System.out.printf("Empréstimo aprovado! Você pode solicitar até R$ %.2f", limiteEmprestimo);
        } else {
            System.out.printf("Empréstimo recusado! O valor máximo permitido é R$ %.2f", limiteEmprestimo);
        }
    }
}
