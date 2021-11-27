package br.com.alura;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Aluno {
	private String nome;
	private int numeroMatricula;
}
