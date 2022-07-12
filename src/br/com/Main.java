package br.com;

public class Main {
    public static void main(String[] args) {
        Cliente erick = new Cliente();
        erick.setNome("Érick Almeida");

        ContaCorrente cc = new ContaCorrente(erick);
        ContaPoupanca cp = new ContaPoupanca(erick);
        cc.depositar(100);
        cc.transferir(70, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
