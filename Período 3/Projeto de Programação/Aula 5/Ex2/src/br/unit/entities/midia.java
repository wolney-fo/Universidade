package br.unit.entities;

public abstract class Midia {
    protected int codigo;
    protected double preco;
    protected String nome;
    protected int numero_de_faixas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero_de_faixas() {
        return numero_de_faixas;
    }

    public void setNumero_de_faixas(int numero_de_faixas) {
        this.numero_de_faixas = numero_de_faixas;
    }

    public abstract void cadastro(int codigo);
    public abstract void mostrar_cadastros();
}
