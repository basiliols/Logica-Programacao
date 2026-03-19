package entidades;

public class Peixe extends Animal {
    private String especie;

    //Getters e Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


//Construtor
    public Peixe(String especie, int Idade, String nome, double peso) {
        super(Idade, nome, peso);
        this.especie = especie;



    }

    public Peixe(String nome, String especie) {
        super(nome);
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Peixe{" + super.toString() +
                "especie='" + especie + '\'' +
                '}';
    }
}
