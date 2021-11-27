package br.com.alura;

import java.util.Iterator;
import java.util.TreeSet;

public class TesteOrdenaPorIdade {

	public static void main(String[] args) {
		Funcionario funcionario1 = Funcionario.builder().nome("Pádua Alves").idade(34).build();
		Funcionario funcionario2 = Funcionario.builder().nome("Helena Amarante").idade(5).build();
		Funcionario funcionario3 = Funcionario.builder().nome("Elizandra Ferreira").idade(35).build();
		
		TreeSet<Funcionario> funcionarios = new TreeSet<Funcionario>(new OrdenaPorIdade());
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		
		Iterator<Funcionario> iterator = funcionarios.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
