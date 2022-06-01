package br.unit.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private int ie;
    private int im;

    List<String> nomes_empresas_cadastradas = new ArrayList<>();
    List<String> enderecos_empresas_cadastradas = new ArrayList<>();
    List<String> telefones_empresas_cadastradas = new ArrayList<>();

    List<Integer> cnpjs_empresas_cadastradas = new ArrayList<>();
    List<Integer> ies_empresas_cadastradas = new ArrayList<>();
    List<Integer> ims_empresas_cadastradas = new ArrayList<>();


    public PessoaJuridica() {
    }


    public void cadastro(){
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------");

        System.out.print("Razão Social: ");
        String nome = input.nextLine();


        System.out.print("Endereço: ");
        String endereco = input.nextLine();

        System.out.print("Telefone: ");
        String telefone = input.next();

        System.out.print("CNPJ: ");
        int cnpj = input.nextInt();

        System.out.print("Inscrição Estadual: ");
        int ie = input.nextInt();

        System.out.print("Inscrição Municipal: ");
        int im = input.nextInt();


        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.ie = ie;
        this.im = im;

        nomes_empresas_cadastradas.add(nome);
        enderecos_empresas_cadastradas.add(endereco);
        telefones_empresas_cadastradas.add(telefone);

        cnpjs_empresas_cadastradas.add(cnpj);
        ies_empresas_cadastradas.add(ie);
        ims_empresas_cadastradas.add(im);

        System.out.println("----------------------------------");
    }


    public void mostrar_cadastro() {
        for (int i=0; i<cnpjs_empresas_cadastradas.size();i++){
            System.out.println("-----------------------");
            System.out.println("Razão Social: " + nomes_empresas_cadastradas.get(i));
            System.out.println("Endereço: " + enderecos_empresas_cadastradas.get(i));
            System.out.println("Telefone: " + telefones_empresas_cadastradas.get(i));
            System.out.println("CNPJ: " + cnpjs_empresas_cadastradas.get(i));
            System.out.println("Inscrição Estadual: " + ies_empresas_cadastradas.get(i));
            System.out.println("Inscrição Municipal: " + ims_empresas_cadastradas.get(i));
        }
        System.out.println("-----------------------");
    }
}
