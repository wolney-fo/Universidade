package com.br.unit.ex2.model.entities;

public class Aviao implements Veiculo{
    @Override
    public void ligarMotor() {
        System.out.println("Ligando motor...");
    }

    @Override
    public void acelerar() {
        System.out.println("Decolando...");
    }

    @Override
    public void freiar() {
        System.out.println("Preparando aterrissagem...");
    }

    @Override
    public void buzinar() {
        System.out.println("Chamando equipe de solo...");
    }
}
