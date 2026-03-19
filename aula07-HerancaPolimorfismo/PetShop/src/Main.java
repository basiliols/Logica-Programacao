import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;


public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(1, "Max", 6.5, "Pit bull");
        Gato gato = new Gato ("preto",5, "Maju", 6.7);
        Peixe peixe = new Peixe ("Carpa", 3, "Mario", 0.5 );

        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(peixe);

    }
}
