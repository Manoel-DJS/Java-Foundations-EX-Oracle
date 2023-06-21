package Problema8;

public class Jogo {
    private int placarTime1;
    private int placarTime2;
    private double temperatura;
    private int ID;
    private Equipe time1;
    private Equipe time2;

    private static int _ID = 0;

    private static int GeraID(){
        _ID++;
        return _ID;
    }

    public Jogo(){

    }
    
    public Jogo(int p1, int p2, double temp){
        this.placarTime1 = p1;
        this.placarTime2 = p2;
        this.temperatura = temp;
        this.ID = Jogo.GeraID(); 
    }

    public Jogo(int p1, int p2, double temp, Equipe e1, Equipe e2){
        this.placarTime1 = p1;
        this.placarTime2 = p2;
        this.temperatura = temp;
        this.time1 = e1;
        this.time2 = e2;
        this.ID = Jogo.GeraID(); 
        // Toda vez que chama o método ele gera um ID
        // Com isso o Id n irá se repetir

    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    public int getPlacarTime1() {
        return placarTime1;
    }
    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }
    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Equipe getTime1() {
        return time1;
    }
    public void setTime1(Equipe t1) {
        this.time1 = t1;
    }

    public Equipe getTime2() {
        return time2;
    }
    public void setTime2(Equipe time2) {
        this.time2 = time2;
    }
}
