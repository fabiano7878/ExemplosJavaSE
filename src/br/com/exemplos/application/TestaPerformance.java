package br.com.exemplos.application;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();

        long tempoDeExecucao = 0;

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long fim = System.currentTimeMillis();

        tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto no for de add: " + tempoDeExecucao);

        tempoDeExecucao = 0;
        inicio = 0;
        fim =0;

        inicio = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.stream().anyMatch(n -> 49995 == n);
        }

        fim = System.currentTimeMillis();

        tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto no for com anymatch: " + tempoDeExecucao);

        tempoDeExecucao = 0;
        inicio = 0;
        fim =0;

        inicio = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        fim = System.currentTimeMillis();

        tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto no for com contains: " + tempoDeExecucao);


        /**
         * Resultado
         *
         * ArrayList
         * Tempo gasto no for de add: 3
         * Tempo gasto no for com anymatch: 6304
         * Tempo gasto no for com contains: 879
         *
         * LinkedList
         * Tempo gasto no for de add: 3
         * Tempo gasto no for com anymatch: 8870
         * Tempo gasto no for com contains: 2538
         *
         * HashSet
         * Tempo gasto no for de add: 5
         * Tempo gasto no for com anymatch: 13804
         * Tempo gasto no for com contains: 2
         */
    }
}
