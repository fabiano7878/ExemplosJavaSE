package br.com.exemplos.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.exemplos.model.escola.Aula;

public class TesteListaAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArraysLists", 21) ;
        Aula a2 = new Aula("Listas de Objetos", 20) ;
        Aula a3 = new Aula("Relacionamento de Listas e objetos", 15) ;

        ArrayList<Aula> aulas = new ArrayList<Aula>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);


       // aulas.forEach(a -> {
          //  System.out.println(a);
       // });


        //Usando o comparate to de dentro da classe Aula, artravés da Collections, atributo de comparação feito pelo Nome
        Collections.sort(aulas);
        System.out.println("Ordenando pelo sort da Colletions "+ aulas);

        //sor com comparator dentro de Aula, atributo de comparação feito pelo Nome
        aulas.sort(Aula::compareTo);
        aulas.forEach(aula -> {
            System.out.println("Ordenando pelo Sort de ArrayList "+ aula);
        });

        //sort com comparator, atributo de comparação feito pelo Tempo
        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println("Ordenando pelo Sort da Comparator "+aula);
        });
    }
}
