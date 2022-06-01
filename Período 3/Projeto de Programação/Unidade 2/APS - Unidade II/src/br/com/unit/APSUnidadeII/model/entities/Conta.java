package br.com.unit.APSUnidadeII.model.entities;

import java.util.Scanner;

public abstract class Conta {
    protected double saldo;

    public Conta(){}

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor_deposito){
        this.saldo += valor_deposito;
    }

    public void saque(double valor_saque){
        Scanner sc = new Scanner(System.in);
        if (valor_saque > this.saldo){
            while (true){
                System.out.println("\n\nValor superior ao saldo atual.");
                System.out.println("Por favor, tente um outro valor");
                System.out.print("\n> R$");

                valor_saque = sc.nextDouble();

                if (valor_saque <= this.saldo){
                    break;
                }
            }
        }

        this.saldo -= valor_saque;
    }

    public abstract void rendimento(double taxa_indexador_anual);
}
