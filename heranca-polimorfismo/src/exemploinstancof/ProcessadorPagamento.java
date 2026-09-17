package exemploinstancof;

public class ProcessadorPagamento {

    public static void processar(FormaPagamento forma) {

        if (forma instanceof Pix p) {
            System.out.println("Processando PIX para a chave: " + p.getChavePix());
        } else if (forma instanceof CartaoCredito credito) {
            System.out.println("Processando Catão em " + credito.getParcelas() + "x");
        } else {
            System.out.println("Forma de pagamento não reconhecida.");
        }
    }

    public static void main(String[] args) {
        FormaPagamento pix = new Pix("333.444.555-00");
        FormaPagamento cartao = new CartaoCredito("1234-5678-9012-3456", 3);

        processar(pix);
        processar(cartao);

        System.out.println(pix instanceof FormaPagamento);
        System.out.println(cartao instanceof FormaPagamento);
    }
}
