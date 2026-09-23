package exercicios;

import enums.DubladoOrLegendadoEnum;

public class IngressoFamilia extends Ingresso{

    private int qtdPessoas;
    private final static double DESCONTO_DE_5_PORCENTO = 0.05;

    public IngressoFamilia(double valor, String nomeFilme, DubladoOrLegendadoEnum dubladoOrLegendadoEnum, int qtdPessoas) {
        super(valor, nomeFilme, dubladoOrLegendadoEnum);
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double getValor() {
        double total = this.valor * this.qtdPessoas;
        if (this.qtdPessoas > 3) {
            total = total * 0.95;
        }

        return total;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
}
