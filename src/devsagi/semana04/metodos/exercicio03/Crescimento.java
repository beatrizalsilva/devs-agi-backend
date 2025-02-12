package devsagi.semana04.metodos.exercicio03;

public class Crescimento {
    public static void main(String[] args) {
        float precoInicial = 100f;
        float precoFinal = 105f;

        float crescimentoPercentual = calcularCrescimento(precoInicial, precoFinal);
        System.out.printf("Crescimento de: %.2f%%%n", crescimentoPercentual);
    }

    public static float calcularCrescimento(float precoInicial, float precoFinal) {
        return (precoFinal - precoInicial) / precoInicial * 100;
    }
}
