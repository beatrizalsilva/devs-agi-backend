package devsagi.semana04.metodos.exercicio06;

public class DesvioPadrao {
    public static void main(String[] args) {
        double[] acoes = {0.01f, 0.02f, -0.01f, 0.03f, -0.02f};
        double resultado = calcularVolatilidade(acoes);

        System.out.printf("Volatilidade: %.4f", resultado);
    }

    public static double calcularMedia(double[] acoes) {
        double soma = 0;
        for (int i = 0; i < acoes.length; i++) {
            soma += acoes[i];
        }
        return soma / acoes.length;
    }

    public static double calcularVolatilidade(double[] acoes) {
        // calcula desvio padrão
        double somaDosQuadrado = 0, desvioPadrao;
        for (int i = 0; i < acoes.length; i++) {
            double diferenca = acoes[i] - calcularMedia(acoes);
            somaDosQuadrado += Math.pow(diferenca,2);
        }
        desvioPadrao = somaDosQuadrado / acoes.length;
        return Math.sqrt(desvioPadrao);
    }
}
