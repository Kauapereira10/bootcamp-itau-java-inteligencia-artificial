package exercicios;

import entidade.Car;
import entidade.enums.CarEnum;

public class TesteCar {

    public static void main(String[] args) {
        System.out.println("=== CRIANDO O CARRO ===");
        Car meuCarro = new Car("Toyota", "Corolla");

        meuCarro.verificarVelocidade();

        System.out.println("\n=== TESTANDO ERROS DE ESTADO (CARRO DESLIGADO) ===");
        meuCarro.acelerar(); // Deve falhar: carro desligado
        meuCarro.trocarMarcha(1); // Deve falhar: carro desligado
        meuCarro.virar(CarEnum.DIREITA); // Deve falhar: carro desligado

        System.out.println("\n=== LIGANDO O CARRO ===");
        meuCarro.ligar(); // Deve funcionar (está desligado e em marcha 0)

        System.out.println("\n=== TESTANDO TROCA DE MARCHAS E ACCELERÇÃO ===");
        meuCarro.acelerar(); // Deve falhar: está em marcha 0 (ponto morto)

        // Subindo para a 1ª marcha
        meuCarro.trocarMarcha(1);

        // Tentando pular marcha para a 3ª (deve ser bloqueado)
        meuCarro.trocarMarcha(3);

        // Acelerando na 1ª marcha até o limite (20 km/h)
        for (int i = 0; i < 21; i++) {
            meuCarro.acelerar();
        }

        System.out.println("\n=== PASSANDO PARA A 2ª MARCHA E MANOBRANDO ===");
        meuCarro.trocarMarcha(2);
        meuCarro.acelerar(); // Agora consegue passar de 20 km/h

        // Testando virar com a velocidade permitida (entre 1 km/h e 40 km/h)
        meuCarro.virar(CarEnum.ESQUERDA);

        System.out.println("\n=== TESTANDO LIMITE PARA VIRAR ===");
        // Vamos acelerar até passar dos 40 km/h
        meuCarro.trocarMarcha(3);
        for (int i = 0; i < 25; i++) {
            meuCarro.acelerar();
        }

        // Tentando virar a mais de 40 km/h (deve ser bloqueado por segurança)
        meuCarro.virar(CarEnum.DIREITA);

        System.out.println("\n=== DESLIGANDO O CARRO COM SEGURANÇA ===");
        meuCarro.desligar(); // Deve falhar: está em movimento e em marcha 3

        // Reduzindo a velocidade até parar
        while (meuCarro.getVelocidade() > 0) {
            meuCarro.diminuir();
        }

        // Reduzindo as marchas até o ponto morto (0)
        meuCarro.trocarMarcha(2);
        meuCarro.trocarMarcha(1);
        meuCarro.trocarMarcha(0);

        // Agora que está parado (0 km/h) e em ponto morto (marcha 0), deve desligar com sucesso
        meuCarro.desligar();
    }
}