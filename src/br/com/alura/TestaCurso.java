package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = Curso.builder().nome("Dominando Coleções do java")
											.instrutor("Paulo Silveira").build();
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Revisando os ArrayLists", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));
		
		System.out.println(aulas);

	}

}
