package excecoes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoTxt{
    public static void main (String[] {
            Scanner sc = new Scanner (System.in);
            String opcao;

            while (true){
                 System.out.println("===SISTEMA CADASTRO===");
                System.out.println("1 - CADASTRAR PESSOA");
                System.out.println("2 - LISTAR PESSOA");
                System.out.println("3 - SAIR DO PROGRAMA");
                System.out.println("Digite a opcao");
                opcao = sc.nextLine();

                switch (opcao){
                        case "1":
                            try {
                                System.out.println("Digite o nome do Pessoa:");
                                String nome = sc.nextLine();

                                System.out.println("Digite a idade da  Pessoa:");
                                int idade = sc.nextInt();
                                sc.nextLine();

                                FileWriter write = new FileWriter("dados.txt", true);

                            } catch (IOException e) {
                                System.out.println("Erro ao criar o arquivo");
                                System.out.println("Detalhe:" + e.getMessage());
                            } catch (InputMismatchException e ) {
                                System.out.println("Informe um valor numerico");
                                System.out.println("Dethale :" + e.getMessage());

                            }
                }
            }
    }
}