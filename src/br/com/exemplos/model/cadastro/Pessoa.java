package br.com.exemplos.model.cadastro;

import java.time.LocalDate;
import java.util.List;

public record Pessoa (long id, String nome, int idade, LocalDate dtNascimento, List<Documento> documento){
}
