public class PraticaBuilderBuffer {

    public static void main(String[] args) {

        System.out.println("=== 1. USO DO STRINGBUILDER (RÁPIDO / SINGLE-THREAD) ===");
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Antes do append: " + sb);

        sb.append(" 21").append(" - Collections");
        System.out.println("Após append: " + sb);

        sb.insert(0, "Curso de ");
        System.out.println("Após insert: " + sb);

        int inicio = sb.indexOf("Collections");
        sb.replace(inicio, inicio + "Collections".length(), "Maps & Sets");
        System.out.println("Após replace: " + sb);

        StringBuilder invertido = new StringBuilder("Java").reverse();
        System.out.println("String Invertida: " + invertido);

        sb.delete(0, 9);
        System.out.println("Após delete: " + sb);

        System.out.println("\n=== 2. STRINGBUFFER (THREAD-SAFE) ===");
        StringBuffer sbf = new StringBuffer("Log de eventos:");
        sbf.append(" [Thread-1: Sucesso]");
        sbf.append(" [Thread-2: Erro]");

        System.out.println(sbf.toString());


    }

}
