package Problema7;

public class Cartao {
    private double saldoAtual;
    private double saldoTiquetes;
    private int numeroIDCartao;
    
    // SaldoAtual
    public double getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(double saldoAtual) {
        if(saldoAtual < 0){
            System.out.println("Valor não pode ser negativo");
        } else{
            this.saldoAtual = saldoAtual;
        } 
    }


    // SaldoAtual
    public double getSaldoTiquetes() {
        return saldoTiquetes;
    }
    public void setSaldoTiquetes(double saldoTiquetes) {
        if(saldoTiquetes < 0){
            System.out.println("Valor não pode ser negativo");
        } else{
        this.saldoTiquetes = saldoTiquetes;
        }
    }

    
    // SaldoAtual
    public int getNumeroCartao() {
        return numeroIDCartao;
    }
    public void setNumeroCartao(int numeroCartao) {
        if(numeroCartao < 0){
            System.out.println("Valor não pode ser negativo");
        } else{
            this.numeroIDCartao = numeroCartao;
        }
    } 
}
