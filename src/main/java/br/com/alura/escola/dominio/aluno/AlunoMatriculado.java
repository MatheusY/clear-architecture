package br.com.alura.escola.dominio.aluno;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.Evento;

public class AlunoMatriculado implements Evento {
	
	private final Cpf cpfDoAluno;
	private final LocalDateTime momento;

	public AlunoMatriculado(Cpf cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return momento;
	}

	public Cpf getCpfDoAluno() {
		return cpfDoAluno;
	}

}
