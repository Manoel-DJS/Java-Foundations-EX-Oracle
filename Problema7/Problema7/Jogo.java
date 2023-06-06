package Problema7;

public class Jogo {
    // private int leitorCartaoMagnetico; / private String monitorLCD;

    private String nomeJogo;
    private int creditos;

    public Jogo(String nome, int creditos) {
        this.nomeJogo = nome;
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void jogar(Cartao usarCartao) {
        // Gere um número aleatório não negativo de tíquetes
        System.out.println("!Jogando!");
        usarCartao.setSaldoTickets((int) (Math.random() * 500));
        // subtrair credito
    }

}
