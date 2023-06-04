package Problema7;

public class Terminal {
    private int dinheiro;

    public void adicionarCreditosViaDinheiro(Cartao cartao, int valorDinheiro) { // pega o numero do cartão 1 ou 2
        double valorCreditos = valorDinheiro * 2.0; // Conversão de 2 créditos para cada 1 dólar
        cartao.adicionarCredito(valorCreditos);
        System.out.println("Créditos adicionados ao cartão " + cartao.getNumero() + ": " + valorCreditos);
    }


    public int getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void converterCredito(int dinheiro){

    }

    public class LeitorCartao {
        public void lerCartao(Cartao cartao) {
            System.out.println("Cartão " + cartao.getNumero() + " lido com sucesso.");
            System.out.println("Saldo de crédito: " + cartao.getSaldoCredito());
            System.out.println("Saldo de tíquetes: " + cartao.getSaldoTickets());
        }
    }

}