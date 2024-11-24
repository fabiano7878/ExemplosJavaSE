package br.com.exemplos.application;

import java.util.HashMap;
import java.util.Map;

import br.com.exemplos.model.escola.Alunos;
import br.com.exemplos.model.escola.Aula;
import br.com.exemplos.model.escola.Curso;

public class TestaMap {
    public static void main(String[]args){

        Curso curso = new Curso("Aprendendo com Fabiano", "Fabiano dos Santos Silva");

        //Cadastro de Aulas
        curso.adiciona(new Aula("Trabalhando com Arrays",21));
        curso.adiciona(new Aula("Kotlin para Iniciantes",20));
        curso.adiciona(new Aula("Trabalhando com linkedList",24));

        Alunos a1 = new Alunos("José Silva", 12345);
        Alunos a2 = new Alunos("Maria Silva", 678945);
        Alunos a3 = new Alunos("Chiquinha Silva", 101112);


        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);

        curso.getAlunos().forEach(a -> System.out.println("Set: "+a));

        System.out.println("Buscando o Aluno dono da matricula 12345 - Ele é o: "+ curso.buscaALunoPelaMatricula(12345).getNome());




                Map<Integer, String> pessoas = new HashMap<>();

                pessoas.put(21, "Leonardo Cordeiro");
                pessoas.put(27, "Fabio Pimentel");
                pessoas.put(19, "Silvio Mattos");
                pessoas.put(23, "Romulo Henrique");

                pessoas.keySet().forEach(idade -> {
                    System.out.println("Iterando pela Idade: "+pessoas.get(idade));
                });

    }
}
