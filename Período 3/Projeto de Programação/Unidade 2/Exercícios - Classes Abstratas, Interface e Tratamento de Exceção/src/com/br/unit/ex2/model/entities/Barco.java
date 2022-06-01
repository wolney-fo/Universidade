package com.br.unit.ex2.model.entities;

public class Barco implements Veiculo{
    @Override
    public void ligarMotor() {
        System.out.println("Ligando motor...");
    }

    @Override
    public void acelerar() {
        System.out.println("Navio II partindo...");
    }

    @Override
    public void freiar() {
        System.out.println("Atracando embarcação...");
    }

    @Override
    public void buzinar() {
        System.out.println("Buzinando...");
    }
}
