package entidade;

public class PetMachine {

    private int nivelAgua;
    private int nivelShampoo;
    private boolean temPet;
    private Pet pet;
    private boolean precisaLimpeza;

    private static final int CAPACIDADE_MAX_AGUA = 30;
    private static final int CAPACIDADE_MAX_SHAMPOO = 10;

    public PetMachine() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.temPet = false;
        this.pet = null;
        this.precisaLimpeza = false;
    }

    public void colocarPetNaMaquina(Pet pet) {
        if (temPet) {
            System.out.println("So pode 1 Pet por vez.");
            return;
        }

        if (precisaLimpeza) {
            System.out.println("A maquina esta suja, precisa limpar.");
            return;
        }

        this.pet = pet;
        this.temPet = true;
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Nao ha pet na maquina para dar banho.");
            return;
        }

        if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Agua ou Shampoo insuficientes.");
            return;
        }

        this.nivelAgua -= 10;
        this.nivelShampoo -= 2;
        this.pet.setClean(true);
        System.out.println("Banho realizado com sucesso.");
    }

    public void abastecerAgua() {
        if (this.nivelAgua + 2 <= CAPACIDADE_MAX_AGUA) {
            this.nivelAgua += 2;
        } else {
            this.nivelAgua = CAPACIDADE_MAX_AGUA;
            System.out.println("Capacidade maxima de agua atingida.");
        }
    }

    public void abastecerShampoo() {
        if (this.nivelShampoo + 2 <= CAPACIDADE_MAX_SHAMPOO) {
            this.nivelShampoo += 2;
        } else {
            this.nivelShampoo = CAPACIDADE_MAX_SHAMPOO;
            System.out.println("Capacidade maxima de shampoo atingida.");
        }
    }

    public void retirarPetDaMaquina() {
        if (!temPet) {
            System.out.println("Nao ha pet na maquina para retirar.");
            return;
        }

        if (pet.isClean()) {
            System.out.println("Pet retirado da maquina, ja esta limpo.");
        } else {
            System.out.println("Pet retirado sem tomar banho. Maquina precisa de limpeza.");
            this.precisaLimpeza = true;
        }

        this.temPet = false;
        this.pet = null;
    }

    public void limparMaquina() {
        if (this.nivelAgua >= 3 && this.nivelShampoo >= 1) {
            this.precisaLimpeza = false;
            this.nivelAgua -= 3;
            this.nivelShampoo -= 1;
            System.out.println("Maquina limpada com sucesso.");
        } else {
            System.out.println("Nao temos agua ou shampoo suficiente para limpar.");
        }
    }

    public void verificarNivelAguaEShampoo() {
        boolean nivelDeAgua = nivelAgua < 10;
        boolean nivelDeShampoo = nivelShampoo < 3;

        if (nivelDeAgua || nivelDeShampoo) {
            System.out.println("======== ATENCAO ========");
            System.out.println("O nivel de Agua ou Shampoo esta abaixo!");
        }
        System.out.println("Nivel de Agua: " + nivelAgua);
        System.out.println("Nivel de Shampoo: " + nivelShampoo);
    }

    public boolean isTemPet() {
        return temPet;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public int getNivelShampoo() {
        return nivelShampoo;
    }

    public boolean isPrecisaLimpeza() {
        return precisaLimpeza;
    }
}