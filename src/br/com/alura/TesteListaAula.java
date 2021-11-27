package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando os ArrayLists", 21);
		Aula a2 = new Aula("listas de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		List<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));

	}
}
