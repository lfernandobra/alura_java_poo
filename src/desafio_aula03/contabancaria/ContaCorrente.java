package desafio_aula03.contabancaria;

public class ContaCorrente extends ContaBancaria{
    private double TARIFAMENSAL = 50;
     
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void cobrarTarifaMensal() {
        this.saldo -= TARIFAMENSAL;
    }
}
