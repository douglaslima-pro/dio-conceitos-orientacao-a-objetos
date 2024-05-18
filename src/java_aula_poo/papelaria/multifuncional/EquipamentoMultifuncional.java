package java_aula_poo.papelaria.multifuncional;

import java_aula_poo.papelaria.copiadora.Copiadora;
import java_aula_poo.papelaria.digitalizadora.Digitalizadora;
import java_aula_poo.papelaria.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	public void info() {
		System.out.println("Equipamento multifuncional");
	}

	public void copiar() {
		System.out.println("COPIANDO PELO EQUIPAMENTO MULTIFUNCIONAL");
	}

	public void digitalizar() {
		System.out.println("DIGITALIZANDO PELO EQUIPAMENTO MULTIFUNCIONAL");
	}

	public void imprimir() {
		System.out.println("IMPRIMINDO PELO EQUIPAMENTO MULTIFUNCIONAL");
	}
}
