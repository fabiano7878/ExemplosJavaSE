package br.com.exemplos.model.escola;

import java.util.Objects;

public class Alunos {

    private String nome;
    private int numeroMatricula;

    public Alunos(String nome, int numeroMatricula) {
        if(Objects.isNull(nome) || Objects.isNull(numeroMatricula)){
            throw new NullPointerException("O Nome e Matricula devem ser preenchido!");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Alunos aluno = (Alunos) obj;
        return this.nome.equals(aluno.nome) && this.numeroMatricula == aluno.numeroMatricula;
    }

  /*  @Override
    public int hashCode() {
        return this.nome.hashCode();
    }*/
}
