package teste;

import exercicios.BRLClock;
import exercicios.Clock;
import exercicios.USClock;

public class TesteClock {

    public static void main(String[] args) {

        Clock br = new BRLClock();
        br.setSecond(0);
        br.setMinute(0);
        br.setHour(20);

        System.out.println(br.getTime());

        System.out.println("=============");

        Clock us = new USClock();
        us.setSecond(32);
        us.setMinute(0);
        us.setHour(2);

        System.out.println(us.getTime());

    }
}
