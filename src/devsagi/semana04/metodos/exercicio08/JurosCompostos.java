package devsagi.semana04.metodos.exercicio08;

public class JurosCompostos {
    public static void main(String[] args) {
        double capital = 1000.0;
        double taxa = 0.02;
        int meses = 12;

        double resultado = calcularJurosCompostos(capital, taxa, meses);
        System.out.printf("Montante final: %.2f", resultado);
    }

    public static double calcularJurosCompostos(double capital, double taxa, int meses) {
        return capital * Math.pow((1 + taxa), meses);
    }

}
