package Problema7;

public class Cartao {
    private double saldoAtualCredito;
    private double saldoTiquetes;
    private int numeroIDCartao;
    
    // SaldoAtual
    public double getSaldoAtual() {
        return saldoAtualCredito;
    }
    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtualCredito = saldoAtual;
    }


    // SaldoAtual
    public double getSaldoTiquetes() {
        return saldoTiquetes;
    }
    public void setSaldoTiquetes(double saldoTiquetes) {
        this.saldoTiquetes = saldoTiquetes;
  
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
