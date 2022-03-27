package br.unit.entities;

import java.util.Objects;
import java.util.Scanner;

public final class Comissionado extends Funcionario{
    private String setor;
    private double montante_em_vendas;


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getMontante_em_vendas() {
        return montante_em_vendas;
    }

    public void setMontante_em_vendas(double montante_em_vendas) {
        this.montante_em_vendas = montante_em_vendas;
    }


    @Override
    public void cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Funcionário Comissionado");
        System.out.println("------------------------\n");

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

        System.out.print("Setor (Roupas/Calçados): ");
        setSetor(sc.next().toUpperCase().trim());

        System.out.print("\nMontante em vendas: R$");
        setMontante_em_vendas(sc.nextDouble());

        calcular_pagamento();

        System.out.println("\n-----------------------------------------");
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Setor: " + getSetor());
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de nascimento: " + this.getDataNascimento() + "\n");

        System.out.printf("Pagamento a receber: R$%.2f", this.getPagamento());

        System.out.println("\n-----------------------------------------");
    }

    @Override
    public void calcular_pagamento() {
        if (Objects.equals(getSetor(), "ROUPAS")){
            this.setPagamento(getMontante_em_vendas() * 0.05);
        }
        else if (Objects.equals(getSetor(), "CALÇADOS")){
            this.setPagamento(getMontante_em_vendas() * 0.07);
        }
        else {
            System.out.println("Tipo não encontrado");
        }
    }
}
