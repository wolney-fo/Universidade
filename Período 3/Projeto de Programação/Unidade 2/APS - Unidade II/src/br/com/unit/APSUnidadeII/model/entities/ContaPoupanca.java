package br.com.unit.APSUnidadeII.model.entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(){}

    public ContaPoupanca(double saldo){
        this.saldo = saldo;
    }

    @Override
    public void rendimento(double taxa_indexador_anual) {
        double porcentagem_rendimento = (((taxa_indexador_anual * 3) / 365) / 100);
        this.saldo = saldo + (saldo * porcentagem_rendimento);
    }
}
