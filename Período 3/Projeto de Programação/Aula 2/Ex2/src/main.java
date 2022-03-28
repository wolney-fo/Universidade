import java.util.Scanner;

class main {
    public static void main(String[] args) {

        char operator;
        double num1, num2, result;

        Scanner input = new Scanner(System.in);

        // Operator
        System.out.println("Escolha uma operação (+, -, *, /): ");
        operator = input.next().charAt(0);

        // Number 1
        System.out.println("Número 1: ");
        num1 = input.nextDouble();

        // Number 2
        System.out.println("Número 2:");
        num2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Erro: operação inválida!");
                break;
        }

        input.close();
    }
}
