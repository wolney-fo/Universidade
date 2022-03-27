package application;

import br.unit.entities.Comissionado;
import br.unit.entities.Funcionario;
import br.unit.entities.Assalariado;
import br.unit.entities.Horista;

import java.util.Scanner;

public class application {
    public static void main(String[] args){
        Funcionario assalariado = new Assalariado();
        Funcionario comissionado = new Comissionado();
        Funcionario horista = new Horista();

        int action;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("___________________");
            System.out.println("|    Apple Inc    |");
            System.out.println("-------------------");
            System.out.println("Uso: Calcular pagamento de funcionários");
            System.out.println("Usuário: RH\n");
            System.out.println("[ 1 ] Assalariado");
            System.out.println("[ 2 ] Comissionado");
            System.out.println("[ 3 ] Horista");
            System.out.println("[ 0 ] Sair");

            System.out.print("> ");
            action = sc.nextInt();

            if (action == 1){
                assalariado.cadastro();
            }
            else if (action == 2){
                comissionado.cadastro();
            }
            else if (action == 3){
                horista.cadastro();
            }
            else if (action == 0){
                break;
            }
        }
    }
}
