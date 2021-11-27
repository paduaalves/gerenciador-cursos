package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();
		alunos.add("Pádua Alves");
		alunos.add("Elizandra Amarante");
		alunos.add("Helena Amarante");
		alunos.add("Rosa Sandra");
		alunos.add("Bárbara Marques");
		System.out.println(alunos);
		alunos.forEach(aluno -> System.out.println(aluno));
		
	}

}
