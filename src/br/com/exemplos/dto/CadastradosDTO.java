package br.com.exemplos.dto;

import java.util.Date;
import java.util.List;

public class CadastradosDTO {
	
	private Date dataDoCadastro;
	
	private List<PessoaDTO> cadastrados;

	public Date getDataDoCadastro() {
		return dataDoCadastro;
	}

	public void setDataDoCadastro(Date dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}

	public List<PessoaDTO> getCadastrados() {
		return cadastrados;
	}

	public void setCadastrados(List<PessoaDTO> cadastrados) {
		this.cadastrados = cadastrados;
	}

	@Override
	public String toString() {
		return "CadastradosDTO [dataDoCadastro=" + dataDoCadastro + ", cadastrados=" + cadastrados + "]";
	}	
}
