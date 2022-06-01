package br.unit.entities;

import java.util.Objects;
import java.util.Scanner;

public final class Assalariado extends Funcionario{
    private String funcao;


    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    @Override
    public void cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("Funcionário Assalariado");
        System.out.println("-----------------------\n");

        System.out.print("Nome: ");
        String nome = sc.nextLine().toUpperCase().trim();

        System.out.print("CPF: ");
        int cpf = sc.nextInt();

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();

        System.out.print("Data de nascimento: ");
        String dataNascimento = sc.next();

        this.setNome(nome);
        this.setCpf(cpf);
        this.setMatricula(matricula);
        this.setDataNascimento(dataNascimento);

        System.out.print("Função (Assistente/Supervisor): ");
        setFuncao(sc.next().toUpperCase().trim());

        System.out.println("\n-----------------------------------------");
        calcular_pagamento();
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Função: " + getFuncao());
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de nascimento: " + this.getDataNascimento() + "\n");

        System.out.printf("Pagamento a receber: R$%.2f", this.getPagamento());

        System.out.println("\n-----------------------------------------");
    }

    @Override
    public void calcular_pagamento() {
        if (Objects.equals(getFuncao(), "ASSISTENTE")){
            this.setPagamento(1212.0);
        }
        else if (Objects.equals(getFuncao(), "SUPERVISOR")){
            this.setPagamento(1212.0 * 2);
        }
        else {
            System.out.println("Tipo não encontrado");
        }
    }
}

