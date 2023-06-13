import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    Cliente cliente;
    Double saldo=132.0;
    Integer numeroConta;
    Integer numeroAgencia;
    boolean ativa=true;

    List<Transacao> transacoes = new ArrayList<>();

    boolean sacar(double valor){
        if(saldo < valor) {
            return false;
        }

        saldo = saldo - valor;
        incluirTransaca(valor);
        return  true;
    }
    private void incluirTransaca(Double valor){
        Transacao t = new Transacao();
        t.data = LocalDate.now();
        t.tipo="SAQUE";
        t.descricao="Saque em especie";
        t.valor = valor;
        transacoes.add(t);
    }
    void transferir(ContaCorrente contaDestino, Double valor){


    }

    Double consultarSaldo(){

        return saldo;
    }
    List<Transacao> consultarExtrato(LocalDate di, LocalDate df){
        //logica
        return transacoes;
    }
    void cancelarConta(String justificativa){
        this.ativa=false;
    }

}
