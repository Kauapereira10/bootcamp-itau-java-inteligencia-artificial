package outroexemplo;

public record ApiResponse<T>(boolean sucesso, String mensagem, T dados) {

    static <T> ApiResponse<T> ok(T dados){
        return new ApiResponse<>(true, "OK", dados);
    }

    static <T> ApiResponse<T> erro(String mensagem){
        return new ApiResponse<>(false, mensagem, null);
    }
}
