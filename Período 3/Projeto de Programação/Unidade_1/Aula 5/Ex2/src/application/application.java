package application;

import br.unit.entities.Cd;
import br.unit.entities.Dvd;
import br.unit.entities.Midia;

import java.util.Scanner;

public class application {
    public static void main(String[] args){
        Midia cd = new Cd();
        Midia dvd = new Dvd();

        int action;
        int counter = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("__________________________");
            System.out.println("|    Compact Locadora    |");
            System.out.println("--------------------------");
            System.out.println("Usuário: Adm\n");
            System.out.println("[ 1 ] CD");
            System.out.println("[ 2 ] DVD");
            System.out.println("[ 0 ] Sair");

            System.out.print("> ");
            action = sc.nextInt();

            if (action == 1){
                while (true) {
                    System.out.println("\n\n[ 1 ] Cadastrar");
                    System.out.println("[ 2 ] Listar cadastrados");
                    System.out.println("[ 0 ] <- Voltar");

                    System.out.print("> ");
                    action = sc.nextInt();

                    if (action == 0) {
                        break;
                    } else if (action == 1) {
                        cd.cadastro(counter);
                        counter += 1;
                    } else if (action == 2) {
                        cd.mostrar_cadastros();
                        counter += 1;
                    }
                }
            }

            else if (action == 2){
                while (true) {
                    System.out.println("\n\n[ 1 ] Cadastrar");
                    System.out.println("[ 2 ] Listar cadastrados");
                    System.out.println("[ 0 ] <- Voltar");

                    System.out.print("> ");
                    action = sc.nextInt();

                    if (action == 0) {
                        break;
                    } else if (action == 1) {
                        dvd.cadastro(counter);
                        counter += 1;
                    } else if (action == 2) {
                        dvd.mostrar_cadastros();
                        counter += 1;
                    }
                }
            }

            else if (action == 0){
                break;
            }
        }
    }
}
