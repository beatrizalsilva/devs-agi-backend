package devsagi.semana04.metodos.exercicio09;

public class Correlacao {
    public static void main(String[] args) {
        double[] amostra1 = {100.0, 102.0, 104.0, 106.0};
        double[] amostra2 = {50.0, 51.0, 52.0, 53.0};

        double resultado = calcularCorrelacao(amostra1, amostra2);
        System.out.println("Correlação: " + resultado);
    }

    public static double calcularCorrelacao(double[] conjuntoX, double[] conjuntoY) {
        double desvioPadraoX = calcularDesvioPadrao(conjuntoX);
        double desvioPadraoY = calcularDesvioPadrao(conjuntoY);
        double covarianciaXY = calcularCovariancia(conjuntoX, conjuntoY);

        return covarianciaXY / (desvioPadraoX * desvioPadraoY);
    }

    public static double calcularCovariancia(double[] conjuntoX, double[] conjuntoY) {
        double somaDosProdutos = 0, diferencaX, diferencaY;
        double mediaX = calcularMedia(conjuntoX), mediaY = calcularMedia(conjuntoY);
        for (int i = 0; i < conjuntoX.length; i++) {
            diferencaX = conjuntoX[i] - mediaX;
            diferencaY = conjuntoY[i] - mediaY;
            somaDosProdutos += diferencaX * diferencaY;
        }
        return somaDosProdutos / conjuntoX.length;
    }

    public static double calcularDesvioPadrao(double[] valores) {
        double somaDosQuadrado = 0, diferenca, desvioPadrao, media = calcularMedia(valores);
        for (int i = 0; i < valores.length; i++) {
            diferenca = valores[i] - media;
            somaDosQuadrado += Math.pow(diferenca,2);
        }
        desvioPadrao = somaDosQuadrado / valores.length;
        return Math.sqrt(desvioPadrao);
    }

    public static double calcularMedia(double[] valores) {
        double somaValores = 0;
        for (int i = 0; i < valores.length; i++) {
            somaValores += valores[i];
        }

        return somaValores / valores.length;
    }
}
