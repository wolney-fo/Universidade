package application;

import br.unit.utils.Pessoa;
import br.unit.utils.PessoaJuridica;

import java.util.Scanner;

public class JuntaComercialSE {
        public static void main(String[] args){
            int action;

            Pessoa pessoa = new PessoaJuridica();

            while (true){
                Scanner input = new Scanner(System.in);

                System.out.println("______________________________________________");
                System.out.println("|     Junta Comercial do Estado de Sergipe    |");
                System.out.println("-----------------------------------------------");
                System.out.println("Uso: Cadastro de pessoas jurídicas");
                System.out.println("Usuário: 07\n");
                System.out.println("[ 1 ] Cadastrar empresa");
                System.out.println("[ 2 ] Visualizar cadastros");
                System.out.println("[ 0 ] Sair");

                System.out.print("> ");
                action = input.nextInt();

                if (action == 0){
                    break;
                }
                else if (action == 1){
                    pessoa.cadastro();
                }
                else if (action == 2){
                    pessoa.mostrar_cadastro();
                }
            }
        }
    }
