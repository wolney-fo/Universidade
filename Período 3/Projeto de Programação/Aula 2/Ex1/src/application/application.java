package application;

import java.util.Scanner;

public class application {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("| Calcule a sua média |\n");

        System.out.print("| Unidade 1: ");
        double unidade1 = sc.nextDouble();

        System.out.print("| Unidade 2: ");
        double unidade2 = sc.nextDouble();

        double media = (unidade1 + unidade2) / 2;

        if (media >= 6) {
            System.out.println("\n\n| Aprovado!");
        } else {
            System.out.println("\n\n| Reprovado!");
        }

        System.out.printf("| Sua média é: %.1f", media);

    }
}
