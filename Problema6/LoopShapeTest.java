package Problema6;
import java.util.Scanner;

public class LoopShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoopShape func = new LoopShape();

        // ENTRADA DE DADOS

        System.out.println(" *Programa LoopShape* \n");

        System.out.println("Digite a altura do retângulo: ");
        int altura = scanner.nextInt(); 
        System.out.println("Digite a largura  do retângulo: ");
        int largura = scanner.nextInt(); 

        System.out.println("Digite o tamanho de uma perna para o triângulo isósceles: ");
        int tamanhoPerna = scanner.nextInt();

        scanner.close();

        // PROCESSAMENTO
        String retangulo = func.createRectangle(largura, altura);
        String triangulo = func.createTriangle(tamanhoPerna);

        // SAÍDA
        System.out.println("\n!Retângulo!");
        System.out.println(retangulo);
        
        System.out.println("\n!Triângulo!");
        System.out.println("\n" + triangulo);

}
}
