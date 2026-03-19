package entidades;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(int idade, String nome, double peso, String raca) {
       super(idade, nome, peso);
        this.raca = raca;
    }

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }
    // Getters

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
}

    @Override
    public String toString() {
        return "Cachorro{" + super.toString() +
                "raca='" + raca + '\'' +
                '}';
    }
}

