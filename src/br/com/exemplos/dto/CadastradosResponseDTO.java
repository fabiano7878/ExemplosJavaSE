package br.com.exemplos.dto;

import java.util.List;

public class CadastradosResponseDTO {

	private List<CadastradosDTO> cadastrados;

	public List<CadastradosDTO> getCadastrados() {
		return cadastrados;
	}

	public void setCadastrados(List<CadastradosDTO> cadastrados) {
		this.cadastrados = cadastrados;
	}

	@Override
	public String toString() {
		return "CadastradosResponseDTO []";
	}		
}
