package Problema8;

import java.util.ArrayList;
import java.util.List;

public class LigaFutebol {
    List<Jogo> TabelaDeJogos = new ArrayList<Jogo>();

    public ArrayList<Equipe> equipesLiga = new ArrayList<Equipe>();

    public void CriarLiga(){

        /** 
        Equipe barcelona = new Equipe();
        Equipe barcelona = new Equipe();
        Equipe barcelona = new Equipe();
        Equipe barcelona = new Equipe();

        barcelona.setnome("Barcelona");
        realmadrid.setnome("RealMadrid");
        valladolid.setnome("Valladolid");
        valencia.setnome("Valencia");

        equipesLiga.add(barcelona);
        equipesLiga.add(realmadrid);
        equipesLiga.add(Valladolid);
        equipesLiga.add(Valencia);
        **/

        equipesLiga.add(new Equipe("Barcelona"));
        equipesLiga.add(new Equipe("Real Madrid"));
        equipesLiga.add(new Equipe("Valladolid"));
        equipesLiga.add(new Equipe("Valencia"));

    }
}
