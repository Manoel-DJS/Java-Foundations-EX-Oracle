package Problema7;
import java.util.Scanner;

public class ProgramaFliperama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Terminal teste = new Terminal();

        // 2 Instancias Cartao
        Cartao cartao1 = new Cartao();
        Cartao cartao2 = new Cartao();

        System.out.println("Digite um valor para o dinheiro(i): ");
       // int dinheiro = scanner.nextInt();

        teste.setDinheiro(30);
        teste.converterCredito(2);

        System.out.println(cartao1.getSaldoAtual());
    }
}
