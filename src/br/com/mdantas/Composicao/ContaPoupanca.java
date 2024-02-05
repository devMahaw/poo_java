package br.com.mdantas.Composicao;

/**
 * @author marcelo.dantas
 */
public class ContaPoupanca {

    private Banco banco;

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
