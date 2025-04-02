package desafio_aula03.contabancaria;

public class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void consultaSaldo() {
        System.out.println("O saldo atual da conta é : " + this.saldo);
    }
}
