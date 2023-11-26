package Banco;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(int numAgencia, int numConta, int saldo, Cliente cliente, double taxaManutencao) {
        super(numAgencia, numConta, saldo, cliente);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

}
