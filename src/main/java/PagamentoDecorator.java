public abstract class PagamentoDecorator implements Pagamento {
    private Pagamento pagamento;
    public String estrutura;

    public PagamentoDecorator(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public abstract  double getPercentualPagamento();

    public double getValor() {
        return this.pagamento.getValor() * (1 + (this.getPercentualPagamento() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.pagamento.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
