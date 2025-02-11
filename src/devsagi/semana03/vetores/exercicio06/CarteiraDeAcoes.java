package devsagi.semana03.vetores.exercicio06;

public class CarteiraDeAcoes {
    public static void main(String[] args) {
        int[] acoes = new int[]{5000, 3000, 7000, 4000, 6000};
        double total = 0;
        double percentual;

        for (int acoe : acoes) {
            total += acoe;
        }
        System.out.printf("Total investido: R$ %.2f.00\n", total);

        System.out.println("Percentual de cada ação:");
        for (int i = 0; i < acoes.length; i++) {
            percentual = (acoes[i] / total) * 100;
            System.out.printf("Ação %d: %.2f%%\n", i + 1, percentual);
        }
    }
}
