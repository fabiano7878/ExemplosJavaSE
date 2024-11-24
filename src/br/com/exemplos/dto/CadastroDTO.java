package br.com.exemplos.dto;

import java.util.List;

import br.com.exemplos.model.cadastro.Cadastro;

public class CadastroDTO {
	public List<Cadastro> cadastrados;

	
	public List<Cadastro> getCadastrados() {
		return cadastrados;
	}


	public void setCadastrados(List<Cadastro> cadastrados) {
		this.cadastrados = cadastrados;
	}


	@Override
	public String toString() {
		return "CadastroDTO [cadastrados=" + cadastrados + "]";
	}	
}
