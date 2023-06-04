package Problema7;

public class Terminal {

    public static void adicionarCreditosViaDinheiro(Cartao cartao, int valorDinheiro) { // pega o numero do cartão 1 ou 2
        double valorCreditos = valorDinheiro * 2.0; // Conversão de 2 créditos para cada 1 dólar
        cartao.adicionarCredito(valorCreditos);
        System.out.println("Créditos adicionados ao cartão " + cartao.getNumero() + ": " + valorCreditos);
        System.out.println("COMANDO REALIZADO!");
    }

    public static void transferirCreditosOutroCartao(Cartao cartaoTransferir, int valorCredito1, Cartao cartaoReceber){
        if(cartaoTransferir.getSaldoCredito() > valorCredito1){
            cartaoReceber.adicionarCredito(valorCredito1);
            cartaoTransferir.adicionarCredito(valorCredito1*-1);
            System.out.println("\n!Operação realizada!");
        } else{
            System.out.println("Operação não realizada");
            System.out.println("Creditos insuficientes");
        }
    }

    public static void trocarTicketsPremio(Cartao cartao, CategoriaPremio premio){
        if(cartao.getSaldoTickets() >= premio.getTicketsObrigatorios()){
            cartao.adicionarCredito((premio.getTicketsObrigatorios())*1);
            System.out.println("\n!Operação realizada!");
            System.out.println("Premio: " + premio.getNome());
        } else{
            System.out.println("ErROR");
        }

    }

    public static void lerCartao(Cartao cartao) {
        System.out.println("Cartão " + cartao.getNumero() + " lido com sucesso.");
        System.out.println("Saldo de crédito: " + cartao.getSaldoCredito());
        System.out.println("Saldo de tíquetes: " + cartao.getSaldoTickets());
    }


}