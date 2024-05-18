package java_aula_poo.papelaria.digitalizadora;

/**
 * <p>
 * Interface do tipo {@code Digitalizadora}. Interfaces são implementadas por
 * outras classes usando a palavra-chave <em>implements</em>.
 * </p>
 * <p>
 * <strong>Observação:</strong> Interfaces não podem ser usadas para criar
 * objetos e nem extendidas por subclasses. Por padrão todos os métodos da
 * interface são <em>public</em> e <em>abstract</em>.
 * </p>
 */
public interface Digitalizadora {

	void info();

	void digitalizar();
}
