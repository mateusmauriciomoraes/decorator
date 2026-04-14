public class Taxa extends PagamentoDecorator{
    public Taxa(Pagamento pagamento) {
        super(pagamento);
    }

    public double getPercentualPagamento() {
        return 10;
    }

    public String getNomeEstrutura() {
        return "Taxa";
    }
}
