/** 

1. Converte a temperatura fornecida de Fahrenheit para Celsius.

2. Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados.

3. Simula o giro de dois dados de seis lados e exibe a soma deles.

C=5/9*(F-32)
**/

package Problema4;
import java.util.Random;

public class ComputeMethods {
    public int roll() {
        Random geradorNum = new Random();
        int dado1 = geradorNum.nextInt(6) + 1;
        int dado2 = geradorNum.nextInt(6) + 1;
        return dado1 + dado2;
    }

    public double hypotenuse(int a, int b) {
        double res = a*a + b*b;
        res = Math.sqrt(res);
        return res;
    }

    public double fToC(double graus) { // valor teste 100,4
        return  (graus - 32) * 5 / 9;
    }

}
