package br.com.exemplos.model.cadastro;

import br.com.exemplos.indicador.TipoDocumentoIndicador;

public record Documento(long id, String nome, String numero, TipoDocumentoIndicador tipoDocumentoIndicador) {	
}
