package Problema7;

public class Terminal {
    private int dinheiro;

    Cartao cartao = new Cartao();
    
    public int getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void converterCredito(int dinheiro){
        cartao.setSaldoAtual(this.dinheiro * 2);
    }
    
}
