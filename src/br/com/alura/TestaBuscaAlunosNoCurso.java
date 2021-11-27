package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = Curso.builder().nome("Dominando Coleções do java").instrutor("Paulo Silveira").build();
		javaColecoes.adiciona(new Aula("Revisando os ArrayLists", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

		Aluno a1 = Aluno.builder().nome("Pádua Alves").numeroMatricula(1231).build();
		Aluno a2 = Aluno.builder().nome("Elizandra Amarante").numeroMatricula(6545).build();
		Aluno a3 = Aluno.builder().nome("Helena Amarante").numeroMatricula(9873).build();

		javaColecoes.matricula(a1, a2, a3);
		
		javaColecoes.estaMatriculado(a1);
		
		System.out.println("Quem é o aluno com matrícula 1231?");
		Aluno aluno = javaColecoes.buscaMatricula(1231);
		System.out.println(aluno);
	}
}
