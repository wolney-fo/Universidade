package application;

import java.util.Scanner;
import br.unit.util.Aluno;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean registered_students = false;

        while (true){
            // Show menu
            System.out.println("\n\nEscola de Hill Valley");
            System.out.printf("Setor: Coordenação\n\n");
            System.out.println("[ 1 ] Cadastrar alunos");
            System.out.println("[ 2 ] Inserir notas");
            System.out.println("[ 3 ] Listar alunos");
            System.out.println("[ 0 ] Sair");

            int action;
            do{
                System.out.print("(1/2/3/0)> ");
                action = input.nextInt();
            } while ((action != 1) && (action != 2) && (action != 0) && (action != 3));

            boolean end_program = false;

            switch (action){
                case 1:
                    registered_students = Aluno.register_students();
                    break;
                case 2:
                    String[] x = Aluno.getNomes_alunos();
                    if (registered_students == false){
                        System.out.println("\nNenhum aluno encontrado. Cadastre os alunos antes de continuar!");
                        break;
                    }
                    else{
                        System.out.println("\n\n\n\n\nINSERIR NOTAS\n");
                        System.out.println("[ 1 ] Inserir todas as notas");
                        System.out.println("[ 2 ] Inserir manualmente");
                        System.out.println("[ 0 ] Voltar");

                        do{
                            System.out.print("(1/2/0)> ");
                            action = input.nextInt();
                        } while ((action < 0) && (action > 2));

                        if (action == 0){
                            break;
                        }
                        else if (action == 1){
                            Aluno.auto_insert_grades();
                            break;
                        }
                        else {
                            Aluno.manually_insert_grades();
                            break;
                        }
                    }
                case 3:
                    Aluno.show_students();
                    break;

                case 0:
                    end_program = true;
                    break;
            }

            if (end_program == true){
                break;
            }
        }
    }
}
