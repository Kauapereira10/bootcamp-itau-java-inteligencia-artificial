package keyword;

// 'public' e 'class' definindo a estrutura
public class Keywords {

    // 'private' protege o atributo, 'final' impede alteração após atribuído
    private final String nome;

    // 'static' pertence à classe
    public static int contador = 0;

    // Construtor usando 'this'
    public Keywords(String nome) {
        this.nome = nome;
        contador++;
    }

    // 'public' e 'return'
    public String getNome() {
        return this.nome;
    }

}
