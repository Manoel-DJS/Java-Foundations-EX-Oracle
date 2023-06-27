package Problema4;
import java.util.Scanner;

// !Pronto!

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputeMethods cm = new ComputeMethods();

        System.out.println("");
        System.out.println("Digite uma temperatura em Fahrenheit");
        double degreesF = scanner.nextDouble();

        double fCelsius = cm.fToC(degreesF);

        System.out.println("Convertendo a temperatura fornecida de Fahrenheit para Celsius fica: " + fCelsius + "\n");

        System.out.println("Digite o valor do lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o valor do lado 2: ");
        int lado2 = scanner.nextInt();
        
        double hipotenusa = cm.hypotenuse(lado1,lado2);
        System.out.println("Valor da hipotenusa fica " + hipotenusa + "\n");
  
        int somaDados = cm.roll();
        System.out.println("Soma dos dados resulta: " + somaDados);

        scanner.close();
        
    }
}
