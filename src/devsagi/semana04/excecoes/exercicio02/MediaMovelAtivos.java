package devsagi.semana04.excecoes.exercicio02;

public class MediaMovelAtivos {
    public static void main(String[] args) {
        double[] precosDeAcoes = {100.0, 102.0, 101.0, 103.0, 105.0};
        calcularMediaMovel(precosDeAcoes);
    }

    public static void calcularMediaMovel(double[] precos) {
        if (precos.length < 3) {
            throw new IllegalArgumentException("Vetor não pode ter menos 3 valores!");
        }

        try {
            for (int i = 2; i < precos.length; i++) {
                double media = (precos[i] + precos[i - 1] + precos[i - 2]) / 3;
                System.out.println("Média movel ()" +  + media);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor incorreto!");
        }
    }

}
