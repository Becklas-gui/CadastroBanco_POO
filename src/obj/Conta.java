package obj;

public class Conta {
    private int agencia;
    private int numero;
    private String tipo; // Se é"Corrente" ou "Poupanca"

    public Conta(int agencia, int numero, String tipo) {
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
    }

    // Getters e Setters

    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }
    

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
