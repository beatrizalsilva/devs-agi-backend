package devsagi.semana04.excecoes.exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorDeSaldos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int indiceUsuario;
        double[] saldos = new double[]{3000.0, 2300.9, 1000, 789.99, 1500.60, 490, 2300.90, 100, 5780, 330.90};

        try {
            System.out.print("Digite um número de 1 a 10 para consultar o saldo: ");
            indiceUsuario = input.nextInt();

            double saldo = saldos[indiceUsuario - 1];
            System.out.println("O saldo da conta " + indiceUsuario + " é: R$ " + saldo);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Erro: Conta não encontrada!");
        } catch (InputMismatchException e) {
            System.out.print("Erro: Entrada inválida. Por favor, digite um número inteiro.");
        } finally {
            input.close();
        }
    }
}
