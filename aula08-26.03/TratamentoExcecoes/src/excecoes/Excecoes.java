package excecoes;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while (true) {
            System.out.println("");
            System.out.println("1 - CADASTRAR PESSOA");
            System.out.println("2 - LISTAR PESSOA");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.print("Digite uma opcao: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":

                    try {
                        System.out.print("Digite seu nome: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite sua idade: ");
                        String idade = sc.nextLine();
                        sc.nextLine();
                        FileWriter writer = new FileWriter("dados.txt", true);
                        writer.write(nome + " " + idade + "\n");
                        writer.close();
                        System.out.println("Dados cadastrados com sucesso!");


                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo");
                        System.out.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Informe um valor numerico");
                        System.out.println("Dethale:" + e .getMessage());
                        }

            case "2":
                 try {
                     BufferedReader reader =  new BufferedReader(new FileReader("dados.txt));" +
                     "String Linha";

                    System.out.println("=== LISTA DE PESSOAS===");

                     while (linha = reader.readLine()) != null) {
                         System.out.println(linha);
                     }
                     }
                 }catch (FileNotFoundException e ) {
                     System.out.println("ARQUIVO NÃO CRIADO");
                     System.out.println("Dethale:" + e.getMessage());
                 }catch (IOException e) {
                     System.out.println("Erro ao criar o arquivo");
                     System.out.println("Dethale:" + e.getMessage());
                 }

                 }
            }
}
