import java.time.LocalDate;
import java.util.Random;

public class Conta {
    private Double saldo = 0.0;
    private int numero = new Random().nextInt();
    private LocalDate dt = LocalDate.now();
    public Conta(){
        numero = new Random().nextInt();
        //dt = LocalDate.now();
    }
    public Conta(int a){
        this();
    }

    public int getNumero() {
        return numero;
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
