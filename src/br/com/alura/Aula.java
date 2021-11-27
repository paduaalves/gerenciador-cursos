package br.com.alura;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	@Override
	public int compareTo(Aula aula) {
		return this.titulo.compareTo(aula.titulo);
	}
}
