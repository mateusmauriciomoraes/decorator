public class PagamentoBase implements Pagamento {

    private double valor;

    public PagamentoBase(){
    }

    public PagamentoBase(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public String getEstrutura(){
        return "Pagamento Base";
    }
}
