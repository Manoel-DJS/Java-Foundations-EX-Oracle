package Problema7;

public class ProgramaFliperama {
    public static void main(String[] args) {

        // 2 Instancias Cartao
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);

       // Carregando os créditos em cada cartão.
        Terminal.adicionarCreditosViaDinheiro(cartao1, 100);
        Terminal.adicionarCreditosViaDinheiro(cartao2, 100);

       // usando hascki cartao1.setSaldoTickets(3000);

        System.out.println("VAlor de credito " + cartao1.getSaldoCredito());
        
        System.out.println("VAlor de credito " + cartao2.getSaldoCredito());

        // 2 Instancias Jogos

        Jogo Cassino = new Jogo("Jogo dos Tíquetes Aleatórios", 25);
        Jogo Foguetinho = new Jogo("Jogo do Foguetinho da Tristeza", 30);

        Terminal.lerCartao(cartao1);
        Terminal.lerCartao(cartao2);

        // Jogue um grupo de jogos usando dois cartões.
                                
        Cassino.jogar(cartao1);
        Cassino.jogar(cartao2);
        Foguetinho.jogar(cartao1);
        Foguetinho.jogar(cartao2);

        Terminal.lerCartao(cartao1);
        Terminal.lerCartao(cartao2);

        // Instancias dos premios

        CategoriaPremio Ursinho = new CategoriaPremio("Ursinho de pelucia", 10, 3);
        CategoriaPremio Bolinha = new CategoriaPremio("Bolinha de bola mesmo", 15, 5);
        CategoriaPremio Megazordi = new CategoriaPremio("Megazordi do power rangers", 20, 2);

        // Transfira o saldo de créditos e tíquetes do Cartão 1 para o 2.
        System.out.println("Transferindo créditos");
        Terminal.transferirCreditosOutroCartao(cartao1, 30, cartao2);

        Terminal.lerCartao(cartao1);
        Terminal.lerCartao(cartao2);

        Terminal.trocarTicketsPremio(cartao1, Bolinha); // solicitar premio

        Terminal.lerCartao(cartao1);

        
        Terminal.trocarTicketsPremio(cartao1, Megazordi); // solicitar premio
        Terminal.trocarTicketsPremio(cartao2, Megazordi); // solicitar premio
        Terminal.trocarTicketsPremio(cartao2, Ursinho); // solicitar premio

        System.out.println("");
        
        Terminal.lerCartao(cartao1);
        Terminal.lerCartao(cartao2);


    }
}
