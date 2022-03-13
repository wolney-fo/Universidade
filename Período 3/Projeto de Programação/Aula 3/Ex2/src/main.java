import java.util.Scanner;

class Empresa{
    private String razao_social;
    private String cnpj;
    private double salario;

    private String[] nomes_funcionarios;
    private String[] cpf_funcionarios;
    private double[] salarios_funcionarios;

    private int qtd_de_funcionarios;

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String[] getNomes_funcionarios() {
        return nomes_funcionarios;
    }

    public void setNomes_funcionarios(String[] nomes_funcionarios) {
        this.nomes_funcionarios = nomes_funcionarios;
    }

    public String[] getCpf_funcionarios() {
        return cpf_funcionarios;
    }

    public void setCpf_funcionarios(String[] cpf_funcionarios) {
        this.cpf_funcionarios = cpf_funcionarios;
    }

    public double[] getSalarios_funcionarios() {
        return salarios_funcionarios;
    }

    public void setSalarios_funcionarios(double[] salarios_funcionarios) {
        this.salarios_funcionarios = salarios_funcionarios;
    }

    public int getQtd_de_funcionarios() {
        return qtd_de_funcionarios;
    }

    public void setQtd_de_funcionarios(int qtd_de_funcionarios) {
        this.qtd_de_funcionarios = qtd_de_funcionarios;
    }


    // Métodos

    Scanner input = new Scanner(System.in);

    public void adicionar_funcionario(){
        System.out.print("Qtd. funcionários: ");
        int qtd_de_funcionarios_a_adicionar = input.nextInt();
        input.nextLine();

        String[] nomes_funcionarios;
        String[] cpf_funcionarios;
        double[] salarios_funcionarios;

        nomes_funcionarios = new String[qtd_de_funcionarios_a_adicionar];
        cpf_funcionarios = new String[qtd_de_funcionarios_a_adicionar];
        salarios_funcionarios = new double[qtd_de_funcionarios_a_adicionar];


        for (int i = 0; i < qtd_de_funcionarios_a_adicionar; i++){
            Funcionario funcionario = new Funcionario();

            System.out.print("\nNome: ");
            String nome = input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            funcionario.setNome(nome);
            funcionario.setCpf(cpf);
            funcionario.setSalario(this.salario);

            nomes_funcionarios[i] = funcionario.getNome();
            cpf_funcionarios[i] = funcionario.getCpf();
            salarios_funcionarios[i] = funcionario.getSalario();
        }

        this.setNomes_funcionarios(nomes_funcionarios);
        this.setCpf_funcionarios(cpf_funcionarios);
        this.setSalarios_funcionarios(salarios_funcionarios);

        this.setQtd_de_funcionarios(qtd_de_funcionarios_a_adicionar);

    }

    public void listar_funcionarios(){
        for (int i = 0; i < this.getQtd_de_funcionarios(); i++){
            System.out.println("\n--------------------------------------");

            System.out.printf("Nome: %s", this.nomes_funcionarios[i]);
            System.out.printf("\nCPF: %s", this.cpf_funcionarios[i]);
            System.out.printf("\nSalário: R$%.2f", this.salarios_funcionarios[i]);
        }
        System.out.println("\n--------------------------------------");
    }
}

class Funcionario{
    private String nome;
    private String cpf;
    private Double salario;


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}


public class main {
    public static void main(String[] args){
        Empresa empresa = new Empresa();

        empresa.setRazao_social("Banco do Brasil S.A");
        empresa.setCnpj("00.000.000/0001-91");
        empresa.setSalario(3022.27);

        System.out.printf("%s\n----------------------\nSetor: RH\nFunção: Listar novos funcionários\nSalário: R$%.2f\n\n", empresa.getRazao_social(), empresa.getSalario());

        empresa.adicionar_funcionario();
        empresa.listar_funcionarios();
    }
}
