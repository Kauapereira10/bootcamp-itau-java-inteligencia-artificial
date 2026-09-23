package exercicios;

import enums.DubladoOrLegendadoEnum;

public class IngressoMeiaEntrada extends Ingresso{


    public IngressoMeiaEntrada(double valor, String nomeFilme, DubladoOrLegendadoEnum dubladoOrLegendadoEnum) {
        super(valor, nomeFilme, dubladoOrLegendadoEnum);
    }

    @Override
    public double getValor() {
        return this.valor / 2;
    }
}
