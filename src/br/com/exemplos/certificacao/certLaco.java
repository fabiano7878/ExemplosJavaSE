package br.com.exemplos.certificacao;

public class certLaco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] i = {5,6,10};
		int [] h;
		for(int x=0; x < 3; x++ ){		
			h=new int[3];
			h[x] = i[x] ;	
		System.out.println(h[x]+"texto");	
		} 
	}

}
