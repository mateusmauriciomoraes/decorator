import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {
    @Test
    void deveRetornarValorPagamento(){
        Pagamento pagamento = new PagamentoBase(100.0d);

        assertEquals(100.0d, pagamento.getValor());
    }

    @Test
    void deveRetornarValorPagamentoComTaxa(){
        Pagamento pagamento = new Taxa(new PagamentoBase(100.0d));

        assertEquals(110.0d, pagamento.getValor(), 0.01);
    }

    @Test
    void deveRetornarValorPagamentoComTaxaMaisDesconto(){
        Pagamento pagamento = new Desconto(new Taxa(new PagamentoBase(100.0d)));

        assertEquals(99.0d, pagamento.getValor(), 0.01);
    }

    @Test
    void deveRetornarValorPagamentoComTaxaMaisImposto(){
        Pagamento pagamento = new Imposto(new Taxa(new PagamentoBase(100.0d)));

        assertEquals(115.5d, pagamento.getValor(), 0.01);
    }

    @Test
    void deveRetornarValorPagamentoComTaxaMaisImpostoMaisDesconto(){
        Pagamento pagamento = new Desconto(new Imposto(new Taxa(new PagamentoBase(100.0d))));

        assertEquals(103.95d, pagamento.getValor(), 0.01);
    }

    @Test
    void deveRetornarValorPagamentoComDesconto(){
        Pagamento pagamento = new Desconto(new PagamentoBase(100.0d));

        assertEquals(90.0d, pagamento.getValor(), 0.01);
    }

    @Test
    void deveRetornarValorPagamentoComDescontoMaisImposto(){
        Pagamento pagamento = new Imposto(new Desconto(new PagamentoBase(100.0d)));

        assertEquals(94.5d, pagamento.getValor(), 0.01);
    }

    @Test
    void deveRetornarValorPagamentoComImposto(){
        Pagamento pagamento = new Imposto(new PagamentoBase(100.0d));

        assertEquals(105.0d, pagamento.getValor(), 0.01);
    }

    @Test
    void deveRetornarEstruturaPagamento(){
        Pagamento pagamento = new PagamentoBase();

        assertEquals("Pagamento Base", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComTaxa(){
        Pagamento pagamento = new Taxa(new PagamentoBase());

        assertEquals("Pagamento Base/Taxa", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComTaxaMaisDesconto(){
        Pagamento pagamento = new Desconto(new Taxa(new PagamentoBase()));

        assertEquals("Pagamento Base/Taxa/Desconto", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComTaxaMaisImposto(){
        Pagamento pagamento = new Imposto(new Taxa(new PagamentoBase()));

        assertEquals("Pagamento Base/Taxa/Imposto", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComTaxaMaisImpostoMaisDesconto(){
        Pagamento pagamento = new Desconto(new Imposto(new Taxa(new PagamentoBase())));

        assertEquals("Pagamento Base/Taxa/Imposto/Desconto", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComDesconto(){
        Pagamento pagamento = new Desconto(new PagamentoBase());

        assertEquals("Pagamento Base/Desconto", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComDescontoMaisImposto(){
        Pagamento pagamento = new Imposto(new Desconto(new PagamentoBase()));

        assertEquals("Pagamento Base/Desconto/Imposto", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComImposto(){
        Pagamento pagamento = new Imposto(new PagamentoBase());

        assertEquals("Pagamento Base/Imposto", pagamento.getEstrutura());
    }
}
