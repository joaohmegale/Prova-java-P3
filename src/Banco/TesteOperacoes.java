package Banco;

import java.util.ArrayList;
import java.util.*;
public class TesteOperacoes {
    private ArrayList<Conta> listaContas;
    private ArrayList<Cliente> listaClientes;

    public TesteOperacoes() {
        listaClientes = new ArrayList<>();
        listaContas = new ArrayList<>();
    } 
    public ArrayList<Conta> getListaContas() {
        return listaContas;
    }
    public void setListaContas(ArrayList<Conta> listaContas) {
        this.listaContas = listaContas;
    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }   
    public void criarConta(){
        Scanner in = new Scanner(System.in);
        String nome, end, prof;
        System.out.println("Informe o nome: ");
        nome = in.nextLine();
        System.out.println("Informe o endereco: ");
        end = in.nextLine();
        System.out.println("Informe a profissao: ");
        prof = in.nextLine();

        Cliente cliente = new Cliente(nome, end, prof);
        this.listaClientes.add(cliente);

        System.out.println("Informe o tipo de conta a ser criado: (Escreva poupanca ou corrente)");
        String tipoConta = in.nextLine();
        System.out.println("Informe o numero da conta: ");
        int numConta = in.nextInt();
        System.out.println("Informe o numero da agencia: ");
        int numAg = in.nextInt();

        if (tipoConta.equalsIgnoreCase("poupanca")) {
            ContaPoupanca contaP = new ContaPoupanca(numAg, numConta);
        }

    }
}
