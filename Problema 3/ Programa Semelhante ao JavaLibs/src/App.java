/** 
 !Pronto!

Seu programa também deve fazer o seguinte: 
 Aceitar pelo menos uma entrada, que deverá ser analisada como String *
 Aceitar pelo menos uma entrada, que deverá ser analisada como int *
 Aceitar pelo menos uma entrada, que deverá ser analisada como double *
 Usar pelo menos uma entrada em uma pergunta para o usuário *
 Fazer cálculos com pelo menos uma entrada int *
 Fazer cálculos com pelo menos uma entrada double *
 Aceitar pelo menos um total de dez entradas

**/

import  javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null,"Responda as perguntas a seguir com atenção.");

        String nome = (String)JOptionPane.showInputDialog("Digite seu nome: ");

        int numeroInteiro1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número Inteiro(1): "));
        int numeroInteiro2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número Inteiro(2): "));

        double numeroFlutuante1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número com ponto flutuante(1): "));
        double numeroFlutuante2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número com ponto flutuante(2): "));

        int resposta = JOptionPane.showConfirmDialog(null, "Você sabe usar o JAVA? ");

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4: "));
        double nota5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 5: "));
        
        double mediaNotas = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        
        int somaNumerosInteiros = numeroInteiro1 + numeroInteiro2;
        double multiplicaNumerosFlutuantes = numeroFlutuante1 * numeroFlutuante2;

        JOptionPane.showMessageDialog(null,"Sua média nas notas: " + mediaNotas);
        JOptionPane.showMessageDialog(null,"A soma dos números inteiros: " + somaNumerosInteiros);
        JOptionPane.showMessageDialog(null,"A multiplicação dos números flutuantes: " + multiplicaNumerosFlutuantes);

        if(resposta == 0){
            JOptionPane.showMessageDialog(null, nome + " ACHA que sabe programar java");
        } else if(resposta == 1){
            JOptionPane.showMessageDialog(null, nome + " Não sabe programar java");
        } else{
            JOptionPane.showMessageDialog(null, nome + " Não deu sua opinião. Por essa razão, provavelmente você não sabe programar JAVA!");
        }


    }
}
