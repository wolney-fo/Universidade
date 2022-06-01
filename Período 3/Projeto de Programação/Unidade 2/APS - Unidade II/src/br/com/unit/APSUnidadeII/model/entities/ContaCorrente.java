package br.com.unit.APSUnidadeII.model.entities;

public class ContaCorrente extends Conta{

    public ContaCorrente(){}

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    @Override
    public void saque(double valor_saque){
        this.saldo -= (valor_saque + 0.1);
    }

    @Override
    public void rendimento(double taxa_indexador_anual) {
        double porcentagem_rendimento = (((taxa_indexador_anual * 2) / 365) / 100);
        this.saldo = saldo + (saldo * porcentagem_rendimento);
    }
}
