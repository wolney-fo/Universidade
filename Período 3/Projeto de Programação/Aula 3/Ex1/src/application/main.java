package application;


import entities.Cliente;
import entities.ClienteEmpresa;
import entities.ClientePessoa;

import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int action;

        Cliente pessoaFisica = new ClientePessoa();
        Cliente pessoaJutidica = new ClienteEmpresa();

        while (true) {
            System.out.println("________________________");
            System.out.println("|    Loja do seu Zé    |");
            System.out.println("------------------------");
            System.out.println("Usuário: 01\n");
            System.out.println("[ 1 ] Cadastrar cliente");
            System.out.println("[ 2 ] Listar Clientes");
            System.out.println("[ 0 ] Sair");

            System.out.print("> ");
            action = input.nextInt();

            if (action == 0){
                break;
            }

            if (action == 1) {
                while (true) {
                    System.out.println("____________________");
                    System.out.println("|      Cadastro     |");
                    System.out.println("--------------------\n");
                    System.out.println("[ 1 ] Pessoa física");
                    System.out.println("[ 2 ] Pessoa Jutídica");
                    System.out.println("[ 0 ] <- Voltar");

                    System.out.print("> ");
                    action = input.nextInt();

                    if (action == 0) {
                        break;
                    } else if (action == 1) {
                        pessoaFisica.cadastrarCliente();
                    } else if (action == 2) {
                        pessoaJutidica.cadastrarCliente();
                    }
                }
            }

            if (action == 2){
                while (true) {
                    System.out.println("____________________");
                    System.out.println("|      Listar      |");
                    System.out.println("--------------------\n");
                    System.out.println("[ 1 ] Pessoa física");
                    System.out.println("[ 2 ] Pessoa Jutídica");
                    System.out.println("[ 3 ] Todos os cadastros");
                    System.out.println("[ 0 ] <- Voltar");

                    System.out.print("> ");
                    action = input.nextInt();

                    if (action == 0) {
                        break;
                    } else if (action == 1) {
                        pessoaFisica.listarClientes();
                    } else if (action == 2) {
                        pessoaJutidica.listarClientes();
                    } else if (action == 3){
                        System.out.println("---------------------------------");
                        System.out.println("Pessoas físicas:");
                        pessoaFisica.listarClientes();
                        System.out.println("---------------------------------");
                        System.out.println("Pessoas Jurídicas");
                        pessoaJutidica.listarClientes();
                        System.out.println("---------------------------------");
                    }
                }
            }
        }
    }
}
