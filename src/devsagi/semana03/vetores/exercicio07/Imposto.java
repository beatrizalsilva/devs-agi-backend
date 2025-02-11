package devsagi.semana03.vetores.exercicio07;

public class Imposto {
    public static void main(String[] args) {
        double[] compra = {10000, 8000, 12000, 7000, 15000};
        double[] venda = {31000, 8500, 14000, 7200, 18000}; // testando com 31000 para ser taxado
        double[] lucroParcial = new double[5];
        double lucroTotal = 0, TAXA_IR = 0.15, impostoAplicado, lucroLiquido = 0;

        for (int i = 0; i < compra.length; i++) {
            lucroParcial[i] = venda[i] - compra[i];
            lucroTotal += lucroParcial[i];
        }
        System.out.printf("Lucro total: R$ %.2f ", lucroTotal);

        if (lucroTotal > 20000) {
            impostoAplicado = (lucroTotal - 20000) * TAXA_IR;
            lucroLiquido = lucroTotal - impostoAplicado;
            System.out.printf("\nValor do imposto: R$ %.2f \nLucro liquido: R$ %.2f", impostoAplicado, lucroLiquido);
        } else {
            System.out.print("\nSem incidência de imposto.");
        }
    }
}
