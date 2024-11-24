package br.com.exemplos.model.escola;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private long tempoTotal;
    private Set<Alunos> alunos = new HashSet<>();
    private List<Alunos> alunosNaLista = new ArrayList<>();
    private Map<Integer, Alunos> alunosMap = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula a){
        tempoTotal += a.getTempo();
        this.aulas.add(a);
    }

    public void matricula(Alunos aluno){
        this.alunos.add(aluno);
        this.alunosMap.put(aluno.getNumeroMatricula(), aluno);
    }

    public void matriculaNaLista(Alunos aluno){
        this.alunosNaLista.add(aluno);
    }

    public Set<Alunos> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public long getTempoTotalAulasPeloAtributo(){
        return this.tempoTotal;
    }

    public long getTempoTotalByArrayDasAulas(){
        return this.getAulas().stream().mapToLong(Aula::getTempo).sum();
    }

    public List<Alunos> getAlunosNaLista() {
        return Collections.unmodifiableList(alunosNaLista);
    }

    public boolean estaMatriculado(Alunos aluno) {
        return getAlunos().contains(aluno);
    }

    public Alunos buscaALunoPelaMatricula(int numeroMatricula){
        if(!this.alunosMap.containsKey(numeroMatricula)) throw new NoSuchElementException("Numero de matricula não identificado: "+numeroMatricula);
        return this.alunosMap.get(numeroMatricula);
    }
}
