package Problema7;
import java.util.Random;

public class Jogo {
    // private int leitorCartaoMagnetico; / private String monitorLCD;
    Random random = new Random();
 
    int tiqueteAleatorio = random.nextInt(101) + 1;

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
        System.out.println("Tickets");
        usarCartao.adicionarCredito((int) (Math.random() * 100)); 
    }

}
