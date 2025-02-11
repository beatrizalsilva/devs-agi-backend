package devsagi.semana02.loops.exercicio02;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, expoente, potencia;

        System.out.print("Digite a base (X): ");
        base = input.nextInt();
        System.out.print("Digite o expoente (Y): ");
        expoente = input.nextInt();
        input.close();

        // Qualquer número elevado a 0 é 1
        potencia = 1;

        for (int mult = 0; mult < expoente; mult++) {
            potencia *= base;
        }

        System.out.printf("%d elevado a %d é igual a %d", base, expoente, potencia);
    }
}
