package br.com.alura.escola.academico.dominio.aluno;

import java.util.Objects;

import br.com.alura.escola.shared.dominio.Cpf;

public class FabricaDeAluno {

	private Aluno aluno;
	
	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		aluno = new Aluno(new Cpf(cpf), nome, new Email(email));
		return this;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		if(Objects.isNull(aluno)) {
			throw new NullPointerException();
		}
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return aluno;
	}
	
}
