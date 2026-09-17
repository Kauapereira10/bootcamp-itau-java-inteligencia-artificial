package exemploinstancof;

public class CartaoCredito implements FormaPagamento{

    private String numeroCartao;
    private int parcelas;

    public CartaoCredito(String numeroCartao, int parcelas) {
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }
}
