package com.mycompany.refeitorio;

import java.util.LinkedList;
import java.util.Queue;

public class Refeitorio {

   public static void main(String[] args) {
        Queue<Pessoa> fila = new LinkedList<>();

        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.matricula = "123456";
        aluno.curso = "Ciência da Computação";

        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.siape = "789012";
        professor.titulacao = "Doutora";

        Tecnico tecnico = new Tecnico();
        tecnico.nome = "Carlos";
        tecnico.siape = "345678";

        fila.add(aluno);
        fila.add(professor);
        fila.add(tecnico);

        while (!fila.isEmpty()) {
            Pessoa pessoa = fila.poll();
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("SIAPE: " + pessoa.siape);
            if (pessoa instanceof Aluno) {
                System.out.println("Matrícula: " + ((Aluno) pessoa).matricula);
                System.out.println("Curso: " + ((Aluno) pessoa).curso);
            } else if (pessoa instanceof Professor) {
                System.out.println("Titulação: " + ((Professor) pessoa).titulacao);
            }
            System.out.println();
        }
}
}
