package devsagi.semana03.vetores.exercicio04;

public class VariacaoPercentual {
    public static void main(String[] args) {
        double[] precos = {100.0, 101.5, 99.0, 102.0, 105.0};

        System.out.println("Variação percentual diária:");
        for (int dia = 1; dia < precos.length; dia++) {
            double variacao = ((precos[dia] - precos[dia - 1]) / precos[dia - 1]) * 100;
            System.out.printf("Dia %d para Dia %d: %.2f%%\n", dia, dia + 1, variacao);
        }
    }
}
