package br.com.exemplos.application;

import java.util.Iterator;
import java.util.TreeSet;

import br.com.exemplos.model.escola.Funcionario;

public class TesteFuncionario {


    public static void main(String[] args) {

        TreeSet<Funcionario> funcionarios = new TreeSet<>();

        Funcionario f1 = new Funcionario("Thaiany Aranha Lelis", 36);
        Funcionario f2 = new Funcionario("Clara Lelis", 14);
        Funcionario f3 = new Funcionario("Liberata dos Santos Silva", 73);

        funcionarios.add(f1);
        funcionarios.add(f3);
        funcionarios.add(f2);

        Iterator iterator = funcionarios.iterator();

        //System.out.println(iterator.next());

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
