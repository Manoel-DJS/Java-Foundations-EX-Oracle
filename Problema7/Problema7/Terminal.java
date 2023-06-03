package Problema7;

public class Terminal {
    private int dinheiro;

    Cartao cartao1 = new Cartao();
    
    public int getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void converterCredito(int dinheiro){
        cartao1.setSaldoAtual(this.dinheiro * 2);
    }
    
}
