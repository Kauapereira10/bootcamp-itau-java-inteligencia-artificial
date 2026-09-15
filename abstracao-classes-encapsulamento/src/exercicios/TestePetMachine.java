package exercicios;

import entidade.Pet;
import entidade.PetMachine;

public class TestePetMachine {

    public static void main(String[] args) {

        PetMachine maquina = new PetMachine();
        Pet rex = new Pet("Rex");
        Pet bob = new Pet("Bob");

        System.out.println("--- Tentando dar banho sem agua/shampoo ---");
        maquina.colocarPetNaMaquina(rex);
        maquina.darBanho();

        System.out.println("\n--- Abastecendo ---");
        for (int i = 0; i < 15; i++) {
            maquina.abastecerAgua();
        }

        for (int i = 0; i < 5; i++) {
            maquina.abastecerShampoo();
        }
        maquina.verificarNivelAguaEShampoo();

        System.out.println("\n--- Dando banho no Rex ---");
        maquina.darBanho();
        System.out.println("Rex esta limpo? " + rex.isClean());

        System.out.println("\n--- Retirando Rex limpo ---");
        maquina.retirarPetDaMaquina();

        System.out.println("\n--- Colocando Bob, tirando sem banho ---");
        maquina.colocarPetNaMaquina(bob);
        maquina.retirarPetDaMaquina();

        System.out.println("\n--- Tentando colocar outro pet com maquina suja ---");
        maquina.colocarPetNaMaquina(rex);

        System.out.println("\n--- Limpando a maquina ---");
        maquina.limparMaquina();

        System.out.println("\n--- Agora pode colocar pet de novo ---");
        maquina.colocarPetNaMaquina(rex);
        System.out.println("Tem pet na maquina? " + maquina.isTemPet());

        System.out.println("\n--- Testando limite maximo de agua ---");
        for (int i = 0; i < 20; i++) {
            maquina.abastecerAgua();
        }
        System.out.println("Nivel final de agua: " + maquina.getNivelAgua());


    }
}
