package Problema8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProgramaLigaFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] tabelaClassificacao = new int[4][6];

        ArrayList<Jogo> listaJogos = new ArrayList<Jogo>();

        LigaFutebol liga = new LigaFutebol();
        liga.CriarLiga();

        double temperatura;

        int semana = 1;
        int contadorFimTemporada = 3;


        do{

            System.out.println("Digite a temperatura da semana " + semana);
            temperatura = scanner.nextDouble();

            if(temperatura > 15){
                // Se a temperatura estiver quente, programe 2 jogos
                Random rndmzr = new Random();
                
                int resultadoFinalJogo = rndmzr.nextInt(2);

                contadorFimTemporada = 3;

                int T1 = rndmzr.nextInt(4);
                int T2 = rndmzr.nextInt(4);

                liga.equipesLiga.get(T1);
                liga.equipesLiga.get(T2);
                
                int placarT1 = rndmzr.nextInt(5); // placar aleatorio
                int placarT2 = rndmzr.nextInt(5); // pra tirar é facil
               
                Equipe e1 = liga.equipesLiga.get(T2);
                Equipe e2 = liga.equipesLiga.get(T2);

                Jogo jogo1 = new Jogo(placarT1, placarT2, temperatura, e1, e2);
                
                

                jogo1.setTime1(liga.equipesLiga.get(T1));

                placarT1 = rndmzr.nextInt(5);
                placarT2 = rndmzr.nextInt(5);

                Jogo jogo2 = new Jogo(placarT1,placarT2, temperatura, e1, e2);

                                
                jogo2.setTime2(e2);
                
                listaJogos.add(jogo1);
                listaJogos.add(jogo2);
                 

            } else{
                // Se a temperatura estiver congelante, não tem jogo
                contadorFimTemporada --;
            }
            semana++;
        } while(contadorFimTemporada > 0);
        System.out.println("Fim de temporada na semana " + semana);

        scanner.close();

        for(int i = 0 ; i < liga.TabelaDeJogos.size() ; i++){
            Jogo jogo = liga.TabelaDeJogos.get(i);
            if(jogo.getPlacarTime1() > jogo.getPlacarTime2()){
                
                // time 1 += 3 pontos
                int v = jogo.getTime1().getVitorias();
                jogo.getTime1().setVitorias(v+1);

                // time 2 = 0 pontos
                int d = jogo.getTime2().getDerrotas();
                jogo.getTime2().setDerrotas(d+1);
            } else  if(jogo.getPlacarTime1() > jogo.getPlacarTime2()){

                // time 1 = 0 ponto
                int v = jogo.getTime2().getVitorias();
                jogo.getTime2().setVitorias(v+1);
                // time 2 += 3 pontos
                int d = jogo.getTime1().getDerrotas();
                jogo.getTime1().setDerrotas(d+1);
            } else{
                // empate 1 ponto pra cada

            }
        } 

        for( int i = 0; i < listaJogos.size(); i++){
            Jogo temporario = listaJogos.get(i);
            System.out.println(temporario.getID() + " " + temporario.getTemperatura() + " " + temporario.getPlacarTime1() 
            + " x " + temporario.getPlacarTime2() );
        }



        System.out.println("");
        
    }
}


/**
 BOMBA!


                int p1,p2;

        Jogo jogoDeAbertura = new Jogo();

        jogoDeAbertura.setTemperatura(30);
        // jogoDeAbertura.setTime1(barcelona);
        //jogoDeAbertura.setTime2(realmadrid);


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
       // System.out.println(barcelona.getNome());


**/


        /** 

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
            **/