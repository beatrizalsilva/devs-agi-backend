package devsagi.semana04.metodos.exercicio05;

public class Ativos {
    public class Main {
        public static void main(String[] args) {
            float retornoAtivo1 = 0.05f;
            float retornoAtivo2 = 0.045f;

            float maiorRetorno = compararAtivos(retornoAtivo1, retornoAtivo2);
            System.out.printf("O ativo com o maior retorno é: %.2f%%", maiorRetorno * 100);
        }

        public static float compararAtivos(float retornoAtivo1, float retornoAtivo2) {
            if (retornoAtivo1 > retornoAtivo2) {
                return retornoAtivo1;
            } else {
                return retornoAtivo2;
            }
        }
    }
}
