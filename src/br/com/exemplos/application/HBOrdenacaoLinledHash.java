package br.com.exemplos.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class HBOrdenacaoLinledHash {

	public static void main(String[] args) throws FileNotFoundException{

		Map<String, String> mDocumentos = null;
		String caminhoArquivo = "resources/dados.properties";
		Properties prop = new Properties();
			
		FileInputStream file = new FileInputStream((new File(caminhoArquivo)).getAbsolutePath());
			try {
				prop.load(file);
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			mDocumentos = new LinkedHashMap<String, String>();
			for(String key: prop.stringPropertyNames()) {
				mDocumentos.put(key, prop.getProperty(key));
			}
			
	}

}
