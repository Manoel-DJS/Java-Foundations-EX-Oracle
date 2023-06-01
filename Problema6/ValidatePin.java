package Problema6;
import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um PIN válido");
        int PINvalido = scanner.nextInt();

        System.out.println("Digite o PIN corretamente");
        int testePIN = scanner.nextInt();

        // Processamento
        while(PINvalido != testePIN){
            System.out.println("PIN incorreto");
            System.out.println("Digite novamente: ");
            testePIN = scanner.nextInt();
        }
        
        scanner.close();

        // SAIDA
        System.out.println("\nPIN INSERIDO CORRETAMENTE");
        System.out.println("Acesso a conta!");

    }
}
