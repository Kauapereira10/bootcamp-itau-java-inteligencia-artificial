package exercicios;

import enums.DubladoOrLegendadoEnum;

public class Ingresso {

    protected double valor;
    protected String nomeFilme;
    protected DubladoOrLegendadoEnum dubladoOrLegendadoEnum;

    public Ingresso(double valor, String nomeFilme, DubladoOrLegendadoEnum dubladoOrLegendadoEnum) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dubladoOrLegendadoEnum = dubladoOrLegendadoEnum;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public DubladoOrLegendadoEnum getDubladoOrLegendadoEnum() {
        return dubladoOrLegendadoEnum;
    }

    public void setDubladoOrLegendadoEnum(DubladoOrLegendadoEnum dubladoOrLegendadoEnum) {
        this.dubladoOrLegendadoEnum = dubladoOrLegendadoEnum;
    }

}
