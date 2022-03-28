import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String nome, resultado;
        int idade, numero_de_pessoas;
        double peso, altura, imc;

        System.out.println("Número de pessoas: ");
        numero_de_pessoas = input.nextInt();

        input.nextLine();

        for (int i = 0; i < numero_de_pessoas; i++) {
            // input
            System.out.println("Nome: ");
            nome = input.nextLine();

            System.out.println("Idade: ");
            idade = input.nextInt();

            System.out.println("Peso: ");
            peso = input.nextDouble();

            System.out.println("Altura: ");
            altura = input.nextDouble();

            // Calculo
            imc = peso / (altura * altura);

            // IMC
            if (imc < 18.5) {
                resultado = "Abaixo do peso";
            } else if (imc < 24.9) {
                resultado = "Peso ideal";
            } else if (imc < 29.9) {
                resultado = "Obesidade Grau I";
            } else if (imc < 39.9) {
                resultado = "Obesidade Grau II";
            } else {
                resultado = "Obesidade Grau III";
            }

            // Print
            System.out.printf("\nNome: %s\n", nome);
            System.out.printf("Idade: %d\n", idade);
            System.out.printf("IMC: %.2f\n", imc);
            System.out.printf("Resultado: %s\n\n", resultado);

            input.nextLine();

        }
    }
}
