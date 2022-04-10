package entities;

import java.util.ArrayList;
import java.util.List;


public abstract class Cliente {
    private int cn;
    private String name;
    private String phone;

    private List<String> clients_names = new ArrayList<>();
    private List<String> clients_phones = new ArrayList<>();
    private List<Integer> clients_cn = new ArrayList<>();

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getClients_names() {
        return clients_names;
    }

    public void setClients_names(ArrayList<String> clients_names) {
        this.clients_names = clients_names;
    }

    public List<String> getClients_phones() {
        return clients_phones;
    }

    public void setClients_phones(ArrayList<String> clients_phones) {
        this.clients_phones = clients_phones;
    }

    public List<Integer> getClients_cn() {
        return clients_cn;
    }

    public void setClients_cn(ArrayList<Integer> clients_cn) {
        this.clients_cn = clients_cn;
    }

    public abstract void cadastrarCliente();
    public abstract void listarClientes();

}
