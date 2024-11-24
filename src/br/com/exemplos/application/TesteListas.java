package br.com.exemplos.application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListas {

    public static void main(String[] args) {

        System.out.println("**** ArrayList vs LinkedList ***");

        List<Integer> numerosArrayList = new ArrayList<>();
        List<Integer> numerosLinkedList = new LinkedList<>();
        int quantidadeElementos = 1000000;

        long tempoArrayList  = insereElementosNo(numerosArrayList, quantidadeElementos);
        long tempoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);

        System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
        System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);

        tempoArrayList = removePrimeirosElementos(numerosArrayList);
        tempoLinkedList = removePrimeirosElementos(numerosLinkedList);

        System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
        System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);

        tempoArrayList = buscaItemDentroDaLista(numerosArrayList, Integer.valueOf(100));
        tempoLinkedList = buscaItemDentroDaLista(numerosLinkedList, Integer.valueOf(100));

        System.out.println("Procurar no ArrayList a posição 100 demorou  " + tempoArrayList);
        System.out.println("Procurar na LinkedList a posição 100 demorou " + tempoLinkedList);
    }

    /*
     * removendo 100 elementos sempre na primeira posição
     */
    private static long removePrimeirosElementos(List<Integer> numeros) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numeros.remove(0); //removendo sempre o primeiro elemento
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long insereElementosNo(List<Integer> numeros, int quantidade) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            numeros.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long buscaItemDentroDaLista(List<Integer> numeros, Integer position){
        long ini = System.currentTimeMillis();

        numeros.stream().anyMatch(i ->  position.equals(i));

        long fim = System.currentTimeMillis();
        return fim-ini;
    }

}
