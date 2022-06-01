package br.unit.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cd extends Midia{
    List<Integer> codigos_cds = new ArrayList<>();
    List<String> nomes_cds = new ArrayList<>();
    List<Double> precos_cds = new ArrayList<>();
    List<Integer> nFaixas_cds = new ArrayList<>();


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

        nomes_cds.add(this.getNome());
        codigos_cds.add(this.getCodigo());
        precos_cds.add(this.getPreco());
        nFaixas_cds.add(this.getNumero_de_faixas());
    }

    @Override
    public void mostrar_cadastros() {
        for (int i=0; i<nomes_cds.size();i++) {
            System.out.println("-----------------------------------");
            System.out.println("Disco: " + nomes_cds.get(i));
            System.out.println("Cod.: " + codigos_cds.get(i));
            System.out.println("Nº. faixas: " + nFaixas_cds.get(i));
            System.out.printf("Preço: %.2f\n", precos_cds.get(i));
        }
        System.out.println("-----------------------------------");
    }
}
