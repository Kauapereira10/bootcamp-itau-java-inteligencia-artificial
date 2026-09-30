public class Teste01 {

    public static void main(String[] args) {

        String nome = "Ana";
        nome.concat(" Silva");
        System.out.println(nome);

        nome = nome.concat(" Silva");
        System.out.println(nome);

        System.out.println("\n ================= ");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


    }

}
