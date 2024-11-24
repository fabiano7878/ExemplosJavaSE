package br.com.exemplos.model.escola;

import java.util.Objects;

public class Funcionario implements Comparable {

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        if(Objects.isNull(nome) || "".equals(nome.trim()) && Objects.isNull(idade) && idade == 0) {
            throw new RuntimeException("Nome e Idade precisam ser preenchidos");
        }else{
            this.nome = nome;
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Object o) {
        Funcionario func = (Funcionario) o;
        return this.idade - func.getIdade();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
