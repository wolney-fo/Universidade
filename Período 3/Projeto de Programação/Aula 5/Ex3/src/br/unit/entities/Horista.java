package br.unit.entities;

import java.util.Scanner;

public final class Horista extends Funcionario {
    private int horas_trabalhadas;


    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }


    @Override
    public void cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("Funcionário Horista");
        System.out.println("-------------------\n");

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

        System.out.print("Horas trabalhadas: ");
        int horas_trabalhadas = sc.nextInt();

        this.setHoras_trabalhadas(horas_trabalhadas);


        System.out.println("\n-----------------------------------------");
        calcular_pagamento();
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Setor: Horista");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de nascimento: " + this.getDataNascimento() + "\n");

        System.out.printf("Pagamento a receber: R$%.2f", this.getPagamento());

        System.out.println("\n-----------------------------------------");
    }

    @Override
    public void calcular_pagamento() {
        this.setPagamento(getHoras_trabalhadas() * 50);
    }
}
