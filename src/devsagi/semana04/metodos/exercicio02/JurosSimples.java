package devsagi.semana04.metodos.exercicio02;

public class JurosSimples {
    public static void main(String[] args) {
        float capital = 1000f;
        final float TAXA_DE_JUROS_ANUAL = 0.05f;
        int tempo = 3;

        float montanteFinal = calcularJurosSimples(capital, TAXA_DE_JUROS_ANUAL, tempo);
        System.out.printf("Montante final: %.2f", montanteFinal);
    }

    public static float calcularJurosSimples(float capital, float taxaDeJurosAnual, int tempo) {
        float juros = capital * taxaDeJurosAnual * tempo;
        return capital + juros;
    }
}
