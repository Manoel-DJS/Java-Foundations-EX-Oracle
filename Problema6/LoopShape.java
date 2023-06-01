package Problema6;

public class LoopShape {

    public String createRectangle(double largura, double altura){
        String retangulo = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    retangulo += "#"; // Adiciona o caractere "#" nas bordas do retângulo
                } else {
                    retangulo += " "; // Adiciona espaços no centro do retângulo
                }
            }
            retangulo += "\n"; // Quebra de linha após cada linha do retângulo
        }
        return retangulo;
    }

    public String createTriangle(double tamanhoPerna){
        String triangulo = "";
        for (int l = 0; l < tamanhoPerna; l++) {    
            for (int c = 0; c <= l; c++){
                if (c == 0 || c == l || l == tamanhoPerna-1) {
                    triangulo += "#"; // Adiciona o caractere "#" nas bordas do retângulo
                } else {
                    triangulo += " "; // Adiciona espaços no centro do retângulo
                }
            }
            triangulo += "\n";
        }
        return triangulo;
    }

}
