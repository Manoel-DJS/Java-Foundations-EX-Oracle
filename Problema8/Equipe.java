package Problema8;

public class Equipe {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;
    
    public Equipe(){
        
    }

    public Equipe(String nome){
        this.nome = nome;
    }

    public static void registrarPartida(Equipe[] equipes, int indiceEquipe1, int golsEquipe1, int golsEquipe2, int indiceEquipe2) {
        equipes[indiceEquipe1].registrarVitoria(golsEquipe1, golsEquipe2);
        equipes[indiceEquipe2].registrarDerrota(golsEquipe2, golsEquipe1);

    }


    public String getNome(){ 
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public int getGolsMarcados() {
        return golsMarcados;
    }
    public void setGolsMarcados(int golMarcados) {
        this.golsMarcados = golMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }
    public void setGolsSofridos(int golSofridos) {
        this.golsSofridos = golSofridos;
    }

    public void registrarVitoria(int golsMarcados, int golsSofridos) {
        this.vitorias++;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void registrarDerrota(int golsMarcados, int golsSofridos) {
        this.derrotas++;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void registrarEmpate(int golsMarcados, int golsSofridos) {
        this.empates++;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }
}