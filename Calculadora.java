import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) à calculadora!");
        System.out.println("Por favor, insira o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Por favor, insira o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                double soma = numero1 + numero2;
                System.out.println("O resultado da soma é: " + soma);
                break;
            case 2:
                double subtracao = numero1 - numero2;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;
            case 3:
                double multiplicacao = numero1 * numero2;
                System.out.println("O resultado da multiplicação é: " + multiplicacao);
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.println("O resultado da divisão é: " + divisao);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
