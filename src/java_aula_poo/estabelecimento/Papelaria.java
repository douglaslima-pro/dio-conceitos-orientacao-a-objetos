package java_aula_poo.estabelecimento;

import java_aula_poo.papelaria.copiadora.*;
import java_aula_poo.papelaria.digitalizadora.*;
import java_aula_poo.papelaria.impressora.*;
import java_aula_poo.papelaria.multifuncional.*;

public class Papelaria {

	public static void main(String[] args) {
		Copiadora xerox = new Xerox();
		xerox.info();
		xerox.copiar();
		System.out.println();

		Digitalizadora scanner = new Scanner();
		scanner.info();
		scanner.digitalizar();
		System.out.println();

		Impressora hp = new HP();
		hp.info();
		hp.imprimir();
		System.out.println();

		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		em.info();
		em.copiar();
		em.digitalizar();
		em.imprimir();
		System.out.println();

		Copiadora copiadora = em;
		copiadora.info();
		copiadora.copiar();
		System.out.println();

		Digitalizadora digitalizadora = em;
		digitalizadora.info();
		digitalizadora.digitalizar();
		System.out.println();

		Impressora impressora = em;
		impressora.info();
		impressora.imprimir();
		System.out.println();
	}
}
