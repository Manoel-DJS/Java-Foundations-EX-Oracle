package Problema7;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProgramaFliperama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Terminal teste = new Terminal();

        // 2 Instancias Cartao
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);

        System.out.println("Digite um valor para o dinheiro(i): ");
       // int dinheiro = scanner.nextInt();

        System.out.println("Digite um valor para o dinheiro(2): ");
       // int dinheiro2 = scanner.nextInt();

        teste.adicionarCreditosViaDinheiro(cartao1, 300);
        teste.adicionarCreditosViaDinheiro(cartao2, 200);

        System.out.println("VAlor de credito " + cartao1.getSaldoCredito());
        
        System.out.println("VAlor de credito " + cartao2.getSaldoCredito());

        // 2 Instancias Jogos

        Jogo jogo1 = new Jogo("Jogo 1", 5);
        Jogo jogo2 = new Jogo("Jogo 2", 8);

        CategoriaPremio premio1 = new CategoriaPremio("Prêmio 1", 10, 3);
        CategoriaPremio premio2 = new CategoriaPremio("Prêmio 2", 15, 5);
        CategoriaPremio premio3 = new CategoriaPremio("Prêmio 3", 20, 2);
        List<CategoriaPremio> categoriasPremios = Arrays.asList(premio1, premio2, premio3);


    }
}
