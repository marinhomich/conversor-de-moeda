import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moeda moeda = new Moeda();

        String opcao = "";

        while (!opcao.equalsIgnoreCase("7")) {
            System.out.println("*********************************");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda :)");
            System.out.println();
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dolar");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("*********************************");

            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("7")) {
                break;
            }

            System.out.println("Digite o valor que deseja converter:");
            int amount = scanner.nextInt();


            switch (opcao) {
                case "1":
                    System.out.println(moeda.converteMoeda("USD", "ARS", amount));
                    break;
                case "2":
                    System.out.println(moeda.converteMoeda("ARS", "USD", amount));
                    break;
                case "3":
                    System.out.println(moeda.converteMoeda("USD", "BRL", amount));
                    break;
                case "4":
                    System.out.println(moeda.converteMoeda("BRL", "USD", amount));
                    break;
                case "5":
                    System.out.println(moeda.converteMoeda("USD", "COP", amount));
                    break;
                case "6":
                    System.out.println(moeda.converteMoeda("COP", "USD", amount));
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            scanner.nextLine(); // Limpar o buffer do scanner
        }
        scanner.close();
        System.out.println("O programa finalizou corretamente");
    }
}