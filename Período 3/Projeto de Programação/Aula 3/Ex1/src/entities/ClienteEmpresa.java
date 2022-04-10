package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteEmpresa extends Cliente {
    private int inscEstadual;
    private int inscMunicipal;

    private List<Integer> inscEstaduais = new ArrayList<>();
    private List<Integer> inscMunicipais = new ArrayList<>();


    public int getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(int inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getInscMunicipal() {
        return inscMunicipal;
    }

    public void setInscMunicipal(int inscMunicipal) {
        this.inscMunicipal = inscMunicipal;
    }

    public List<Integer> getInscMunicipais() {
        return inscMunicipais;
    }

    public void setInscMunicipais(List<Integer> inscMunicipais) {
        this.inscMunicipais = inscMunicipais;
    }

    public List<Integer> getInscEstaduais() {
        return inscEstaduais;
    }

    public void setInscEstaduais(List<Integer> inscEstaduais) {
        this.inscEstaduais = inscEstaduais;
    }


    @Override
    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------");

            System.out.print("CNPJ: ");
            int cn = sc.nextInt();
            sc.nextLine();

            if (cn == 0){
                break;
            }

            System.out.print("Razão Social: ");
            String name = sc.nextLine();

            System.out.print("Telefone: ");
            String phone = sc.nextLine();

            System.out.print("Inscrição Estadual: ");
            int inscEstadual = sc.nextInt();

            System.out.print("Inscrição Municipal: ");
            int inscMunicipal = sc.nextInt();


            getClients_names().add(name);
            getClients_cn().add(cn);
            getClients_phones().add(phone);
            getInscEstaduais().add(inscEstadual);
            getInscMunicipais().add(inscMunicipal);
        }
        System.out.println("---------------------------------------------");
    }

    @Override
    public void listarClientes() {
        for (int i=0; i<inscMunicipais.size();i++) {
            System.out.println("---------------------------------------------");
            System.out.println("Razão Social: " + getClients_names().get(i));
            System.out.println("CNPJ: " + getClients_cn().get(i));
            System.out.println("Inscrição Estadual: " + getInscEstaduais().get(i));
            System.out.println("Inscrição Municipal: " + getInscMunicipais().get(i));
            System.out.println("Telefone: " + getClients_phones().get(i));
        }
        System.out.println("---------------------------------------------");
    }
}
