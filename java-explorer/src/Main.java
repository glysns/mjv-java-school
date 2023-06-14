import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setNumero(123);
        c.sacar(30.0);

        System.out.println(c.getSaldo());
    }
}