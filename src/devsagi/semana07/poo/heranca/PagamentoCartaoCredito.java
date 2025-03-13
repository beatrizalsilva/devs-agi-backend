package devsagi.semana07.poo.heranca;

public class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$ " + valor + " no cartão de número " + numeroCartao);
    }

    @Override
    public void processarPagamento(double valor, int parcelas) {
        System.out.println("Processando pagamento de R$ " + valor + " no cartão de número " + numeroCartao + " em " + parcelas + " parcelas");
    }
}