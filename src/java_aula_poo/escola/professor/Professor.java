package java_aula_poo.escola.professor;

import java_aula_poo.pessoa.Pessoa;

public class Professor extends Pessoa {

	private String disciplina;

	public Professor(String nome, String disciplina) {
		this.nome = nome;
		this.disciplina = disciplina;
	}

	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Disciplina: " + this.disciplina);
	}

	public void fazer() {
		System.out.println("O professor " + this.nome + " ministra aulas de " + this.disciplina);
	}

}