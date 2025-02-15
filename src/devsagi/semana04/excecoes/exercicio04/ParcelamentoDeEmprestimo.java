package devsagi.semana04.excecoes.exercicio04;

public class ParcelamentoDeEmprestimo {
    public static void main(String[] args) {
        try {
            double resultado = calcularParcelasMensais(10000, 0.06);
            System.out.printf("O valor da parcela mensal é: %.2f%n", resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: O valor do empréstimo deve ser maior que 0.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: A taxa de juros deve ser maior que 0.");
        }
    }

    public static double calcularParcelasMensais(double valorDoEmprestimo, double taxaDeJurosMensal) {
        if (valorDoEmprestimo <= 0) {
            throw new ArithmeticException();
        }

        if (taxaDeJurosMensal <= 0) {
            throw new IllegalArgumentException();
        }

        int meses = 12;
        return (valorDoEmprestimo * taxaDeJurosMensal) / (1 - Math.pow((1 + taxaDeJurosMensal), -meses));
    }
}
