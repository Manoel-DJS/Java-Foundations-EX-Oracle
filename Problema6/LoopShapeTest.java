package Problema6;

public class LoopShapeTest {
    public static void main(String[] args) {
        String teste = "";    
        String baseAltura = "";

        for (int x = 1; x<=4; x++){
            teste += "# \n";

        }

        for(int c = 1 ; c<=5; c++){
            baseAltura += "#";
        }

        int espacosIntermediarios = 4; // Número de espaços intermediários desejado
        String resultado = "#"; // Inicia com o caractere "#"
        
        // Adiciona os espaços intermediários
        for (int i = 0; i < espacosIntermediarios; i++) {
            resultado += " ";
        }
        
        resultado += "#"; // Adiciona o caractere "#" no final
        
        System.out.println(resultado); // Imprime a String resultante

        System.out.println(baseAltura+ "\n" + resultado + baseAltura + "\n" + baseAltura);
    
        System.out.println(""+ "\n\n\n");

        int altura = 5; // Altura do retângulo
        int largura = 10; // Largura do retângulo
        
        // Loop para controlar as linhas do retângulo
        for (int i = 0; i < altura; i++) {
            // Loop para controlar as colunas do retângulo
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    System.out.print("#"); // Imprime o caractere "#" nas bordas do retângulo
                } else {
                    System.out.print(" "); // Imprime espaços no centro do retângulo
                }
            }
            System.out.println();
    }
}
}
/** 
        for (int x = 1; x<=4; x++){
            teste += "\n #";

        }
**/