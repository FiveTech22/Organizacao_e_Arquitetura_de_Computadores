package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Convection convection = new Convection();
        boolean numeroValido = false;
        String numeroDecimal;

        System.out.println("\u001B[33m--- Conversor de Decimal Para Binário ---\u001B[0m\n");
        Scanner sc = new Scanner(System.in);

        while (!numeroValido) {
            System.out.print("Digite um número decimal para conversão: ");
            numeroDecimal = sc.nextLine();

            if (convection.validateDecimal(numeroDecimal)) {
                int decimal = Integer.parseInt(numeroDecimal);
                String binario = convection.decimalToBinary(decimal);
                System.out.println("O número binário correspondente é: " + binario);
                numeroValido = true;
            } else {
                System.out.println("Número decimal inválido. Por favor, insira um número válido.");
            }
        }

        System.out.println("\u001B[33m------Fim------\n");
        System.out.println("\u001B[33m---Desenvolvedores---\u001B[0m");
        System.out.println("\u001B[31mThamyres Cordeiro Freitas – Matrícula: 01517824");
        System.out.println("Bruna Camilly Paulino De Souza Gomes – Matrícula: 01534213");
        System.out.println("Lucas Fernando Paulo Peixoto Moraes de Oliveira – Matrícula: 01522097");
        System.out.println("João Victtor Paulo Peixoto Gomes da Silva – Matrícula: 01516498");
        System.out.println("Selton Alves De Melo – Matrícula: 01528401\u001B[0m");
    }
}
