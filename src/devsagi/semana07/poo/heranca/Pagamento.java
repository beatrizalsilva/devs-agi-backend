package devsagi.semana07.poo.heranca;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento génerico de R$ " + valor);
    }

    public void processarPagamento(double valor, int parcelas) {
        System.out.println("Processando pagamento de R$ " + valor + " em " + parcelas + " parcelas");
    }
}