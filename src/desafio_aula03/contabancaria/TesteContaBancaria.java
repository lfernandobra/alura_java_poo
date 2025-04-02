package desafio_aula03.contabancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(10000.00);
        contaCorrente.depositar(300);
        contaCorrente.sacar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultaSaldo();
    }
}
