package br.com.alura;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = Curso.builder().nome("Dominando Coleções do java").instrutor("Paulo Silveira").build();
		javaColecoes.adiciona(new Aula("Revisando os ArrayLists", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

		Aluno a1 = Aluno.builder().nome("Pádua Alves").numeroMatricula(1231).build();
		Aluno a2 = Aluno.builder().nome("Elizandra Amarante").numeroMatricula(6545).build();
		Aluno a3 = Aluno.builder().nome("Helena Amarante").numeroMatricula(9873).build();

		javaColecoes.matricula(a1, a2, a3);

		System.out.println("Alunos Matriculados: ");
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));

		System.out.println("O Aluno " + a1.getNome() + " está matriculado?: ");
		System.out.println(javaColecoes.estaMatriculado(a1) ? "Sim" : "Não");
		
		Aluno padua = Aluno.builder().nome("Pádua Alves").numeroMatricula(1231).build();
		System.out.println("E esse " + padua.getNome() + " está matriculado?: ");
		System.out.println(javaColecoes.estaMatriculado(padua) ? "Sim" : "Não");
		
		System.out.println("O " + a1.getNome() + " é equals ao padua?: ");
		System.out.println(a1.equals(padua) ? "Sim" : "Não");
		
	}
}
