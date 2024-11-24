package br.com.exemplos.servicos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcessaArquivos {
		
	public List<String> DiretorioArquivo() {
		Scanner in;
		List<String> lista = new ArrayList<String>();
		try {
			in = new Scanner(new FileReader("resources/dados.properties"));
			int index = 0;
		while (in.hasNextLine()) {		
		    String line = in.nextLine();
		    System.out.println(line);
		    lista.add(line);		    
		    System.out.println("lista"+lista.get(index));
		    index++;
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
		
	}

}
