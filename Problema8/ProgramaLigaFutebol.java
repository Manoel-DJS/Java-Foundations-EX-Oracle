package Problema8;

import java.util.Scanner;

public class ProgramaLigaFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Equipe barcelona = new Equipe();
        Equipe realmadrid = new Equipe();
        Equipe valladolid = new Equipe();
        Equipe valencia = new Equipe();

        LigaFutebol liga = new LigaFutebol();


        barcelona.setNome("Barcelona");
        realmadrid.setNome("Real Madrid");
        valladolid.setNome("Valladolid");
        valencia.setNome("Valencia");

        double temperatura;
        int p1,p2;
        do{
            System.out.println("Digite a temperatura da semana: ");
            temperatura = scanner.nextDouble();
            System.out.println("Digite o placar do time 1: ");
            p1 = scanner.nextInt();
            System.out.println("Digite o placar do time 2: ");
            p2 = scanner.nextInt();
            Jogo jogoSemana = new Jogo();

            jogoSemana.setPlacarTime1(p1);
            jogoSemana.setPlacarTime2(p2);
            jogoSemana.setTemperatura(temperatura);

            liga.TabelaDeJogos.add(jogoSemana);

        } while(temperatura > 0);

        scanner.close();

        Jogo jogoDeAbertura = new Jogo();

        jogoDeAbertura.setTemperatura(30);
        jogoDeAbertura.setTime1(barcelona);
        jogoDeAbertura.setTime2(realmadrid);


        jogoDeAbertura.setPlacarTime1(3);
        jogoDeAbertura.setPlacarTime2(2);


        liga.TabelaDeJogos.add(jogoDeAbertura);
        
        Jogo partidaFinal = new Jogo();
        
        liga.TabelaDeJogos.add(partidaFinal);
    
        liga.TabelaDeJogos.remove(1);

        System.out.println(
            jogoDeAbertura.getTime1().getNome() + " " +

            jogoDeAbertura.getPlacarTime1() + " x " + jogoDeAbertura.getPlacarTime2() 
            + " " + jogoDeAbertura.getTime2().getNome()
        );



        System.out.println(jogoDeAbertura.getTemperatura());
        System.out.println(barcelona.getNome());
    }
}
