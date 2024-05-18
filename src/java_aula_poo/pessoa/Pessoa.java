package java_aula_poo.pessoa;

/**
 * <p>
 * Classe abstrata do tipo {@code Pessoa}. Classes abstratas são usadas para
 * compartilhar atributos e métodos comuns com suas sub-classes. Uma classe
 * abstrata pode ser herdada por outra classe usando a palavra-chave
 * <em>extends</em>.
 * </p>
 * <p>
 * <strong>Observação:</strong> Classes abstratas não podem ser usadas para
 * criar objetos e, por isso, não possuem método construtor.
 * </p>
 */
public abstract class Pessoa {

	protected String nome;

	protected void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
	}

	protected abstract void fazer();
}
