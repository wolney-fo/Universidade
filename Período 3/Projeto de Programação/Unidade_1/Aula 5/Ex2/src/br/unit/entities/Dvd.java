package br.unit.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dvd extends Midia{
    List<Integer> codigos_dvds = new ArrayList<>();
    List<String> nomes_dvds = new ArrayList<>();
    List<Double> precos_dvds = new ArrayList<>();
    List<Integer> nFaixas_dvds = new ArrayList<>();


    @Override
    public void cadastro(int codigo) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Nº. faixas: ");
        int numero_de_faixas = sc.nextInt();

        System.out.print("Preço: R$");
        double preco = sc.nextDouble();

        this.setNome(nome);
        this.setCodigo(codigo);
        this.setNumero_de_faixas(numero_de_faixas);
        this.setPreco(preco);

        nomes_dvds.add(this.getNome());
        codigos_dvds.add(this.getCodigo());
        precos_dvds.add(this.getPreco());
        nFaixas_dvds.add(this.getNumero_de_faixas());
    }

    @Override
    public void mostrar_cadastros() {
        for (int i=0; i<nomes_dvds.size();i++) {
            System.out.println("-----------------------------------");
            System.out.println("DVD: " + nomes_dvds.get(i));
            System.out.println("Cod.: " + codigos_dvds.get(i));
            System.out.println("Nº. faixas: " + nFaixas_dvds.get(i));
            System.out.printf("Preço: %.2f\n", precos_dvds.get(i));
        }
        System.out.println("-----------------------------------");
    }
}
