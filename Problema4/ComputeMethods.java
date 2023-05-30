/** 

1. Converte a temperatura fornecida de Fahrenheit para Celsius.

2. Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados.

3. Simula o giro de dois dados de seis lados e exibe a soma deles.

C=5/9*(F-32)
**/


package Problema4;
import java.util.Random;

import java.util.Scanner;

public class ComputeMethods {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Digite uma temperatura em Fahrenheit");
        double degreesF = scanner.nextDouble();

        double fCelsius = fToC(degreesF);

        System.out.println("Convertendo a temperatura fornecida de Fahrenheit para Celsius fica: " + fCelsius);

        System.out.println("Digite o valor do lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o valor do lado 2: ");
        int lado2 = scanner.nextInt();
        
        double hipotenusa = hypotenuse(lado1,lado2);
        System.out.println("Valor da hipotenusa fica " + hipotenusa);
  
        int somaDados = roll();
        System.out.println("Soma dos dados resulta: " + somaDados);

        scanner.close();
        
    }



    private static int roll() {
        Random geradorNum = new Random();
        int dado1 = geradorNum.nextInt(6) + 1;
        int dado2 = geradorNum.nextInt(6) + 1;
        return dado1 + dado2;
    }



    private static double hypotenuse(int a, int b) {
        double res = a*a + b*b;
        res = Math.sqrt(res);
        return res;
    }

    public static double fToC(double graus) { // valor teste 100,4
        return  (graus - 32) * 5 / 9;
    }

}
