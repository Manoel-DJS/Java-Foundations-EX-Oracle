package Problema5;
import java.util.Scanner;

// !Pronto!

public class TrafficLightCheckerS { // Usando a instrução switch.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADO

        System.out.println("Digite a cor atual: ");
        int currentColor = scanner.nextInt();

        scanner.close();
        
        String TrafficLight ="";

        // PROCESSAMENTO

        switch(currentColor){
            case 1: 
                TrafficLight = "Next Traffic Light is Green";
                break;

            case 2:
                TrafficLight = "Next Traffic Light is Yellow";
                break;
                
            case 3:
                TrafficLight = "Next Traffic Light is Red";
                break;

            default: 
                TrafficLight = "Invalid color // Digite um número válido!";
                break;
        }

        // SAÍDA

        System.out.println(TrafficLight);
        
    }
}
