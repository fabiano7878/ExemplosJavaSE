package br.com.exemplos.application;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.com.exemplos.servicos.AcessaArquivos;

public class LeitorDeArquivos {

	
	public static void main(String[] args) {
		Map<String, String> mDocumentos = null;
		List<String> lista = new ArrayList<String>();
		AcessaArquivos arquivo = new AcessaArquivos();
				
		lista = arquivo.DiretorioArquivo();
		
		mDocumentos = new LinkedHashMap<String, String>();
		int index = 0;
		String[] valor =null;
		for(String key: lista) {
			valor = lista.get(index).split("=");
			mDocumentos.put(valor[0], valor[1]);
			
			index++;
		}
			
	}

}
