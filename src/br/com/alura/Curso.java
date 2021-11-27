package br.com.alura;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Curso {

	private String nome;
	private String instrutor;
	@Builder.Default
	private List<Aula> aulas = new LinkedList<Aula>();
	@Builder.Default
	private Set<Aluno> alunos = new HashSet<Aluno>();
	@Builder.Default
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<Integer, Aluno>();

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public void matricula(Aluno... alunos) {
		for (Aluno aluno : alunos) {
			this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		}
		this.alunos.addAll(new HashSet<Aluno>(Arrays.asList(alunos)));
	}

	public boolean estaMatriculado(Aluno aluno) {
		return alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int matricula) {
		return this.matriculaParaAluno.get(matricula);
	}

}
