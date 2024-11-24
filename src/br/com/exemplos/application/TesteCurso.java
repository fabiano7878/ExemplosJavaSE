package br.com.exemplos.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.exemplos.model.escola.Aula;
import br.com.exemplos.model.escola.Curso;

public class TesteCurso {

  public static void main(String[] args) {
  Curso curso = new Curso("Aprendendo com Fabiano", "Fabiano dos Santos Silva");

  curso.adiciona(new Aula("Trabalhando com Arrays",21));
  curso.adiciona(new Aula("Kotlin para Iniciantes",20));
  curso.adiciona(new Aula("Trabalhando com linkedList",24));
  System.out.println("Aulas do Curso: "+curso.getAulas());
  //Desse jeito não consegue pois usamos o CollecitioUnmutable paa não deiar modificar a lista
  //Collections.sort(curso.getAulas());

    //Devemos criar uma nova lista a partir da imutavel para ai sim conseguir ordenar

    List<Aula> aulas = new ArrayList<>(curso.getAulas());
    Collections.sort(aulas);
  System.out.println("CollectionSort, irá ordenar pelo nome, Aulas do Curso: "+aulas);

    System.out.println("Tempo total do curso by atributo da classe: "+ curso.getTempoTotalAulasPeloAtributo());

    System.out.println("Tempo total do curso by Array de Aulas e lambda: "+ curso.getTempoTotalByArrayDasAulas());
  }
}
