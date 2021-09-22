package Exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente correntista1 = new ContaCorrente("0256000-14", "Rogil Zozei Haitiar", 1569);
        correntista1.extrato();
        System.out.println("------------------");
        correntista1.setNomeCorrentista("Vuipial Erbas Goans");
        correntista1.setNumeroConta("010236589-74");
        correntista1.extrato();
        System.out.println("------------------");
        correntista1.deposito(16984);
        correntista1.extrato();
    }
}
