package br.com.dio.desafio;

public class Main {
    public static void main(String[] args) {
        Cliente andressa = new Cliente();
        andressa.setNome("Andressa");

        Conta cc = new ContaCorrente(andressa);
        Conta poupanca = new ContaPoupanca(andressa);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
