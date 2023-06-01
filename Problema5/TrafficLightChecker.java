package Problema5;
import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADO

        System.out.println("Digite a cor atual: ");
        int currentColor = scanner.nextInt();

        scanner.close();
        
        String TrafficLight ="";

        // PROCESSAMENTO

        if(currentColor == 1){
            TrafficLight = "Next Traffic Light is Green";
        } else if(currentColor == 2){
            TrafficLight = "Next Traffic Light is Yellow";
        } else if(currentColor == 3){
            TrafficLight = "Next Traffic Light is Red";
        } else{
            TrafficLight = "Invalid color";
        }

        // SAÍDA

        System.out.println(TrafficLight);
        
    }
}
