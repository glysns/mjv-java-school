import java.util.List;

public class Terminal {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println(conta1.saldo);
        boolean sacou = conta1.sacar(50);
        if(sacou)
            System.out.println(conta1.saldo);
        else
            System.out.println("Saldo insuficiente");

        List<Transacao> transacoes = conta1.transacoes;

        for(Transacao transacao : transacoes) {
            System.out.println(transacao.descricao + " " + transacao.valor);
        }
    }
}