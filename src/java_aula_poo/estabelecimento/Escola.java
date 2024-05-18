package java_aula_poo.estabelecimento;

import java_aula_poo.escola.aluno.Aluno;
import java_aula_poo.escola.professor.Professor;

public class Escola {

	public static void main(String[] args) {
		Professor fernando = new Professor("Fernando de Araújo", "matemática");
		Aluno elizabeth = new Aluno("Elizabeth Ribeiro", "2378090", true);
		fernando.exibirInformacoes();
		fernando.fazer();
		System.out.println();
		elizabeth.exibirInformacoes();
		elizabeth.fazer();
		System.out.println();
	}
}