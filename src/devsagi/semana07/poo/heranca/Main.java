package devsagi.semana07.poo.heranca;

public class Main {
    public static void main(String[] args) {
        Pagamento viaCartao = new PagamentoCartaoCredito(370.90, "666-888-777-00");
        viaCartao.processarPagamento();

        Pagamento viaPayPal = new PagamentoPayPal(160.98, "usuario@paypal.com");
        viaPayPal.processarPagamento();

        Pagamento viaCartaoParcelado = new PagamentoCartaoCredito(100, "33-444-444-77");
        viaCartaoParcelado.processarPagamento(100, 2);
    }
}