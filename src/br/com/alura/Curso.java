package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
	List<Aula> aulas = new LinkedList<Aula>();

	public List<Aula> getAulas(){
		return Collections.unmodifiableList(this.aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}	
}
