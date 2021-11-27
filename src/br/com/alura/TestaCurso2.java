package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = Curso.builder().nome("Dominando Coleções do java").instrutor("Paulo Silveira").build();
		javaColecoes.adiciona(new Aula("Revisando os ArrayLists", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		List<Aula> teste = new ArrayList<Aula>();
		teste.addAll(aulasImutaveis);
		teste.remove(0);
		
		System.out.println(teste.size());
		System.out.println(aulasImutaveis.size());
		
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);

	}

}
