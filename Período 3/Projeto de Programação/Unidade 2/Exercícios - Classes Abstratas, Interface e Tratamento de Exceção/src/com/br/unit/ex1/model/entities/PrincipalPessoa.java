package com.br.unit.ex1.model.entities;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalPessoa {
    private Pessoa pessoa;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void main(){
        Scanner sc = new Scanner(System.in);
        int action;
        while (true){
            try{
                System.out.println("[ 1 ] Cadastrar\n[ 2 ] Imprimir\n[ 0 ] Sair");

                System.out.print("> ");
                action = sc.nextInt();

                if (action == 0){
                    break;
                }
                else if (action == 1) {
                    cadastrar();
                }
                else if (action == 2){
                    imprimir();
                }
            }
            catch (InputMismatchException | ParseException e){
                System.out.println("Opção inválida.");
                break;
            }
        }
    }

    public void cadastrar() throws ParseException {
        Scanner sc = new Scanner(System.in);
        int action;

        while (true){
            try{
                System.out.println("[ 1 ] Pessoa Física\n[ 2 ] Pessoa Jurídica\n[ 0 ] <- Voltar");

                System.out.print("> ");
                action = sc.nextInt();
                sc.nextLine();

                if (action == 0){
                    break;
                }
                else if (action == 1) {
                    try {
                        System.out.print("Nome: ");
                        String name = sc.nextLine();

                        System.out.print("CPF: ");
                        int cpf = sc.nextInt();

                        System.out.print("Data de nascimento (dd/mm/aaaa): ");
                        Date birthDate = sdf.parse(sc.next());

                        pessoa = new PessoaFisica(name, cpf, birthDate);
                    }
                    catch (InputMismatchException e){
                        System.out.println("Ops... Algo está errado. Confira e insira novamente.");
                    }
                }
                else if (action == 2){
                    try {
                        System.out.print("Razão Social: ");
                        String razaoSocial = sc.nextLine();

                        System.out.print("Nome Fantasia: ");
                        String nomeFantasia = sc.nextLine();

                        System.out.print("CNPJ: ");
                        int cnpj = sc.nextInt();

                        System.out.println("Inscrição Estadual: ");
                        int inscEst = sc.nextInt();

                        pessoa = new PessoaJuridica(cnpj, inscEst, razaoSocial, nomeFantasia);
                    }
                    catch (InputMismatchException e){
                        System.out.println("Ops... Algo está errado. Confira e insira novamente.");
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println("Opção inválida.");
                break;
            }
        }
    }

    public void imprimir() throws ParseException {
        try {
            System.out.println(this.getPessoa().toString());
        }
        catch (NullPointerException e){
            System.out.println("Você ainda não cadastrou uma pessoa. Vamos começar. :)");
            cadastrar();
        }
    }
}
