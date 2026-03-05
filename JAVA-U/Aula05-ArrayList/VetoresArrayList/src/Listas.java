import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Integer> listaNotas = new ArrayList<>();

        //Adicionar Valores
        listaNotas.add(10);
        listaNotas.add(8);
        listaNotas.add(6);
        listaNotas.add(9);
        System.out.println(listaNotas);

        //Adicionar valores em uma posição especifica
        listaNotas.add(2,3);
        listaNotas.add(4,5);
        System.out.println(listaNotas);

        //Verificar o tamanho da lista
        System.out.println("O tamanho da lista é " + listaNotas.size());

        //Acessar um elemento da lista
        System.out.println("A primeira posição tem o valor" + listaNotas.get(0));

        //Alterar um valor da lista
        listaNotas.set(0,20);
        System.out.println(listaNotas);

        //Remover um item
        listaNotas.remove(1); //Posição
        listaNotas.remove(listaNotas.indexOf(20)); // Pelo valor

        //Remover a partir de uma função lamdba
        listaNotas.removeIf(element -> element < 7);
        System.out.println(listaNotas);

        for(Integer nota : listaNotas){
            System.out.println(nota);
        }
    }
}
