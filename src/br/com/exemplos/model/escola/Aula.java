package br.com.exemplos.model.escola;

public class Aula implements Comparable<Aula> {

    private String nome;
    private int tempo;

    public Aula(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula{" + "nome= " + this.nome + ", tempo= " + this.tempo + " minutos}";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.nome.compareTo(outraAula.nome);
    }

    @Override
    public boolean equals(Object obj) {
        Aula aula = (Aula) obj;
        return this.nome.equals(aula.nome);
    }
}
