package br.com.exemplos.application;

public class ExemploParserLongString {

    private static String nome1 = "0";
    private static String nome2;
    
    public static void main(String[]args){
//        System.out.println("Passo 1 String nome1 \n");
//        numeroParseado(nome1);
//        System.out.println("Saida String nome1 "+nome1+"\n");
//        System.out.println("Passo 2 String nome2");
//        numeroParseado(nome2);
//        System.out.println("Saida String nome1 "+nome2);
//        
        
        String casas13 = "12345678912399";
        
        double casas = Double.parseDouble(casas13);
        
        System.out.println("casas13: "+ casas);
        
    }
    
    public static long numeroParseado(String argumento){
        
        long numeroParseado;
        
        numeroParseado = Long.parseLong(argumento);
        
        return numeroParseado;
        
    }
    
    
}
