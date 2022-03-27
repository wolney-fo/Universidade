package br.unit.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class PessoaFisica extends Pessoa {
    private int rg;
    private int cpf;
    private String dataNascimento;

    List<String> nomes_pessoas_cadastradas = new ArrayList<>();
    List<String> enderecos_pessoas_cadastradas = new ArrayList<>();
    List<String> telefones_pessoas_cadastradas = new ArrayList<>();

    List<Integer> rgs_pessoas_cadastradas = new ArrayList<>();
    List<Integer> cpfs_pessoas_cadastradas = new ArrayList<>();
    List<String> datasNas_pessoas_cadastradas = new ArrayList<>();


    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String endereco, String telefone, int rg, int cpf, String dataNascimento) {
        super(nome, endereco, telefone);
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }


    public int getRg() {
        return rg;
    }

    public int getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }


    public void cadastro(){
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------");

        System.out.print("Nome: ");
        String nome = input.nextLine();


        System.out.print("Endereço: ");
        String endereco = input.nextLine();

        System.out.print("Telefone: ");
        String telefone = input.next();

        System.out.print("RG: ");
        int rg = input.nextInt();

        System.out.print("CPF: ");
        int cpf = input.nextInt();
        input.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNascimento = input.next();


        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

        nomes_pessoas_cadastradas.add(nome);
        enderecos_pessoas_cadastradas.add(endereco);
        telefones_pessoas_cadastradas.add(telefone);

        rgs_pessoas_cadastradas.add(rg);
        cpfs_pessoas_cadastradas.add(cpf);
        datasNas_pessoas_cadastradas.add(dataNascimento);

        System.out.println("----------------------------------");
    }


    public void mostrar_cadastro() {
        for (int i=0; i<rgs_pessoas_cadastradas.size();i++){
            System.out.println("-----------------------");
            System.out.println("Nome: " + nomes_pessoas_cadastradas.get(i));
            System.out.println("Endereço: " + enderecos_pessoas_cadastradas.get(i));
            System.out.println("Telefone: " + telefones_pessoas_cadastradas.get(i));
            System.out.println("RG: " + rgs_pessoas_cadastradas.get(i));
            System.out.println("CPF: " + cpfs_pessoas_cadastradas.get(i));
            System.out.println("Data de nascimento: " + datasNas_pessoas_cadastradas.get(i));
        }
        System.out.println("-----------------------");
    }
}
