package Problema6;
import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        int num = scanner.nextInt();

        System.out.println(""); // Espaço / quebra de linha / pular linha
        
        scanner.close();

        for(int c = 1; c <= 12; c++){
            System.out.printf("%d x %d = %d \n", c, num, c*num);
        }
    }
}
