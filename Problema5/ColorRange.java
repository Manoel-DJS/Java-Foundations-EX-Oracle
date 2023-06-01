package Problema5;
import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS

        System.out.println(" *Determinando a cor no espectro visível* \n");

        System.out.println("Digite o código para determinar a cor do espectro: ");
        double codEspectro = scanner.nextDouble();
        String cor = "";
        scanner.close();

        // PROCESSAMENTO
        if(codEspectro >= 380 && codEspectro <=450){
            cor = "A cor é Violeta";
        } else if(codEspectro > 450 && codEspectro <=495){
            cor = "A cor é Azul";
        } else if(codEspectro > 495 && codEspectro <=570){
            cor = "A cor é Verde";
        } else if(codEspectro > 570 && codEspectro <=590){
            cor = "A cor é Amarelo";
        } else if(codEspectro > 590 && codEspectro <=620){
            cor = "A cor é Laranja";
        } else if(codEspectro > 620 && codEspectro <=720){
            cor = "A cor é Vermelho";
        } else{
            cor = "O comprimento de onda inserido não faz parte do espectro visível";
        }

        // SAÍDA

        System.out.println(cor);
    }
}
