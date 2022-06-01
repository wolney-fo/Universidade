package com.br.unit.ex2.model.entities;

public class Carro implements Veiculo{
    @Override
    public void ligarMotor() {
        System.out.println("Ligando motor...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void freiar() {
        System.out.println("Freando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Bi bi");
    }
}
