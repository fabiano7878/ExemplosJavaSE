package br.com.exemplos.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.exemplos.model.curso.Curso;

public class Cursos {
	
	public static void main(String[] args) {
		
		List<Curso>cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("JavaScript",150));
		cursos.add(new Curso("Java 8",113));
		cursos.add(new Curso("C",55));
		cursos.add(new Curso("C#",80));
		cursos.add(new Curso("Grovy",30));
		cursos.add(new Curso("Scala",50));
		cursos.add(new Curso("Ruby",45));		
		
		
		cursos.sort(Comparator.comparing(Curso::getAluno));
		
		//Metodo reference tem limita��es, n�o rola pegar neste caso a quantidade de alunos, desta maneira utilizei o lambda abaixo:
		//cursos.forEach(System.out::println);
		//Lambda.
		//cursos.forEach(c -> System.out.println(c.getAluno()));
		
		//Aqui eu devolvo os cursos que tem mais de 100 alunos, os nomes deles.
		cursos.stream().filter(c -> c.getAluno() >= 100).forEach(c -> System.out.println(c.getNome()));
		
		//Devolve os cursos maiores que 100, usando Lambda
		cursos.stream().filter(c -> c.getAluno() >= 100).map(c -> c.getAluno()).forEach(total -> System.out.println(total));
		
		//Devolve os mesmos valores maiores que 100, mas utilizando metodos reference
		cursos.stream().filter(c -> c.getAluno() >= 100).map(Curso::getAluno).forEach(System.out::println);
		
		
		//Aqui susamos o map de inteiro, onde podemos usar para somar o que extraimos da stream e devolver o valor somado.
		int sum = cursos.stream().filter(c -> c.getAluno() >= 100).mapToInt(Curso::getAluno).sum();		
		System.out.println(sum);
	}
}
