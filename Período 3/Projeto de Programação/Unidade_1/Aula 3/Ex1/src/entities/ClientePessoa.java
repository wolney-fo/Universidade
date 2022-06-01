package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientePessoa extends Cliente {
    private int age;

    private List<Integer> clients_ages = new ArrayList<>();


    public int getAge() {
        return age;
    }

    public void setIdade(int age) {
        this.age = age;
    }

    public List<Integer> getClients_ages() {
        return clients_ages;
    }

    public void setIdades_clientes(List<Integer> clients_ages) {
        this.clients_ages = clients_ages;
    }


    @Override
    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------");

            System.out.print("CPF: ");
            int cn = sc.nextInt();
            sc.nextLine();

            if (cn == 0){
                break;
            }

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Telefone: ");
            String phone = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();


            getClients_names().add(name);
            getClients_cn().add(cn);
            getClients_phones().add(phone);
            getClients_ages().add(age);
        }
        System.out.println("---------------------------------------------");
    }

    @Override
    public void listarClientes() {
        for (int i=0; i<getClients_cn().size();i++){
            System.out.println("---------------------------------------------");
            System.out.println("Nome: " + getClients_names().get(i));
            System.out.println("CPF: " + getClients_cn().get(i));
            System.out.println("Idade: " + getClients_ages().get(i));
            System.out.println("Telefone: " + getClients_phones().get(i));
        }
        System.out.println("---------------------------------------------");
    }
}
