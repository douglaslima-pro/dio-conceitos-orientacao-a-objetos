package java_aula_poo.escola.aluno;

import java_aula_poo.pessoa.Pessoa;

public class Aluno extends Pessoa {

	private String matricula;
	private boolean situacaoMatricula;

	public Aluno(String nome, String matricula, boolean situacaoMatricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.situacaoMatricula = situacaoMatricula;
	}

	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Situação da matrícula: " + (this.situacaoMatricula ? "ativa" : "inativa"));
	}

	public void fazer() {
		if (this.situacaoMatricula) {
			System.out.println("O aluno " + this.nome + " está atualmente estudando.");
		} else {
			System.out.println("O aluno " + this.nome + " não está estudando.");
		}
	}
}
