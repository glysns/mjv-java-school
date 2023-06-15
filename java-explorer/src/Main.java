import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(1);
        //c.sacar(30.0);
        System.out.println(c.getNumero());
        System.out.println(c.getSaldo());
    }
}