package Exercicio3;

/*
3. Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;
    private String anoAtual;

    public Pessoa(String nome, String dataNascimento, double altura, String anoAtual) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.anoAtual = anoAtual;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public String getAnoAtual() {
        return  anoAtual;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setAltura (double altura){
        this.altura = altura;
    }
    public void setAnoAtual (String anoAtual){
        this.anoAtual = anoAtual;
    }
    public void calculaIdade(){

    }
    public void imprimeDados (){
        System.out.println("Seu nome é: " +getNome());
        System.out.println("Sua data de nascimento é: " +getDataNascimento());
        System.out.println("Sua altura é: " +getAltura()+ "m");
    }
}
