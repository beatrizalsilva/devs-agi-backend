package devsagi.semana04.metodos.exercicio07;

public class Carteira {
    public static void main(String[] args) {
        double[] carteira = {1000.0, 2000.0, 1500.0};
        double[] retornos = {0.05, 0.03, 0.04};

        double resultado = simularCarteira(carteira, retornos);
        System.out.printf("Valor final da carteira: %.2f", resultado);
    }

    public static double simularCarteira(double[] carteira, double[] retornos) {
        double valorFinal = 0;
        for (int i = 0; i < carteira.length; i++) {
            valorFinal += carteira[i] * (1 + retornos[i]);
        }
        return valorFinal;
    }
}
