package br.com.exemplos.application;

import java.util.HashSet;
import java.util.Set;

public class TesteAluno {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        boolean FabianoFoiAdd = alunos.add("Fabiano dos Santos Silva");
        alunos.add("Thainy Aranha Lelis");
        alunos.add("Ari Assis Silva");
        alunos.add("João Almeida");

        alunos.forEach(n -> System.out.println("Alunos: "+n));

        System.out.println("Fabiano foi add com sucesso? "+FabianoFoiAdd);

        System.out.println("Joao está na Colection? "+alunos.contains("Joao Almeida"));

        System.out.println("João está na Colection? "+alunos.contains("João Almeida"));

    }
}
