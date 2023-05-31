package Problema4;
import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        scanner.close();

        // Encontra a posição do último espaço em branco na string
        int ultimoEspaco = name.lastIndexOf(" ");

        // último nome e a primeira inicial
        String ultimoNome = name.substring(ultimoEspaco +1); // mais 1 para pular o espaço
        char primeiraLetra = name.charAt(0);

        System.out.println(ultimoNome + ", " + primeiraLetra);

    }
}
