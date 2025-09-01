package func;

public class function {
    // Valida se o CPF tem 11 dígitos numéricos
    public static boolean validarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }
}