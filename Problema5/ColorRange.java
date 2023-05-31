package Problema5;
import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" *Determinando a cor no espectro visível* \n");

        System.out.println("Digite o código para determinar a cor do espectro: ");
        double codEspectro = scanner.nextDouble();
        String cor = "";
        scanner.close();

        if(codEspectro >= 380 && codEspectro <=450){
            cor = "Violeta";
        } else if(codEspectro > 450 && codEspectro <=495){
            cor = "Azul";
        } else if(codEspectro > 495 && codEspectro <=570){
            cor = "Verde";
        } else if(codEspectro > 570 && codEspectro <=590){
            cor = "Amarelo";
        } else if(codEspectro > 590 && codEspectro <=620){
            cor = "Laranja";
        } else if(codEspectro > 620 && codEspectro <=720){
            cor = "Vermelho";
        } else{
            cor = "Não é pode ser visualizada";
        }

        System.out.println("A cor é " + cor);
    }
}
