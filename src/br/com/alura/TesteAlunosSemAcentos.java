package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {
	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		alunos.add("Pádua");
		alunos.add("Elizandra");
		alunos.add("Helena");

		System.out.println(alunos.size());

		alunos.add("Pádua");

		System.out.println(alunos.size());
	}
}
