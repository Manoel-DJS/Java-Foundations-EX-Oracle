package Problema7;
import java.util.Random;

public class Jogo {
    private int leitorCartaoMagnetico;
    private String monitorLCD;

    Cartao cartao1 = new Cartao();

    Random random = new Random();
    
    int tiqueteAleatorio = random.nextInt(101) + 1;

    public void passarCartao(){
        cartao1.setSaldoAtual(-1);
        cartao1.setSaldoTiquetes(tiqueteAleatorio);
    }
}
