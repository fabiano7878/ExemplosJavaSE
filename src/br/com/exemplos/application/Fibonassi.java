package br.com.exemplos.application;

public class Fibonassi {
    
    public static void start() {
          int aux = 0;
          int soma = 1;
          
          while (soma <= 100) {
               System.out.printf("%d ",aux);
               System.out.printf("%d ",soma);
                
                aux += soma;
                soma += aux;
          }
    }
    
    public static void main(String[] args) {
    	Fibonassi.start();
    }
}

