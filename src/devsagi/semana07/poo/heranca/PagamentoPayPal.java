package devsagi.semana07.poo.heranca;

public class PagamentoPayPal extends Pagamento {
    private String email;

    public PagamentoPayPal(double valor, String email) {
        super(valor);
        this.email = email;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal no email " + email);
    }
}