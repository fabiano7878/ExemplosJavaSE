package br.com.exemplos.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Scopus");
		palavras.add("Internet Banking");
		palavras.add("Bradesco S/A");
		palavras.add("Bradesco Seguros");
		
		Collections.sort(palavras);
		
		//Saida utilizando o metodo de compara��o da classe String, que verifica a ordem de a-z
		//System.out.println(palavras);
				
		//Comparator<String> comparador = new ComparadoraPorTamanho();		
		
		//Passando comparator para a Collections 
		//Collections.sort(palavras, comparador);
		
		//1 - Abordagem classe anonima 
/*		Comparator<String> comparador = new Comparator<String>(){
					@Override
					public int compare(String s1, String s2) {
						
						if(s1.length() < s2.length())
							return -1;
						if(s1.length() > s2.length())
							return 1;
						return 0;
					}
		};
		//Passando a comparator para o novo metodo de sort de List
		palavras.sort(comparador);
		*/
		
		//Caso 2 - Classes anonimas com Lambda 
	/*	Comparator<String> comparador = ((s1, s2) -> {
			
			if(s1.length() < s2.length())
				return -1;
			if(s1.length() > s2.length())
				return 1;
			return 0;
			
		});
		
		palavras.sort(comparador);
		*/		
		
		
		//Caso 3 Abordagem lambda, implementando o integer que tem metodos que compara tamanhos de strng
		//palavras.sort((s1,s2)-> {return Integer.compare(s1.length(), s2.length());});
		
		//Caso 4
		//palavras.sort((s1,s2)-> Integer.compare(s1.length(), s2.length()));
		
		
		//Caso 5
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//O caso 5 Poderia ser assim tmbm:		
		//palavras.sort(Comparator.comparing(String::length));
		
		//Ou com a classe anonima
		//Comparator<String>comparador = Comparator.comparing(s -> s.length());
		//palavras.sort(comparador);
					
				
		//Saida que utiliza como comparador a implementa��o de Comparator que n�s escolhemos abaixo na classe.
		//System.out.println(palavras+"\n \n");

		
		
		//Forma de iterear antes do Java 8
		/*for(String s: palavras) {
			System.out.println(s);
			
		}*/
		
		//System.out.println("\n \n");
		
		
		//*Caso 1 da estrutura Funcional, usando classes default
		//Consumer<String> consumidor = new ConsumidorDeString();		
		//palavras.forEach(consumidor);		
		
		//**Caso 2 de melhoria Java 8- Funcional, usado bastante no Android.
		//Sintaxe Funcional matamos a classe ConsumidorDe 
		//String e a implementamos a Classe anonima que usa 
		//a interface Consumer dentro do metodo forEach;
		/*palavras.forEach(new Consumer<String>(){
			public void accept(String s) {
				System.out.println(s);
			}});*/
		
		
		//***Caso 3 lambda com inteface funcional
		/*palavras.forEach((String s)->{
			System.out.println(s);
		});*/
		
		//****Caso 4 -> Lambda e inovadora forma
		//palavras.forEach(s -> System.out.println(s));
		
		
		//Caso 6 - comparando
/*		Comparator<String>c = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1.matches("(.*)Bradesco(.*)") && s2.matches("(.*)Seguros(.*)")) {
					return 1;					
				}
				if(!s1.matches("(.*)Bradesco(.*)") && !s2.matches("(.*)Seguros(.*)"))
					return -1;
				return 0;
			}
		};
		
		palavras.sort(c);*/
		
		palavras.forEach(s -> s.matches("(.*)Bradesco(.*)"));
		
		palavras.forEach(System.out::println);
		//System.out.println(palavras+"\n \n");
		
			
		
		
		//Exemplo de Thread com classe anonima
	/*	new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();*/
		
		
		//Exemplo com Interface FuncionalRunnable e Lambda
		//new Thread(() -> System.out.println("Executando um Runneble")).start(); 
				
	}

}



	


//Caso 1 Classe morre quando usamos lambda.
/*class ConsumidorDeString implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}*/

//Caso 1 - usando comparator
/*class ComparadoraPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}

	
	
}*/