package Problema7;

public class CategoriaPremio {
    private String nome;
    private int ticketsObrigatorios;
    private int contagemItens;

    public CategoriaPremio(){

    }

    public CategoriaPremio(String nome, int ticketsObrigatorios, int contagemItens) {
        this.nome = nome;
        this.ticketsObrigatorios = ticketsObrigatorios;
        this.contagemItens = contagemItens;
    }

    public String getNome() {
        return nome;
    }

    public int getTicketsObrigatorios() {
        return ticketsObrigatorios;
    }
    public void setTicketsObrigatorios(int ticketsObrigatorios) {
        this.ticketsObrigatorios = ticketsObrigatorios;
    }

}
