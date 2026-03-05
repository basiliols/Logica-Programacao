public class Vetores {
    public static void main(String[] args) {
        double[] listaNumeros = new double[5];

        listaNumeros[0] = 1;
        listaNumeros[1] = 2;
        listaNumeros[2] = 3;
        listaNumeros[3] = 4;
        listaNumeros[4] = 5;

        //Percorrer Vetores em java
        //Tradicional - for
        for (int i = 0; i<listaNumeros.length; i++){
            System.out.println(listaNumeros[i]);
        }

        //foreach
        for(double num: listaNumeros){
            System.out.println(num);
        }
    }
}
