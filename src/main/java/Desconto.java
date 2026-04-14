public class Desconto extends PagamentoDecorator{
    public Desconto(Pagamento pagamento) {
        super(pagamento);
    }

    public double getPercentualPagamento() {
        return -10;
    }

    public String getNomeEstrutura() {
        return "Desconto";
    }
}
