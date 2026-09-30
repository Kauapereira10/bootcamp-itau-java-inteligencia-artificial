import java.util.Locale;

public class Teste03 {

    public static void main(String[] args) {

        String texto = "  Desenvolvimento Java  ";

        System.out.println(texto.trim().length());

        System.out.println(texto.charAt(5));
        System.out.println(texto.substring(2, 17));

        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
        System.out.println(texto.replace("Java", "Web"));

        System.out.println(texto.contains("Java"));
        System.out.println(texto.startsWith("  De"));
        System.out.println(texto.endsWith("va  "));
        System.out.println(texto.indexOf("Java"));

        String csv = "Ana,Carlos,Mariana";
        String[] nomes = csv.split(",");

        System.out.println("Nomes extraídas do CSV:");
        for (String nome : nomes) {
            System.out.println("  • " + nome.trim());
        }


    }

}
