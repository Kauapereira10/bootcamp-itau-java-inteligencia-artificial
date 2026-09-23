package teste;

import enums.DubladoOrLegendadoEnum;
import exercicios.Ingresso;
import exercicios.IngressoFamilia;
import exercicios.IngressoMeiaEntrada;

public class TesteIngresso {

    public static void main(String[] args) {

        Ingresso meiaEntrada = new IngressoMeiaEntrada(50, "Homem-Aranha", DubladoOrLegendadoEnum.DUBLADO);

        System.out.println("===== Meia Entrada =====");
        System.out.println(meiaEntrada.getNomeFilme());
        System.out.println(meiaEntrada.getValor());
        System.out.println(meiaEntrada.getDubladoOrLegendadoEnum());

        Ingresso familia = new IngressoFamilia(42.50, "Doutor Estranho", DubladoOrLegendadoEnum.LEGENDADO, 6);

        System.out.println("===== Ingresso Familia =====");
        System.out.println(familia.getNomeFilme());
        System.out.println(familia.getValor());
        System.out.println(familia.getDubladoOrLegendadoEnum());

    }

}
