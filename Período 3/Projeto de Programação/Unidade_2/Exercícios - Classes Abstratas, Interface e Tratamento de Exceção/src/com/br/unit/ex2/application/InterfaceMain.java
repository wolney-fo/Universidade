package com.br.unit.ex2.application;

import com.br.unit.ex2.model.entities.Aviao;
import com.br.unit.ex2.model.entities.Barco;
import com.br.unit.ex2.model.entities.Carro;
import com.br.unit.ex2.model.entities.Veiculo;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option = 4;
        int action = 5;

        while (true){
            try{
                while (option < 0 || option > 3) {
                    System.out.println("[ 1 ] Avião");
                    System.out.println("[ 2 ] Carro");
                    System.out.println("[ 3 ] Barco");
                    System.out.println("[ 0 ] Sair\n");

                    System.out.print("> ");
                    option = sc.nextInt();
                }

                if (option == 0){
                    break;
                }

                System.out.println("\n\n\n");

                while (action < 0 || action > 4){
                    System.out.println("[ 1 ] Ligar motor");
                    System.out.println("[ 2 ] Acelerar");
                    System.out.println("[ 3 ] Frear");
                    System.out.println("[ 4 ] Buzinar");
                    System.out.println("[ 0 ] Sair\n");

                    System.out.print("> ");
                    action = sc.nextInt();
                }

                if (action == 0){
                    break;
                }

                // Definir objeto
                Veiculo veiculo;

                if (option == 1){
                    veiculo = new Aviao();
                }
                else if (option == 2){
                    veiculo = new Carro();
                }
                else {
                    veiculo = new Barco();
                }

                // Executar ações
                if (action == 1){
                    veiculo.ligarMotor();
                }
                else if (action == 2){
                    veiculo.acelerar();
                }
                else if (action == 3){
                    veiculo.freiar();
                }
                else {
                    veiculo.buzinar();
                }

                action = 5;
            }

            catch (InputMismatchException e){
                System.out.println("Opção inválida.");
            }
            catch (Exception e){
                System.out.println("Ops. Parece que algo correu mal :/");
            }
        }

    }
}
