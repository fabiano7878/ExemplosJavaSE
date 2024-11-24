package br.com.exemplos.application;

import java.util.Scanner;
public class biSexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int ano= 0;		
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o ano para saber se e Bisexto:");
	ano = sc.nextInt();	
	System.out.print("\n\n");
	
	if(ano % 4 == 0 & (ano % 100 != 0 || ano % 400 ==0))
	System.out.println("O ano "+ano+" � bisexto");
	else
	System.out.println("O ano "+ano+" n�o � Bisexto");
	
	}
}
