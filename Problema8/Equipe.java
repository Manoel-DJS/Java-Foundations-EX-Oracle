package Problema8;

public class Equipe {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golMarcados;
    private int golSofridos;

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
    
    public int getGolMarcados() {
        return golMarcados;
    }
    public void setGolMarcados(int golMarcados) {
        this.golMarcados = golMarcados;
    }

    public int getGolSofridos() {
        return golSofridos;
    }
    public void setGolSofridos(int golSofridos) {
        this.golSofridos = golSofridos;
    }

}
