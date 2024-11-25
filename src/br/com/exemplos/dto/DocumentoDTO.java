package br.com.exemplos.dto;

import br.com.exemplos.indicador.TipoDocumentoIndicador;

public class DocumentoDTO {
	private long id;
	private String nome;
	private String numero;
	private TipoDocumentoIndicador tipoDocumentoIndicador;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nome;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nome = nomeCompleto;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public TipoDocumentoIndicador getTipoDocumentoIndicador() {
		return tipoDocumentoIndicador;
	}
	public void setTipoDocumentoIndicador(TipoDocumentoIndicador tipoDocumentoIndicador) {
		this.tipoDocumentoIndicador = tipoDocumentoIndicador;
	}
	
	@Override
	public String toString() {
		return "DocumentoDTO [id=" + id + ", nome=" + nome + ", numero=" + numero
				+ ", tipoDocumentoIndicador=" + tipoDocumentoIndicador + "]";
	}	
}
