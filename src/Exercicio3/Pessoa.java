package Exercicio3;

/*
3. Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
public class Pessoa {
    private String nome;
    private String aniversario;
    private int anoNascimento;
    private double altura;
    private int anoAtual;

    public Pessoa(String nome, String aniversario,String anoNascimento, double altura, String anoAtual) {
        this.nome = nome;
        this.aniversario = aniversario;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.anoAtual = anoAtual;
    }

    public String getNome() {
        return nome;
    }

    public String getAniversario() {
        return aniversario;
    }
    public String getAnoNascimento() {
        return anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public String getAnoAtual() {
        return anoAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    public void setAnoNascimento(String anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAnoAtual(String anoAtual) {
        this.anoAtual = anoAtual;
    }

    public void calculaIdade() {

    }

    public void imprimeDados() {
        System.out.println("Seu nome é: " + getNome());
        System.out.println("Seu aniversário é: " + getAniversario());
        System.out.println("Sua idade é: " + (getAnoAtual()-getAnoNascimento()));
        System.out.println("Sua altura é: " + getAltura() + "m");
    }
}
