package devsagi.semana04.metodos.exercicio01;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        float valorEmReais = 100f, TAXA_DE_CONVERSAO = 0.17f;
        float valorEmDolares = converterMoeda(valorEmReais, TAXA_DE_CONVERSAO);

        System.out.printf("%.2f reais é %.2f dólares", valorEmReais, valorEmDolares);
    }

    public static float converterMoeda(float valorEmReais, float taxaDeConversao) {
        return valorEmReais * taxaDeConversao;
    }
}
