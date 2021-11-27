package br.com.alura;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@AllArgsConstructor
public class Aluno {
	private String nome;
	private int numeroMatricula;
}
