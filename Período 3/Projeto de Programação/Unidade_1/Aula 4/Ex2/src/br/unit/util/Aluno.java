package br.unit.util;

import java.util.Scanner;

public class Aluno {
    private static String name;
    private static double nota1;
    private static double nota2;
    private static double nota3;

    private static int qtd_alunos;
    private static String[] nomes_alunos;
    private static double[][] notas;



    public static boolean register_students(){
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nQtd. alunos: ");
        setQtd_alunos(input.nextInt());
        input.nextLine();

        setNomes_alunos(new String[getQtd_alunos()]);

        for (int i = 0; i < getQtd_alunos(); i++) {
            System.out.print("Nome: ");
            String nome = input.nextLine();

            nomes_alunos[i] = nome;
        }
        notas = new double[qtd_alunos][4];


        return true;
    }

    public static void auto_insert_grades(){
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nINSERIR NOTAS DE TODOS OS ALUNOS:\n\n");

        for (int i = 0; i< getQtd_alunos(); i++){
            System.out.printf("\nAluno: %s\n", getNomes_alunos()[i]);
            System.out.print("Insira as notas:\n\n");

            System.out.print("Unidade 1:");
            nota1 = input.nextDouble();

            System.out.print("Unidade 2:");
            nota2 = input.nextDouble();

            System.out.print("Unidade 3:");
            nota3 = input.nextDouble();

            getNotas()[i][0] = nota1;
            getNotas()[i][1] = nota2;
            getNotas()[i][2] = nota3;
            getNotas()[i][3] = (nota1 + nota2 + nota3) / 3;
        }
    }

    public static void manually_insert_grades(){
        Scanner input = new Scanner(System.in);
        int num_aluno;

        System.out.print("\n\nINSERIR NOTAS MANUALMENTE:\n\n");

        do{
            System.out.print("Número do aluno: ");
            num_aluno = input.nextInt();
        } while ((getNomes_alunos()[num_aluno] == null) && (0 > num_aluno) && (num_aluno > getQtd_alunos()));


        System.out.printf("\nAluno: %s\n", getNomes_alunos()[num_aluno]);
        System.out.print("Insira as notas:\n\n");

        System.out.print("Unidade 1:");
        nota1 = input.nextDouble();

        System.out.print("Unidade 2:");
        nota2 = input.nextDouble();

        System.out.print("Unidade 3:");
        nota3 = input.nextDouble();

        getNotas()[num_aluno][0] = nota1;
        getNotas()[num_aluno][1] = nota2;
        getNotas()[num_aluno][2] = nota3;
        getNotas()[num_aluno][3] = (nota1 + nota2 + nota3) / 3;

    }

    public static void show_students(){
        System.out.println("\n\nRELATÓRIO DE ALUNOS");
        System.out.println("Nome   /   Unidade 1   /   Unidade 2   /   Unidade 3   /   Média Final");
        System.out.println("-----------------------------------------------------------------------");
         for (int i=0; i<qtd_alunos; i++){
             System.out.printf("%s / %.1f / %.1f / %.1f / %.1f\n", getNomes_alunos()[i], getNotas()[i][0], getNotas()[i][1], getNotas()[i][2], getNotas()[i][3]);
             System.out.println("------------------------------------------");
         }
    }

    public static String[] getNomes_alunos() {
        return nomes_alunos;
    }

    public static void setNomes_alunos(String[] nomes_alunos) {
        Aluno.nomes_alunos = nomes_alunos;
    }

    public static int getQtd_alunos() {
        return qtd_alunos;
    }

    public static void setQtd_alunos(int qtd_alunos) {
        Aluno.qtd_alunos = qtd_alunos;
    }

    public static double[][] getNotas() {
        return notas;
    }

    public static void setNotas(double[][] notas) {
        Aluno.notas = notas;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Aluno.name = name;
    }
}
