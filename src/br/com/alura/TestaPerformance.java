package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Tempo de inserção e busca de 100.000 inteiros");
		System.out.println("");
		System.out.println("");
		Collection<Integer> arrayList = new ArrayList<Integer>();
		calculaTempoOperacao(arrayList);
		Collection<Integer> hashset = new HashSet<Integer>();
		calculaTempoOperacao(hashset);
		Collection<Integer> linkedlist = new LinkedList<Integer>();
		calculaTempoOperacao(linkedlist);

	}

	private static void calculaTempoOperacao(Collection<Integer> numeros) {

		long inicioInsercao = System.currentTimeMillis();

		for (int i = 1; i <= 100000; i++) {
			numeros.add(i);
		}

		long fimInsercao = System.currentTimeMillis();
		long tempoDeExecucaoInsercao = fimInsercao - inicioInsercao;
		System.out.println("Classe: " + numeros.getClass().getName());
		System.out.println("Tempo gasto inserção: " + tempoDeExecucaoInsercao + " milisegundos");
		long inicioBusca = System.currentTimeMillis();

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		long fimBusca = System.currentTimeMillis();
		long tempoDeExecucaoBusca = fimBusca - inicioBusca;

		System.out.println("Tempo gasto busca: " + tempoDeExecucaoBusca + " milisegundos");
		System.out.println("------------------------------------------------------");

	}
}
