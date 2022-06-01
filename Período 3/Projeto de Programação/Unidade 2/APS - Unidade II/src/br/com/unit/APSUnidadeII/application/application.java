package br.com.unit.APSUnidadeII.application;

import br.com.unit.APSUnidadeII.model.entities.Conta;
import br.com.unit.APSUnidadeII.model.entities.ContaCorrente;
import br.com.unit.APSUnidadeII.model.entities.ContaPoupanca;

import java.util.InputMismatchException;
import java.util.Scanner;


public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        Conta conta = null;

        double selic = 12.75;

        // Escolher o tipo da conta
        while (true){
            try{
                System.out.println("[ 1 ] Conta Corrente");
                System.out.println("[ 2 ] Conta Poupança");
                System.out.println("[ 0 ] Sair");

                System.out.print("> ");
                option = sc.nextInt();

                if (option == 0){
                    break;
                } else if (option == 1){
                    conta = new ContaCorrente(5000.0);
                    break;
                } else if (option == 2){
                    conta = new ContaPoupanca(5000.0);
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Opção inválida");
            }
            catch (Exception e){
                System.out.println("Ops. Parece que algo deu errado. 🧐");
            }
        }

        option = 5;

        // Ações
        while (true){
            try{
                System.out.println("");
                System.out.println("[ 1 ] Depósito");
                System.out.println("[ 2 ] Saque");
                System.out.println("[ 3 ] Saldo na tela");
                System.out.println("[ 4 ] Rendimento");
                System.out.println("[ 0 ] Cancelar");

                System.out.print("> ");
                option = sc.nextInt();

                if (option == 0){
                    break;
                }
                else if (option == 1){
                    System.out.println("\n\nValor do depósito: R$");
                    double valor_deposito = sc.nextDouble();
                    conta.deposito(valor_deposito);
                }
                else if (option == 2){
                    System.out.println("\n\nValor do saque: R$");
                    double valor_saque = sc.nextDouble();
                    conta.saque(valor_saque);
                }
                else if (option == 3){
                    System.out.printf("\n\nSaldo atual: R$%.2f", conta.getSaldo());
                }
                else if (option == 4){
                    System.out.printf("\n\nSaldo anterior: R$%.2f \n", conta.getSaldo());
                    conta.rendimento(selic);
                    System.out.printf("Saldo atual: R$%.2f", conta.getSaldo());
                }
            }

            catch (InputMismatchException e){
                System.out.println("Opção inválida");
            }
            catch (Exception e){
                System.out.println("Ops. Parece que algo deu errado. 🧐");
            }
        }
        sc.close();
    }
}
