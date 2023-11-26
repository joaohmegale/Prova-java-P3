package Banco;

public class ContaPoupanca {
    private int numAg;
    private int numConta;

    public ContaPoupanca(int numAg, int numConta) {
        this.numAg = numAg;
        this.numConta = numConta;
    }

    public int getNumAg() {
        return numAg;
    }

    public void setNumAg(int numAg) {
        this.numAg = numAg;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

}
