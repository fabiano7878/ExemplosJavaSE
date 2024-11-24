package br.com.exemplos.application;

import br.com.exemplos.model.escola.Alunos;
import br.com.exemplos.model.escola.Aula;
import br.com.exemplos.model.escola.Curso;


public class TestaCursoComAlunos {

    public static void main(String[] args) {

        Curso curso = new Curso("Aprendendo com Fabiano", "Fabiano dos Santos Silva");

        //Cadastro de Aulas
        curso.adiciona(new Aula("Trabalhando com Arrays",21));
        curso.adiciona(new Aula("Kotlin para Iniciantes",20));
        curso.adiciona(new Aula("Trabalhando com linkedList",24));

        /**
         * Documentar: que o Set, Map e Hash não são passiveis de comparação de objetos, usando wquals ou contains, como é em List,
         * pois a comparação não é de String, se a comparação for no atributo direto, ou seja, nesse exemplo de alunos, compararmos ,
         * os nomes dos alunos e os demais atributos 1 a 1 conseguiremos enontrar a igual dade, pois a comparação será pontual.
         * na comparação de objeto, se usamos a api de Set, que usa a tecnica de sepramento e não de empilhamento, o hash do objeto é unico,
         * e se o objeto é dado new, mesmo que setarmos os mesmos valores do atributo nao conseguiremos realizar a comparação do objeto total,
         * pois o codigo hash será diferente, caso reescrevamos o metodo Equals precisamos fortmente reescrever o metodo hashCode da classe String do java
         * Veja exemplos abaixo:
         */

        //================================ Set ============================

        Alunos a1 = new Alunos("José Silva", 12345);
        Alunos a2 = new Alunos("Maria Silva", 678945);
        Alunos a3 = new Alunos("Chiquinha Silva", 101112);
        Alunos b1 = a1;

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);

        curso.getAlunos().forEach(a -> System.out.println("Set: "+a));

        //Funcionamento ok para comparação
        System.out.println("Este aluno: "+a1+" está matriculado no curso?");
        System.out.println("Verificando se Aluno está maticulado: " +curso.estaMatriculado(a1));

        Alunos jose = new Alunos("José Silva", 12345);

        //Se sobreescrevermos o equals é obrigadtorio reescrever o hashcode, pois para estrutura de dados se o hashcode
        // não for reecrito não conseguiremos validar se o objeto é igual.
        System.out.println(String.format("O Aluno %s está matriculado?", a1));
        System.out.println(curso.estaMatriculado(jose));

        //Se o hash code da classe Aluno não for reescrito a condição aqui dá falsa, para testar
        // comente o metodo reescrito hashcode
        System.out.println(String.format("O Aluno %s é igual ao Aluno a1: %s?", jose, a1));
        System.out.println(jose.equals(a1));

    }

}
