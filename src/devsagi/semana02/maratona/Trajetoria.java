package devsagi.semana02.maratona;

import java.util.Scanner;

public class Trajetoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double anguloGraus, velocidade, x, y, t = 0.01, g = 9.81, anguloRadianos;

        System.out.print("Digite a velocidade inicial (m/s): ");
        velocidade = input.nextDouble();
        System.out.print("Digite o ângulo de inclinação (graus): ");
        anguloGraus = input.nextDouble();
        input.close();

        anguloRadianos = Math.toRadians(anguloGraus);

        do {
            x = velocidade * Math.cos(anguloRadianos) * t;
            y = (velocidade * Math.sin(anguloRadianos) * t) - (0.5 * g * t * t);
            t += 0.01;

            System.out.printf("(x = %.2f, y =%.2f)\n", x, y);
        } while (y >= 0);
    }
}
