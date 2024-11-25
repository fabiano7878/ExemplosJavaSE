package br.com.exemplos.dto;

import java.time.LocalDate;
import java.util.List;

public class PessoaDTO {
	private long id;
	private String nomeCompleto; 
	private int idade;
	private LocalDate nascimento;	
	private List<DocumentoDTO> documento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public List<DocumentoDTO> getDocumento() {
		return documento;
	}
	public void setDocumento(List<DocumentoDTO> documento) {
		this.documento = documento;
	}
	
	@Override
	public String toString() {
		return "PessoaDTO [id=" + id + ", nomeCompleto=" + nomeCompleto + ", idade=" + idade + ", nascimento="
				+ nascimento + ", documento=" + documento + "]";
	}		
}
