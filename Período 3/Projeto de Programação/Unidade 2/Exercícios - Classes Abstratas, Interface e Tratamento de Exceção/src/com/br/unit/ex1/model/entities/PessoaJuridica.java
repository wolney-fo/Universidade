package com.br.unit.ex1.model.entities;

public class PessoaJuridica extends Pessoa{
    private int cnpj;
    private int inscEst;
    private String nomeFantasia;

    public PessoaJuridica(){}

    public PessoaJuridica(int cnpj, int inscEst, String razaoSocial, String nomeFantasia){
        this.setCnpj(cnpj);
        this.setInscEst(inscEst);
        this.setName(razaoSocial);
        this.setNomeFantasia(nomeFantasia);
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getInscEst() {
        return inscEst;
    }

    public void setInscEst(int inscEst) {
        this.inscEst = inscEst;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


    @Override
    public String toString() {
        return "Razão Social: " +
                this.getName() +
                "\nCNPJ: " +
                this.getCnpj() +
                "\nInscrição Estadual: " +
                this.getInscEst() +
                "\nNome Fantasia: " +
                this.getNomeFantasia();
    }
}
