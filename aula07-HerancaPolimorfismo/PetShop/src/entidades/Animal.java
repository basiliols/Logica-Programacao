package entidades;

public class Animal {
    private String nome;
    private int idade;
    private double peso;

// sem idade constructor

    public Animal(String nome) {
        this.nome = nome;

    }

    public Animal(int idade, String nome, double peso) {
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;

    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", peso=" + peso  ;
    }
}
