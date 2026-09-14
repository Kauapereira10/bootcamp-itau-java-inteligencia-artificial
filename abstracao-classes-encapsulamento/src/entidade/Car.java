package entidade;

import entidade.enums.CarEnum;

public class Car {

    private String marca;
    private String modelo;
    private boolean statusligado;
    private int velocidade;
    private int marcha;
    private CarEnum direcao;

    public Car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.statusligado = false;
        this.marcha = 0; // 0 = ponto morto
        this.velocidade = 0;
    }

    public void ligar() {
        if (!statusligado && marcha == 0) {
            this.statusligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("Não é possível ligar: o carro já está ligado ou não está em ponto morto.");
        }
    }

    public void desligar() {
        if (statusligado && marcha == 0 && velocidade == 0) {
            this.statusligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("Não é possível desligar: o carro deve estar em ponto morto (marcha 0) e parado (0 km/h).");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!statusligado) {
            System.out.println("Carro desligado não pode trocar de marcha.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. As marchas permitidas vão de 0 a 6.");
            return;
        }

        if (Math.abs(novaMarcha - this.marcha) == 1) {
            this.marcha = novaMarcha;
            System.out.println("Marcha alterada para: " + this.marcha);
        } else {
            System.out.println("Não é permitido pular marchas! Troque sequencialmente.");
        }
    }

    public void acelerar() {
        if (!statusligado) {
            System.out.println("Carro desligado não pode acelerar.");
            return;
        }

        if (marcha == 0) {
            System.out.println("O carro está em ponto morto (marcha 0) e não pode acelerar.");
            return;
        }

        if (velocidade >= 120) {
            System.out.println("Velocidade máxima de 120 km/h atingida!");
            return;
        }

        int velocidadeMaximaPermitida = obterVelocidadeMaximaDaMarcha(this.marcha);

        if (velocidade + 1 <= velocidadeMaximaPermitida) {
            this.velocidade++;
            System.out.println("Velocidade: " + this.velocidade + " km/h");
        } else {
            System.out.println("Troque para a próxima marcha para continuar acelerando além de " + velocidadeMaximaPermitida + " km/h.");
        }
    }

    public void diminuir() {
        if (!statusligado) {
            System.out.println("Carro desligado não pode alterar velocidade.");
            return;
        }

        if (velocidade > 0) {
            this.velocidade--;
            System.out.println("Velocidade: " + this.velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado (0 km/h).");
        }
    }

    public void virar(CarEnum direcao) {
        if (!statusligado) {
            System.out.println("Carro desligado não pode realizar manobras.");
            return;
        }

        if (this.velocidade >= 1 && this.velocidade <= 40) {
            this.direcao = direcao;
            System.out.println("O carro virou para a: " + direcao);
        } else {
            System.out.println("Não é seguro virar! A velocidade deve estar entre 1 km/h e 40 km/h.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h | Marcha atual: " + marcha);
        switch (marcha) {
            case 0 -> System.out.println("Marcha 0: Ponto morto (não pode acelerar)");
            case 1 -> System.out.println("Faixa da 1ª marcha: 0km até 20km");
            case 2 -> System.out.println("Faixa da 2ª marcha: 21km até 40km");
            case 3 -> System.out.println("Faixa da 3ª marcha: 41km até 60km");
            case 4 -> System.out.println("Faixa da 4ª marcha: 61km até 80km");
            case 5 -> System.out.println("Faixa da 5ª marcha: 81km até 100km");
            case 6 -> System.out.println("Faixa da 6ª marcha: 101km até 120km");
        }
    }

    private int obterVelocidadeMaximaDaMarcha(int marcha) {
        return switch (marcha) {
            case 1 -> 20;
            case 2 -> 40;
            case 3 -> 60;
            case 4 -> 80;
            case 5 -> 100;
            case 6 -> 120;
            default -> 0;
        };
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isStatusligado() {
        return statusligado;
    }

    public void setStatusligado(boolean statusligado) {
        this.statusligado = statusligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public CarEnum getDirecao() {
        return direcao;
    }

    public void setDirecao(CarEnum direcao) {
        this.direcao = direcao;
    }
}