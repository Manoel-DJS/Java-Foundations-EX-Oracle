package Aula8;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        aluno1.setCurso("MEDVET");
        aluno1.setNome("Nilson");
        aluno1.setNotaFinal(79.5);
        aluno1.setRA(12121212);

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("SI");
        aluno2.setNome("Clarice");
        aluno2.setNotaFinal(75.5);
        aluno2.setRA(45454545);

        Aluno aluno3 = new Aluno();

        aluno3.setCurso("SI");
        aluno3.setNome("Alberto");
        aluno3.setNotaFinal(55.5);
        aluno3.setRA(33334444);

        ArrayList<Aluno> turma = new ArrayList<Aluno>();
        // Incluir na Lista
        turma.add(aluno3);
        turma.add(aluno1);
        turma.add(aluno2);
        turma.add(aluno1);

        // Quantos alunos tem na lista?
        System.out.println(turma.size());

        // Como é que eu faço para remover? = turma.remove(3);
        turma.remove(aluno1);

        // como percorrer todos os itens da lista?
        turma.forEach(
            (item) -> {
                System.out.println(item.getNome());
            }
        );

        System.out.println("");

        for(int c = 0; c < turma.size(); c++){
            Aluno item = turma.get(c);
            System.out.println(item.getNome());
        }



    }
}
