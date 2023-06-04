package Problema7;

import java.util.Scanner;

public class ProgramaFliperama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2 Instancias Cartao
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);

        System.out.println("Digite um valor para o dinheiro(i): ");
       // int dinheiro = scanner.nextInt();

        System.out.println("Digite um valor para o dinheiro(2): ");
       // int dinheiro2 = scanner.nextInt();

        Terminal.adicionarCreditosViaDinheiro(cartao1, 300);
        Terminal.adicionarCreditosViaDinheiro(cartao2, 200);

        cartao1.setSaldoTickets(3000);

        System.out.println("VAlor de credito " + cartao1.getSaldoCredito());
        
        System.out.println("VAlor de credito " + cartao2.getSaldoCredito());

        // 2 Instancias Jogos

        Jogo Cassino = new Jogo("Jogo dos Tíquetes Aleatórios", 5);
        Jogo jogo2 = new Jogo("Jogo 2", 8);

        CategoriaPremio Ursinho = new CategoriaPremio("Ursinho de pelucia", 10, 3);
        CategoriaPremio Bolinha = new CategoriaPremio("Bolinha de bola mesmo", 15, 5);
        CategoriaPremio Megazordi = new CategoriaPremio("Megazordi do power rangers", 20, 2);

        Terminal.lerCartao(cartao2);
        Terminal.lerCartao(cartao1);

                                
        Cassino.jogar(cartao1);
        Cassino.jogar(cartao1);
        Cassino.jogar(cartao1);

        Terminal.transferirCreditosOutroCartao(cartao1, 30, cartao2);

        Terminal.lerCartao(cartao2);
        Terminal.lerCartao(cartao1);


        Terminal.trocarTicketsPremio(cartao1, Megazordi); // solicitar premio



    }
}
