package exemploinstancof;

public class Pix implements FormaPagamento{

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

}
