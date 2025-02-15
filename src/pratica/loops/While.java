package pratica.loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //ex1();
        ex02();
    }

    public static void ex1() {
        // faça uma contagem regressiva até 0
        int numero = 10;

        System.out.print("Contagem regressiva: ");
        while (numero > 0) {
            System.out.print(numero + " ");
            numero--;
        };
    }

    public static void ex02() {
        // crie um programa que peça um número ao usuário e continue pedindo até que o número seja maior que 10
        Scanner input = new Scanner(System.in);

        int numero = 0;
        while (numero <= 10) {
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (numero > 10) {
                System.out.printf("\nO número %d é maior que 10", numero);
            } else {
                System.out.println("\nNúmero inválido, tente novamente.");
            }
        }
        input.close();
    }
}
