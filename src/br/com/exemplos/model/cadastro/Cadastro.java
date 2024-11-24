package br.com.exemplos.model.cadastro;

import java.util.Date;
import java.util.List;

public record Cadastro(Date dataCadastro, List<Pessoa> pessoas) {
}
