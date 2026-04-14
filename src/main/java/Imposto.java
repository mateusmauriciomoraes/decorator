public class Imposto extends PagamentoDecorator{
    public Imposto(Pagamento pagamento) {
        super(pagamento);
    }

    public double getPercentualPagamento() {
        return 5;
    }

    public String getNomeEstrutura() {
        return "Imposto";
    }
}
