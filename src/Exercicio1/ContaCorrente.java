package Exercicio1;

/*
1. Modifique os acessos dos atributos da classe referente à Conta Bancária da aula anterior para private e execute o seu programa principal sem alterá-lo.
 */
public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo = 0;

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void saque(double valorSaque) {
        saldo = saldo - valorSaque;
    }

    public void deposito(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    public void extrato() {
        System.out.println("Cliente: " + nomeCorrentista);
        System.out.println("Conta Corrente: " + numeroConta);
        System.out.println("Saldo disponível: R$" + saldo + " reais");
    }
}
