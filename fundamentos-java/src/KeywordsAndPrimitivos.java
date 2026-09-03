/**
 * Classe de estudo: Tipos Primitivos e Keywords (palavras-chave) em Java.
 *
 * Objetivo: servir como referência rápida dos 8 tipos primitivos da linguagem
 * e de algumas das keywords mais usadas no dia a dia (modificadores de acesso,
 * controle de fluxo, declaração de classes/métodos, etc).
 */
public class KeywordsAndPrimitivos {

    // ===================== TIPOS PRIMITIVOS =====================
    // Java possui 8 tipos primitivos, divididos em: numéricos inteiros,
    // numéricos de ponto flutuante, caractere e booleano.

    // --- Numéricos inteiros ---
    byte umByte = 127;              // 8 bits  | -128 a 127
    short umShort = 32000;          // 16 bits | -32.768 a 32.767
    int umInt = 2_000_000;          // 32 bits | -2^31 a 2^31-1 (mais usado)
    long umLong = 9_000_000_000L;   // 64 bits | precisa do sufixo 'L'

    // --- Numéricos de ponto flutuante ---
    float umFloat = 3.14f;          // 32 bits | precisa do sufixo 'f'
    double umDouble = 3.14159265;   // 64 bits | padrão para decimais em Java

    // --- Caractere ---
    char umChar = 'A';              // 16 bits | representa um único caractere Unicode

    // --- Booleano ---
    boolean umBoolean = true;       // true ou false

    // ===================== KEYWORDS (palavras-chave) =====================
    // Palavras reservadas pelo compilador Java, não podem ser usadas como
    // nomes de variáveis, métodos ou classes.

    // --- Modificadores de acesso ---
    // public    -> acessível de qualquer lugar
    // private   -> acessível somente dentro da própria classe
    // protected -> acessível na classe, subclasses e mesmo pacote

    // --- Modificadores de comportamento ---
    // static -> pertence à classe, não à instância
    // final  -> valor/classe/método não pode ser alterado ou sobrescrito
    private static final double PI_APROXIMADO = 3.14;

    // --- Declaração de estruturas ---
    // class, interface, extends, implements

    // --- Controle de fluxo ---
    // if / else, switch / case, for, while, do, break, continue

    // --- Tratamento de exceções ---
    // try, catch, finally, throw, throws

    // --- Outras keywords comuns ---
    // void   -> método não retorna valor
    // new    -> cria uma nova instância de objeto
    // this   -> referencia a instância atual
    // return -> retorna um valor do método
    // null   -> ausência de valor para tipos de referência

    public static void main(String[] args) {
        KeywordsAndPrimitivos exemplo = new KeywordsAndPrimitivos();

        System.out.println("=== Tipos primitivos ===");
        System.out.println("byte: " + exemplo.umByte);
        System.out.println("short: " + exemplo.umShort);
        System.out.println("int: " + exemplo.umInt);
        System.out.println("long: " + exemplo.umLong);
        System.out.println("float: " + exemplo.umFloat);
        System.out.println("double: " + exemplo.umDouble);
        System.out.println("char: " + exemplo.umChar);
        System.out.println("boolean: " + exemplo.umBoolean);

        System.out.println("\n=== Constante estática final ===");
        System.out.println("PI_APROXIMADO: " + PI_APROXIMADO);

        System.out.println("\n=== Exemplo de estrutura condicional ===");
        if (exemplo.umBoolean) {
            System.out.println("umBoolean é true, então entrei no if.");
        } else {
            System.out.println("umBoolean é false, então entrei no else.");
        }
    }
}