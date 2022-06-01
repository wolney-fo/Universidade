package com.br.unit.ex1.model.entities;

import java.text.SimpleDateFormat;

public abstract class Pessoa {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract String toString();
}
