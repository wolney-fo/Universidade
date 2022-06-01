package com.br.unit.ex1.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaFisica extends Pessoa{
    private int cpf;
    private Date birthDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public PessoaFisica(){}

    public PessoaFisica(String name, int cpf, Date birthDate){
        this.setName(name);
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Nome: " +
                this.getName() +
                "\nData de nascimento: "
                + sdf.format(this.getBirthDate()) +
                "\nCPF: " +
                this.getCpf();
    }
}
