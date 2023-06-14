public class Conta {
    private Double saldo = 0.0;
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    void sacar(Double  valor){
        if(saldo<valor)
            throw new IllegalArgumentException("Saldo insuficiente");
        this.saldo = this.saldo - valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}
