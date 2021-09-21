package Exercicio1;
/*
1. Modifique os acessos dos atributos da classe referente à Conta Bancária da aula anterior para private e execute o seu programa principal sem alterá-lo.
 */
public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private String saldo = "0";

    public ContaCorrente(String numeroConta, String nomeCorrentista,String saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
}
