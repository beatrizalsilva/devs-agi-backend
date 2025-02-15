package devsagi.semana04.excecoes.exercicio03;

public class PlanilhaDeRisco {
    public static void main(String[] args) {
        double[][] matrizRiscos = {
                {0.2, 0.5, 1.0, 0.4, 0.3},
                {0.7, 0.9, 0.1, 0.6, 0.8},
                {0.1, 1.0, 0.2, 0.7, 0.5},
                {0.0, 0.2, 1.1, 0.4, 0.3}, // 1.1 é inválido
                {0.3, 0.4, 0.1, 0.5, 0.8}
        };

        try {
            validarPlanilha(matrizRiscos);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: A matriz não é 5x5. Verifique as dimensões.");
        }
    }

    public static void validarPlanilha(double[][] matriz) {
        double valor;

        for (int l = 0; l < matriz.length; l++) {
            if (matriz[l].length != 5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            for (int c = 0; c < matriz[l].length; c++) {
                valor = matriz[l][c];
                if (valor < 0 || valor > 1) {
                    System.out.println("Valor inválido encontrado na célula [" + l + "][" + c + "]: " + valor);
                }
            }
        }
    }
}