package pratica.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //ex01();
        ex02();
    }

    public static void ex01() {
        Scanner input = new Scanner(System.in);

        int numero = 0;
        do {
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (numero != 1234) {
                System.out.println("\nSenha incorreta. Tente novamente.");
            }
        } while (numero != 1234);
        input.close();
    }

    public static void ex02() {
        Scanner input = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (numero % 2 == 0) {
                System.out.println("\nNúmero par digitado!");
            } else {
                System.out.println("\nNúmero ímpar! Tente novamente.");
            }
        } while (numero / 2 != 0);

        input.close();
    }
}
