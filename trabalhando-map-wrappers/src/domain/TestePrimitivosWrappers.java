package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestePrimitivosWrappers {

    public static void main(String[] args) {

        System.out.println("=== 1. OBRIGATORIEDADE DE WRAPPERS EM COLLECTIONS ===");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);

        System.out.println("Autoboxing automático: " + numeros);

        Map<String, Double> notas = new HashMap<>();
        notas.put("Thomas", 8.5);

        System.out.println("\n=== 2. MÉTODOS UTILITÁRIOS DOS WRAPPERS ===");
        String valorTexto = "150";
        int valorConvertidoPrimitivo = Integer.parseInt(valorTexto);
        Integer valorConvertidoObjeto = Integer.valueOf(valorTexto);

        System.out.println("Texto '150' + 10 = " + (valorConvertidoPrimitivo + 10));

        System.out.println("Valor Mínimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor Máximo de int: " + Integer.MAX_VALUE);
        System.out.println("Binary de 10: " + Integer.toBinaryString(10));

        System.out.println("\n=== 3. TRATANDO VALORES NULOS (BANCO DE DADOS / APIS) ===");
        UserDTO usuarioApi = new UserDTO();

        if (usuarioApi.getIdade() == null) {
            System.out.println("Idade não informada pelo usuário.");
        } else {
            System.out.println("Idade: " + usuarioApi.getIdade());
        }

    }

    static class UserDTO {
        private String nome;
        private Integer idade; // Permite null caso o usuário não informe a idade no formulário

        public Integer getIdade() {
            return idade;
        }
    }

}
