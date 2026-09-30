public class Teste02 {

    public static void main(String[] args) {

        String resultado = "";
        for (int i = 0; i < 100; i++) {
            resultado += 1 + " ";
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(i).append(" ");
        }

        String resultadoEficiente = builder.toString();
        System.out.println(resultadoEficiente);

    }

}
