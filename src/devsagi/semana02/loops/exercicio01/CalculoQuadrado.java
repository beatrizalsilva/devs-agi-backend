package devsagi.semana02.loops.exercicio01;

import java.util.Scanner;

public class CalculoQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0, impar = 1;

        System.out.print("Digite um número inteiro positivo: ");
        numero = input.nextInt();
        input.close();

        if (numero <= 0){
            System.out.println("Digite um número positivo, por favor!");
            return;
        }

        // Soma dos números ímpares consecutivos
        for (int num = 0; num < numero; num++) {
            soma += impar;
            impar +=2;
        }

        System.out.printf("O quadrado de %d é %d.", numero, soma);
    }
}
