import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConversorMoeda conversorMoeda = new ConversorMoeda();


        System.out.println("Seja bem-vindo(a) ao Conversor de Moeda :)");
        System.out.println("Escolha uma opção válida:");
        System.out.println();
        System.out.println("1) Dólar =>> Peso Argentino");
        System.out.println("2) Peso Argentino =>> Dolar");
        System.out.println("3) Dólar =>> Real Brasileiro");
        System.out.println("4) Real Brasileiro =>> Dólar");
        System.out.println("5) Dólar =>> Peso Colombiano");
        System.out.println("6) Peso Colombiano =>> Dólar");
        System.out.println("7) Sair");
    }
}