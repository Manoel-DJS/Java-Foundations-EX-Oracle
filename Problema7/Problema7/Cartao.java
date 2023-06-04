package Problema7;

public class Cartao {
    private int numero;
    private double saldoCredito;
    private int saldoTickets;

    public Cartao(){

    }
    public Cartao(int numero) {
        this.numero = numero;
        this.saldoCredito = 0;
        this.saldoTickets = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldoCredito() {
        return saldoCredito;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }
    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }

    public void adicionarCredito(double valor) {
        saldoCredito += valor;
    }
} 

